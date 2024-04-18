package com.example.demo.Servicios;

import com.example.demo.Models.Solicitud;
import com.example.demo.Repositorios.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SolicitudService  {
    @Autowired
    private SolicitudRepository solicitudRepository;

    public Iterable<Solicitud> getAllSolicitudes() {
        return solicitudRepository.findAll();
    }

    public Optional<Solicitud> getSolicitudById(Integer id) {
        return solicitudRepository.findById(id);
    }

    public Solicitud saveSolicitud(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }

    public void deleteSolicitud(Integer id) {
        solicitudRepository.deleteById(id);
    }
}
