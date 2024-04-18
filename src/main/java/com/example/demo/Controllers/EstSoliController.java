package com.example.demo.Controllers;

import com.example.demo.Models.Estado_solicitud;
import com.example.demo.Servicios.EstSoliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/estadosolicitud")
public class EstSoliController {
    private final EstSoliService estadoSolicitudService;

    @Autowired
    public EstSoliController(EstSoliService estadoSolicitudService) {
        this.estadoSolicitudService = estadoSolicitudService;
    }

    @PostMapping("/agregar")
    public Estado_solicitud createEstadoSolicitud(@RequestBody Estado_solicitud estadoSolicitud) {
        return estadoSolicitudService.saveEstadoSolicitud(estadoSolicitud);
    }

    @GetMapping("/{id}")
    public Optional<Estado_solicitud> getEstadoSolicitudById(@PathVariable("id") Integer id) {
        return estadoSolicitudService.getEstadoSolicitudById(id);
    }

    @GetMapping
    public Iterable<Estado_solicitud> getAllEstadoSolicitudes() {
        return estadoSolicitudService.getAllEstadoSolicitudes();
    }

    @PutMapping("/actualizar/{id}")
    public Estado_solicitud updateEstadoSolicitud(@PathVariable("id") Integer id, @RequestBody Estado_solicitud estadoSolicitud) {
        return estadoSolicitudService.updateEstadoSolicitud(id, estadoSolicitud);
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteEstadoSolicitud(@PathVariable("id") Integer id) {
        estadoSolicitudService.deleteEstadoSolicitud(id);
    }

}
