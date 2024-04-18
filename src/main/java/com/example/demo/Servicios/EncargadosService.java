package com.example.demo.Servicios;

import com.example.demo.Models.Encargados;
import com.example.demo.Repositorios.EncargadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EncargadosService  {
    private final EncargadosRepository encargadosRepository;

    @Autowired
    public EncargadosService(EncargadosRepository encargadosRepository) {
        this.encargadosRepository = encargadosRepository;
    }

    public Encargados createEncargado(Encargados encargado) {
        return encargadosRepository.save(encargado);
    }

    public List<Encargados> getAllEncargados() {
        return (List<Encargados>) encargadosRepository.findAll();
    }

    public Optional<Encargados> getEncargadoById(Integer id) {
        return encargadosRepository.findById(id);
    }

    public Encargados updateEncargado(Integer id, Encargados updatedEncargado) {
        Encargados encargado = getEncargadoById(id)
                .orElseThrow(() -> new IllegalArgumentException("Encargado not found"));
        encargado.setNom_enc(updatedEncargado.getNom_enc());
        encargado.setApe_enc(updatedEncargado.getApe_enc());
        encargado.setTelefono_enc(updatedEncargado.getTelefono_enc());
        encargado.setCorreo_enc(updatedEncargado.getCorreo_enc());
        return encargadosRepository.save(encargado);
    }

    public void deleteEncargado(Integer id) {
        encargadosRepository.deleteById(id);
    }

    public void deleteAllEncargados() {
        encargadosRepository.deleteAll();
    }
}
