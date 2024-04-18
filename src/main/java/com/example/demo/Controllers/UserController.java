package com.example.demo.Controllers;


import com.example.demo.Models.Users;
import com.example.demo.Servicios.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")

public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        Iterable<Users> users = userService.getAllUsers();
        if (users == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuarios no encontrados");
        } else {
            return ResponseEntity.ok(users);
        }
    }
    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id) {
        return userService.getUserById(Math.toIntExact(id));
    }

    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Integer id, @RequestBody Users updatedUser) {
        return userService.updateUser(id, updatedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
