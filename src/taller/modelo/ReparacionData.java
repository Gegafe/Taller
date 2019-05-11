/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pe&Ge
 */
public class ReparacionData {
    private Connection con;
    private Conexion cx;

    public ReparacionData(Conexion conexion) {
        try {
            cx = conexion;
            con = cx.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexión de aparato: " + ex);
            Logger.getLogger(AparatoData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void altaReparacion(Reparacion rep){
        String sql = "INSERT INTO reparacion (IdAparato, IdServicio, FechaReparacion, Estado) VALUES (?, ?, ?, ?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, rep.getAparato().getIdAparato());
            ps.setInt(2, rep.getServicio().getIdServicio());
            ps.setDate(3, Date.valueOf(rep.getFechaReparacion()));
            ps.setBoolean(4, rep.getEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                rep.setIdReparacion(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el registro");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bajaReparacion(int idReparacion){
        String sql = "DELETE FROM reparacion WHERE IdReparacion = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReparacion);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarReparacion(Reparacion rep){
        String sql = "UPDATE reparacion SET IdAparato = ?, IdServicio = ?, FechaReparacion = ?, Estado = ? WHERE IdReparacion = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rep.getAparato().getIdAparato());
            ps.setInt(2, rep.getServicio().getIdServicio());
            ps.setDate(3, Date.valueOf(rep.getFechaReparacion()));
            ps.setBoolean(4, rep.getEstado());
            ps.setInt(5 , rep.getIdReparacion());
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Aparato obtenerAparato(int idAparato){
        AparatoData ad = new AparatoData(cx);
        return ad.obtenerAparato(idAparato);
    }
    
    public Servicio obtenerServicio(int idServicio){
        ServicioData sd = new ServicioData(cx);
        return sd.obtenerServicio(idServicio);
    }
    
    public Reparacion obtenerReparacion(int idReparacion){
        String sql = "SELECT * FROM reparacion WHERE IdReparacion = ?;";
        Reparacion rep = new Reparacion();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReparacion);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                rep.setAparato(obtenerAparato(rs.getInt("IdAparato")));
                rep.setEstado(rs.getBoolean("Estado"));
                rep.setFechaReparacion(rs.getDate("FechaReparacion").toLocalDate());
                rep.setIdReparacion(rs.getInt("IdReparacion"));
                rep.setServicio(obtenerServicio(rs.getInt("IdServicio")));
                
            } 
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rep;
    }
    
    public List<Reparacion> obtenerListaDeReparacion(){
        String sql = "SELECT * FROM reparacion;";
        List<Reparacion> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            Reparacion r;
            while (rs.next()) {                
                r = new Reparacion();
                r.setAparato(obtenerAparato(rs.getInt("IdAparato")));
                r.setEstado(rs.getBoolean("Estado"));
                r.setFechaReparacion(rs.getDate("FechaReparacion").toLocalDate());
                r.setIdReparacion(rs.getInt("IdReparacion"));
                r.setServicio(obtenerServicio(rs.getInt("IdServicio")));
                
                lista.add(r);
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ReparacionData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
