package com.example.demo.Servicios;

import com.example.demo.Models.Users;
import com.example.demo.Repositorios.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public Iterable<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getUserById(Integer id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    public Users updateUser(Integer id, Users updatedUser) {
        Users user = getUserById(id);
        user.setNom_usuario(updatedUser.getNom_usuario());
        user.setApe_usuario(updatedUser.getApe_usuario());
        user.setPass_usuario(updatedUser.getPass_usuario());
        user.setEmail_usuario(updatedUser.getEmail_usuario());
        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}

