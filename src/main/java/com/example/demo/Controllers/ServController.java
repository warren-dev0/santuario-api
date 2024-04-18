package com.example.demo.Controllers;

import com.example.demo.Models.Servicios;
import com.example.demo.Servicios.ServService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/servicios")

public class ServController {
    @Autowired
    private ServService serviciosService;

    @GetMapping
    public Iterable<Servicios> getAllServicios() {
        return serviciosService.getAllServicios();
    }

    @GetMapping("/{id}")
    public Optional<Servicios> getServicioById(@PathVariable Integer id) {
        return serviciosService.getServicioById(id);
    }

    @PostMapping("/agregar")
    public Servicios createServicio(@RequestBody Servicios servicio) {
        return serviciosService.saveServicio(servicio);
    }

    @DeleteMapping("/{id}")
    public void deleteServicio(@PathVariable Integer id) {
        serviciosService.deleteServicio(id);
    }
}
