/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

/**
 *
 * @author Pe&Ge
 */
public class Servicio {
    private int idServicio;
    private String codigo;
    private String descripcion;
    private double costo;

    public Servicio() {
    }

    public Servicio(String codigo, String Descripcion, double costo) {
        this.codigo = codigo;
        this.descripcion = Descripcion;
        this.costo = costo;
    }

    public Servicio(int idServicio, String codigo, String Descripcion, double costo) {
        this.idServicio = idServicio;
        this.codigo = codigo;
        this.descripcion = Descripcion;
        this.costo = costo;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public String toString(){
        return idServicio + " - " + codigo + " - " + descripcion;
    }
    
}
