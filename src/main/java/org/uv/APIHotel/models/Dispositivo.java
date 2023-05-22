/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.APIHotel.models;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ip_dispositivo")
    private String ip_dispositivo;
    
    @Column(name = "tipo_dis")
    private String tipo_dis;
    
    @Column(name = "hora")
    private Time hora;
    
    @Column(name = "fecha")
    private Date fecha;
    
    @Column(name = "estado_dis")
    private boolean estado_dis;
    
    @Column(name = "ultimavezactivo")
    private Time  ultimavezactivo;
    
    @ManyToOne
    @JoinColumn(name="habitacion_dispositivo", nullable=false)
    private Habitaciones habitacion;
    
    public String getId_dispositivo() {
        return ip_dispositivo;
    }

    public void setIp_dispositivo(String ip_dispositivo) {
        this.ip_dispositivo = ip_dispositivo;
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

    public String getTipo_dis() {
        return tipo_dis;
    }

    public void setTipo_dis(String tipo_dis) {
        this.tipo_dis = tipo_dis;
    }

    public Habitaciones getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitaciones habitacion) {
        this.habitacion = habitacion;
    }
    
}
