package com.example.demo.Repositorios;

import com.example.demo.Models.Encargados;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncargadosRepository extends CrudRepository<Encargados, Integer> {

}
