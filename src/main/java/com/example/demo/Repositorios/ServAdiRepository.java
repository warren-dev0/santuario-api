package com.example.demo.Repositorios;

import com.example.demo.Models.ServiciosAdicionales;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServAdiRepository extends CrudRepository<ServiciosAdicionales, Integer> {
}
