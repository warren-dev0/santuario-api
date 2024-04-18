package com.example.demo.Servicios;

import com.example.demo.Models.Categoria;
import com.example.demo.Repositorios.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> getAllCategorias() {
        return (List<Categoria>) categoriaRepository.findAll();
    }

    public Optional<Categoria> getCategoriaById(int id) {
        return categoriaRepository.findById(id);
    }

    public Categoria updateCategoria(int id, Categoria updatedCategoria) {
        Categoria categoria = getCategoriaById(id)
                .orElseThrow(() -> new IllegalArgumentException("Categoria not found"));
        categoria.setDesc_cat(updatedCategoria.getDesc_cat());
        return categoriaRepository.save(categoria);
    }

    public void deleteCategoria(int id) {
        categoriaRepository.deleteById(id);
    }}
