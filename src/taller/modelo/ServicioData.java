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
public class ServicioData {
    private Connection con;
    
    public ServicioData(Conexion conexion){
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexión de servicio: " + ex);
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void altaServicio(Servicio servicio){
        String sql = "INSERT INTO servicio (Codigo, Descripcion, Costo) VALUES (?, ?, ?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, servicio.getCodigo());
            ps.setString(2, servicio.getDescripcion());
            ps.setDouble(3, servicio.getCosto());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                 servicio.setIdServicio(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el registro");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void bajaServicio(int idServicio){
        String sql = "DELETE FROM servicio WHERE IdServicio = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idServicio);
            
            ps.executeUpdate();
            ps.close();            
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarServicio(Servicio servicio){
        String sql = "UPDATE servicio SET Codigo = ?, Descripcion = ?, Costo = ? WHERE IdServicio = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, servicio.getCodigo());
            ps.setString(2, servicio.getDescripcion());
            ps.setDouble(3, servicio.getCosto());
            ps.setInt(4, servicio.getIdServicio());
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Servicio obtenerServicio(int idServicio){
        String sql = "SELECT * FROM servicio WHERE IdServicio = ?;";
        Servicio s = new Servicio();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idServicio);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                s.setIdServicio(rs.getInt("IdServicio"));
                s.setCodigo(rs.getString("Codigo"));
                s.setCosto(rs.getDouble("Costo"));
                s.setDescripcion(rs.getString("Descripcion"));
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ServicioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    
    public List<Servicio> obtenerListaDeServicios(){
        String sql = "SELECT * FROM servicio;";
        List<Servicio> lista = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            Servicio s;
            while (rs.next()) {                
                s = new Servicio();
                s.setCodigo(rs.getString("Codigo"));
                s.setCosto(rs.getDouble("Costo"));
                s.setDescripcion(rs.getString("Descripcion"));
                s.setIdServicio(rs.getInt("IdServicio"));
                
                lista.add(s);
            }
            ps.close();
                           
        } catch (SQLException ex) {
            Logger.getLogger(ServicioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }    
    
}
