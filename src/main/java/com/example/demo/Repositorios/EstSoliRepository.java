package com.example.demo.Repositorios;

import com.example.demo.Models.Estado_solicitud;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstSoliRepository extends CrudRepository<Estado_solicitud, Integer> {
}
