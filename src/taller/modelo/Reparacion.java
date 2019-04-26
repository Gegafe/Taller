/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.time.LocalDate;

/**
 *
 * @author Pe&Ge
 */
public class Reparacion {
    private int idReparacion;
    private Aparato aparato;
    private Servicio servicio;
    private LocalDate fechaReparacion;
    private boolean estado;

    public Reparacion() {
    }

    public Reparacion(Aparato aparato, Servicio servicio, LocalDate fechaReparacion, boolean estado) {
        this.aparato = aparato;
        this.servicio = servicio;
        this.fechaReparacion = fechaReparacion;
        this.estado = estado;
    }

    public Reparacion(int idReparacion, Aparato aparato, Servicio servicio, LocalDate fechaReparacion, boolean estado) {
        this.idReparacion = idReparacion;
        this.aparato = aparato;
        this.servicio = servicio;
        this.fechaReparacion = fechaReparacion;
        this.estado = estado;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
    }

    public Aparato getAparato() {
        return aparato;
    }

    public void setAparato(Aparato aparato) {
        this.aparato = aparato;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public LocalDate getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(LocalDate fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
