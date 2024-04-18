package com.example.demo.Servicios;

import com.example.demo.Models.ServiciosAdicionales;
import com.example.demo.Repositorios.ServAdiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServAdiService {
    @Autowired
    private ServAdiRepository serviciosAdicionalesRepository;

    public ServiciosAdicionales saveServicioAdicional(ServiciosAdicionales servicioAdicional) {
        return serviciosAdicionalesRepository.save(servicioAdicional);
    }

    public Iterable<ServiciosAdicionales> getAllServiciosAdicionales() {
        return serviciosAdicionalesRepository.findAll();
    }

    public Optional<ServiciosAdicionales> getServicioAdicionalById(Integer id) {
        return serviciosAdicionalesRepository.findById(id);
    }

    public void deleteServicioAdicional(Integer id) {
        serviciosAdicionalesRepository.deleteById(id);
    }

    public ServiciosAdicionales updateServicioAdicional(Integer id, ServiciosAdicionales servicioAdicional) {
        if (serviciosAdicionalesRepository.existsById(id)) {
            servicioAdicional.setId(id);
            return serviciosAdicionalesRepository.save(servicioAdicional);
        }
        return null; // or throw exception if needed
    }

}
