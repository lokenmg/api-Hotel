/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.APIHotel.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author wbpat
 */
@Entity
@Table(name = "Tipo_dispositivo")
public class TipoDispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_dis")
    private int id_tipo_dis;
    
    @Column(name = "nombre")
    private String nombre;
    
    @OneToOne(mappedBy="tipo_dispositivo")
    private Dispositivo dispositivo;

    public int getId_tipo_dis() {
        return id_tipo_dis;
    }

    public void setId_tipo_dis(int id_tipo_dis) {
        this.id_tipo_dis = id_tipo_dis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
