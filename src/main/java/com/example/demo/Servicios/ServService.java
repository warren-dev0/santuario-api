package com.example.demo.Servicios;

import com.example.demo.Models.Servicios;
import com.example.demo.Repositorios.ServiciosRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public  class ServService  {
    @Autowired
    private ServiciosRepository serviciosRepository;

    public Iterable<Servicios> getAllServicios() {
        return serviciosRepository.findAll();
    }

    public Optional<Servicios> getServicioById(Integer id) {
        return serviciosRepository.findById(id);
    }

    public Servicios saveServicio(Servicios servicio) {
        return serviciosRepository.save(servicio);
    }

    public void deleteServicio(Integer id) {
        serviciosRepository.deleteById(id);
    }
}
