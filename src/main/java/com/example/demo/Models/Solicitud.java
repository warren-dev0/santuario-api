package com.example.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "solicitud")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_solicitud", nullable = false)
    private Integer id_solicitud;

    @ManyToOne
    @JoinColumn(name = "users_id_user")
    private Users id_users;

    @Column(name = "nom_pac", nullable = false)
    private String nom_pac;

    @Column(name = "ape_pac", nullable = false)
    private String ape_pac;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fecha_nacimiento;
    @Column(name = "genero_paciente", nullable = false)
    private String genero_paciente;

    @Column(name = "nacionalidad_paciente", nullable = false)
    private String nacionalidad_paciente;

    @Column(name = "forma_pago", nullable = false)
    private String forma_pago;

    @ManyToOne
    @JoinColumn(name = "encargados_id_enc")
    private Encargados encargados;

    public Solicitud() {
    }

    public Solicitud(Integer id_solicitud, Users id_users, String nom_pac, String ape_pac, Date fecha_nacimiento, String genero_paciente, String nacionalidad_paciente, String forma_pago) {
        this.id_solicitud = id_solicitud;
        this.id_users = id_users;
        this.nom_pac = nom_pac;
        this.ape_pac = ape_pac;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero_paciente = genero_paciente;
        this.nacionalidad_paciente = nacionalidad_paciente;
        this.forma_pago = forma_pago;
    }

    public Integer getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(Integer id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public Users getId_users() {
        return id_users;
    }

    public void setId_users(Users id_users) {
        this.id_users = id_users;
    }

    public String getNom_pac() {
        return nom_pac;
    }

    public void setNom_pac(String nom_pac) {
        this.nom_pac = nom_pac;
    }

    public String getApe_pac() {
        return ape_pac;
    }

    public void setApe_pac(String ape_pac) {
        this.ape_pac = ape_pac;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero_paciente() {
        return genero_paciente;
    }

    public void setGenero_paciente(String genero_paciente) {
        this.genero_paciente = genero_paciente;
    }

    public String getNacionalidad_paciente() {
        return nacionalidad_paciente;
    }

    public void setNacionalidad_paciente(String nacionalidad_paciente) {
        this.nacionalidad_paciente = nacionalidad_paciente;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

}