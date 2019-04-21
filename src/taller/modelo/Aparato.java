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
public class Aparato {
    private int idAparato;
    private Cliente duenio;
    private String nroSerie;
    private String tipoAparato;
    private LocalDate fIngreso;
    private LocalDate fEgreso;

    public Aparato() {
    }

    public Aparato(Cliente duenio, String nroSerie, String tipoAparato, LocalDate fIngreso, LocalDate fEgreso) {
        this.duenio = duenio;
        this.nroSerie = nroSerie;
        this.tipoAparato = tipoAparato;
        this.fIngreso = fIngreso;
        this.fEgreso = fEgreso;
    }

    public Aparato(int idAparato, Cliente duenio, String nroSerie, String tipoAparato, LocalDate fIngreso, LocalDate fEgreso) {
        this.idAparato = idAparato;
        this.duenio = duenio;
        this.nroSerie = nroSerie;
        this.tipoAparato = tipoAparato;
        this.fIngreso = fIngreso;
        this.fEgreso = fEgreso;
    }
    
    public int getIdAparato() {
        return idAparato;
    }

    public void setIdAparato(int idAparato) {
        this.idAparato = idAparato;
    }

    public Cliente getDuenio() {
        return duenio;
    }

    public void setDuenio(Cliente duenio) {
        this.duenio = duenio;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    public void setNroSerie(String nroSerie) {
        this.nroSerie = nroSerie;
    }

    public String getTipoAparato() {
        return tipoAparato;
    }

    public void setTipoAparato(String tipoAparato) {
        this.tipoAparato = tipoAparato;
    }

    
    
    public LocalDate getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(LocalDate fIngreso) {
        this.fIngreso = fIngreso;
    }

    public LocalDate getfEgreso() {
        return fEgreso;
    }

    public void setfEgreso(LocalDate fEgreso) {
        this.fEgreso = fEgreso;
    }
    
    
    
}
