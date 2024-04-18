package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categoria")

public class Categoria {
    @Id
    @Column(name = "id_categoria", unique = true)
    private int id_categoria;

    @Column(name = "desc_cat", nullable = false, unique = true)
    private String desc_cat;

    public Categoria() {
    }

    public Categoria(int id_categoria, String desc_cat) {
        this.id_categoria = id_categoria;
        this.desc_cat = desc_cat;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDesc_cat() {
        return desc_cat;
    }

    public void setDesc_cat(String desc_cat) {
        this.desc_cat = desc_cat;
    }
}