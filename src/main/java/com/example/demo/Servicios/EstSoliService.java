package com.example.demo.Servicios;

import com.example.demo.Models.Estado_solicitud;
import com.example.demo.Repositorios.EstSoliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstSoliService {
    private final EstSoliRepository estadoSolicitudRepository;

    @Autowired
    public EstSoliService(EstSoliRepository estSoliRepository) {
        this.estadoSolicitudRepository = estSoliRepository;
    }

    public Estado_solicitud saveEstadoSolicitud(Estado_solicitud estadoSolicitud) {
        return estadoSolicitudRepository.save(estadoSolicitud);
    }

    public Iterable<Estado_solicitud> getAllEstadoSolicitudes() {
        return estadoSolicitudRepository.findAll();
    }

    public Optional<Estado_solicitud> getEstadoSolicitudById(Integer id) {
        return estadoSolicitudRepository.findById(id);
    }

    public void deleteEstadoSolicitud(Integer id) {
        estadoSolicitudRepository.deleteById(id);
    }

    public Estado_solicitud updateEstadoSolicitud(Integer id, Estado_solicitud estadoSolicitud) {
        if (estadoSolicitudRepository.existsById(id)) {
            estadoSolicitud.setId(id);
            return estadoSolicitudRepository.save(estadoSolicitud);
        }
        return null; // or throw exception if needed
    }
}
