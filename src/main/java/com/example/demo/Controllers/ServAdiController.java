package com.example.demo.Controllers;

import com.example.demo.Models.ServiciosAdicionales;
import com.example.demo.Servicios.ServAdiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/serviciosadicionales")

public class ServAdiController {
    @Autowired
    private ServAdiService serviciosAdicionalesService;

    @PostMapping("/agregar")
    public ServiciosAdicionales createServicioAdicional(@RequestBody ServiciosAdicionales servicioAdicional) {
        return serviciosAdicionalesService.saveServicioAdicional(servicioAdicional);
    }

    @GetMapping("/{id}")
    public Optional<ServiciosAdicionales> getServicioAdicionalById(@PathVariable("id") Integer id) {
        return serviciosAdicionalesService.getServicioAdicionalById(id);
    }

    @GetMapping
    public Iterable<ServiciosAdicionales> getAllServiciosAdicionales() {
        return serviciosAdicionalesService.getAllServiciosAdicionales();
    }

    @PutMapping("/actualizar/{id}")
    public ServiciosAdicionales updateServicioAdicional(@PathVariable("id") Integer id, @RequestBody ServiciosAdicionales servicioAdicional) {
        return serviciosAdicionalesService.updateServicioAdicional(id, servicioAdicional);
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteServicioAdicional(@PathVariable("id") Integer id) {
        serviciosAdicionalesService.deleteServicioAdicional(id);
    }
}
