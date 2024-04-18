package com.example.demo.Repositorios;


import com.example.demo.Models.Servicios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiciosRepository extends CrudRepository<Servicios, Integer> {

}
