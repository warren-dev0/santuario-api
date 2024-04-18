package com.example.demo.Repositorios;



import com.example.demo.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario
}
