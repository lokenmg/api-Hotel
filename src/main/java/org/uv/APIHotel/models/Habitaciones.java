/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.APIHotel.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author wbpat
 */
@Entity
@Table(name = "habitaciones")
public class Habitaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "n_habitacion")
    private int n_habitacion;
        
    @OneToMany(mappedBy="habitacion", fetch = FetchType.LAZY)
    private List<Dispositivo> ip_dispositivo;
    
    @OneToMany(mappedBy="habitacion", fetch = FetchType.LAZY)
    private List<EstadoHabitacion> id_estado;

    public Habitaciones() {
        ip_dispositivo = new ArrayList<>();
        id_estado = new ArrayList<>();
    }
    public int getN_habitacion() {
        return n_habitacion;
    }

    public void setN_habitacion(int n_habitacion) {
        this.n_habitacion = n_habitacion;
    }
   
}
