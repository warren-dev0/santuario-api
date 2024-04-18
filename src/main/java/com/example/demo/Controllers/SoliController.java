package com.example.demo.Controllers;

import com.example.demo.Models.Solicitud;
import com.example.demo.Servicios.SolicitudService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/solicitud")

public class SoliController {
    @Autowired
    private SolicitudService solicitudService;

    @GetMapping
    public Iterable<Solicitud> getAllSolicitudes() {
        return solicitudService.getAllSolicitudes();
    }

    @GetMapping("/{id}")
    public Optional<Solicitud> getSolicitudById(@PathVariable Integer id) {
        return solicitudService.getSolicitudById(id);
    }

    @PostMapping("/agregar")
    public Solicitud createSolicitud(@RequestBody Solicitud solicitud) {
        return solicitudService.saveSolicitud(solicitud);
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteSolicitud(@PathVariable Integer id) {
        solicitudService.deleteSolicitud(id);
    }
}
