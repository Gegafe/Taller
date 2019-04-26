/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pe&Ge
 */
public class AparatoData {
    private Connection con;
    private Conexion cx;

    public AparatoData(Conexion conexion) {
        try {
            cx = conexion;
            con = cx.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexión de aparato: " + ex);
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void altaAparato(Aparato aparato){
        String sql = "INSERT INTO aparato (IdCliente, NroSerie, TipoAparato, FIngreso, FEgreso) VALUES (?, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, aparato.getDuenio().getIdCliente());
            ps.setString(2, aparato.getNroSerie());
            ps.setString(3, aparato.getTipoAparato());
            ps.setDate(4, Date.valueOf(aparato.getfIngreso()));
            ps.setDate(5, Date.valueOf(aparato.getfEgreso()));
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                aparato.setIdAparato(rs.getInt(1));
            }else{
                System.out.println("No se pudo obtener el id luego de insertar el registro");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bajaAparato(int idAparato){
        String sql = "DELETE FROM aparato WHERE IdAparato = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAparato);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarAparato(Aparato aparato){
        String sql = "UPDATE aparato SET IdCliente = ?, NroSerie = ?, TipoAparato = ?, FIngreso = ?, FEgreso = ? WHERE IdAparato = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, aparato.getDuenio().getIdCliente());
            ps.setString(2, aparato.getNroSerie());
            ps.setString(3, aparato.getTipoAparato());
            ps.setDate(4, Date.valueOf(aparato.getfIngreso()));
            ps.setDate(5, Date.valueOf(aparato.getfEgreso()));
            ps.setInt(6, aparato.getIdAparato());
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Cliente buscarCliente(int idCliente){
        ClienteData cd = new ClienteData(cx);
        return cd.obtenerCliente(idCliente);
    }
    
    public Aparato obtenerAparato(int idAparato){
        String sql = "SELECT * FROM aparato WHERE IdAparato = ?;";
        Aparato a = new Aparato();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAparato);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente c = buscarCliente(rs.getInt("IdCliente"));
                a.setDuenio(c);
                a.setIdAparato(rs.getInt("IdAparato"));
                a.setNroSerie(rs.getString("NroSerie"));
                a.setTipoAparato(rs.getString("TipoAparato"));
                a.setfIngreso(rs.getDate("FIngreso").toLocalDate());
                a.setfEgreso(rs.getDate("FEgreso").toLocalDate());                
                
            } else {
                System.out.println("No se pudo obtener el registro");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public List<Aparato> obtenerListaDeAparatos(){
        String sql = "SELECT * FROM aparato;";
        List<Aparato> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            Aparato a;
            while (rs.next()) {                
                a = new Aparato();
                Cliente c = buscarCliente(rs.getInt("IdCliente"));
                a.setDuenio(c);
                a.setIdAparato(rs.getInt("IdAparato"));
                a.setNroSerie(rs.getString("NroSerie"));
                a.setTipoAparato(rs.getString("TipoAparato"));
                a.setfIngreso(rs.getDate("FIngreso").toLocalDate());
                a.setfEgreso(rs.getDate("FEgreso").toLocalDate());
                
                lista.add(a);
            }
            ps.close();

            
        } catch (SQLException ex) {
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public List<Aparato> obtenerAparatosReparados(){
        List<Aparato> listaAparato = new ArrayList<>();
        List<Reparacion> listaReparacion;
        ReparacionData rd = new ReparacionData(cx);
        listaReparacion = rd.obtenerListaDeReparacion();
        
        for (Reparacion reparacion : listaReparacion) {
            if (reparacion.getEstado()) {
                listaAparato.add(reparacion.getAparato());
            }
        }
        
        return listaAparato;
    }
    
    public List<Aparato> obtenerAparatosSinReparar(){
        List<Aparato> listaAparato = new ArrayList<>();
        List<Reparacion> listaReparacion;
        ReparacionData rd = new ReparacionData(cx);
        listaReparacion = rd.obtenerListaDeReparacion();
        
        for (Reparacion reparacion : listaReparacion) {
            if (!reparacion.getEstado()) {
                listaAparato.add(reparacion.getAparato());
            }
        }
        
        return listaAparato;
    }
    
    public List<Aparato> obtenerAparatosXDuenio(int idCliente){
        String sql = "SELECT * FROM aparato WHERE IdCliente = ?;";
        List<Aparato> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            
            ResultSet rs = ps.executeQuery();
            
            Aparato a;
            ClienteData cd = new ClienteData(cx);
            while (rs.next()) {                
                a = new Aparato();
                a.setDuenio(cd.obtenerCliente(rs.getInt("IdCliente")));
                a.setIdAparato( rs.getInt("IdAparato"));
                a.setNroSerie(rs.getString("NroSerie"));
                a.setTipoAparato(rs.getString("TipoAparato"));
                a.setfEgreso(rs.getDate("FEgreso").toLocalDate());
                a.setfIngreso(rs.getDate("FIngreso").toLocalDate());
                
                lista.add(a);                
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
     public List<Aparato> obtenerAparatosXServicio(int idServicio){
        List<Aparato> listaAparato = new ArrayList<>();
        List<Reparacion> listaReparacion;
        ReparacionData rd = new ReparacionData(cx);
        listaReparacion = rd.obtenerListaDeReparacion();
        
        for (Reparacion reparacion : listaReparacion) {
            if (reparacion.getServicio().getIdServicio() == idServicio) {
                listaAparato.add(reparacion.getAparato());
            }
        }        
        return listaAparato;
    }
     
    public List<Aparato> obtenerAparatosXFecha(LocalDate fechaIngreso){
        List<Aparato> listaCompleta = obtenerListaDeAparatos();
        List<Aparato> listaXFecha = new ArrayList<>();
        for (Aparato aparato : listaCompleta) {
            if (aparato.getfIngreso().equals(fechaIngreso)) {
                listaXFecha.add(aparato);
            }
        }        
        return listaXFecha;
    }
    
}
