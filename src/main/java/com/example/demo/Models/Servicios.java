package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "servicios")
public class Servicios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Servicios() {
    }

    @Column(name = "desc_serv", nullable = false, unique = true)
    private String desc_serv;



    public Servicios(Integer id, String desc_serv, Categoria categoria) {
        this.id = id;
        this.desc_serv = desc_serv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc_serv() {
        return desc_serv;
    }

    public void setDesc_serv(String desc_serv) {
        this.desc_serv = desc_serv;
    }


}