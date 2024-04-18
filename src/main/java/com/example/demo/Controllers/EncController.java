package com.example.demo.Controllers;

import com.example.demo.Models.Encargados;
import com.example.demo.Servicios.EncargadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/encargados")
public class EncController {
    private final EncargadosService encargadosService;

    @Autowired
    public EncController(EncargadosService encargadoService) {
        this.encargadosService = encargadoService;
    }

    @PostMapping("/agregar")
    public ResponseEntity<Encargados> createEncargado(@RequestBody Encargados encargado) {
        Encargados newEncargado = encargadosService.createEncargado(encargado);
        return new ResponseEntity<>(newEncargado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Encargados>> getAllEncargados() {
        List<Encargados> encargados = encargadosService.getAllEncargados();
        return new ResponseEntity<>(encargados, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Encargados> getEncargadoById(@PathVariable Integer id) {
        Optional<Encargados> encargado = encargadosService.getEncargadoById(id);
        return encargado.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Encargados> updateEncargado(@PathVariable Integer id, @RequestBody Encargados updatedEncargado) {
        Encargados encargado = encargadosService.updateEncargado(id, updatedEncargado);
        return new ResponseEntity<>(encargado, HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Void> deleteEncargado(@PathVariable Integer id) {
        encargadosService.deleteEncargado(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
