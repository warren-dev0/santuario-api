package com.example.demo.Repositorios;

import com.example.demo.Models.Solicitud;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends CrudRepository<Solicitud, Integer> {

}
