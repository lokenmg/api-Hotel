/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.APIHotel.models;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author wbpat
 */
@Entity
@Table(name = "dispositivos")
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_dispositivo")
    private String id_dispositivo;
    
    @Column(name = "id_tipo_dis")
    private int id_tipo_dis;
    
    @Column(name = "hora")
    private Time hora;
    
    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "estado_dis")
    private boolean estado_dis;
    
    @Column(name = "ultimavezactivo")
    private Time  ultimavezactivo;
    
    @OneToOne(mappedBy="dispositivo")

    public String getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(String id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    @Id
    public int getId_tipo_dis() {
        return id_tipo_dis;
    }

    public void setId_tipo_dis(int id_tipo_dis) {
        this.id_tipo_dis = id_tipo_dis;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado_dis() {
        return estado_dis;
    }

    public void setEstado_dis(boolean estado_dis) {
        this.estado_dis = estado_dis;
    }

    public Time getUltimavezactivo() {
        return ultimavezactivo;
    }

    public void setUltimavezactivo(Time ultimavezactivo) {
        this.ultimavezactivo = ultimavezactivo;
    }

        
}
