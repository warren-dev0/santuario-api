package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "encargados")
public class Encargados {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_enc", nullable = false)
    private Integer id_enc;

    @Column(name = "nom_enc", nullable = false)
    private String nom_enc;

    @Column(name = "ape_enc", nullable = false)
    private String ape_enc;

    @Column(name = "telefono_enc", nullable = false)
    private Integer telefono_enc;

    @Column(name = "correo_enc", nullable = false)
    private String correo_enc;

    public Encargados() {
    }

    public Encargados(Integer id_enc, String nom_enc, String ape_enc, Integer telefono_enc, String correo_enc) {
        this.id_enc = id_enc;
        this.nom_enc = nom_enc;
        this.ape_enc = ape_enc;
        this.telefono_enc = telefono_enc;
        this.correo_enc = correo_enc;
    }

    public Integer getId_enc() {
        return id_enc;
    }

    public void setId_enc(Integer id_enc) {
        this.id_enc = id_enc;
    }

    public String getNom_enc() {
        return nom_enc;
    }

    public void setNom_enc(String nom_enc) {
        this.nom_enc = nom_enc;
    }

    public String getApe_enc() {
        return ape_enc;
    }

    public void setApe_enc(String ape_enc) {
        this.ape_enc = ape_enc;
    }

    public Integer getTelefono_enc() {
        return telefono_enc;
    }

    public void setTelefono_enc(Integer telefono_enc) {
        this.telefono_enc = telefono_enc;
    }

    public String getCorreo_enc() {
        return correo_enc;
    }

    public void setCorreo_enc(String correo_enc) {
        this.correo_enc = correo_enc;
    }
}