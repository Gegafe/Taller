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
public class ClienteData {
    private Connection con;
    
    public ClienteData(Conexion conexion){
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexión de cliente: " + ex);
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void altaCliente(Cliente cliente){
        String sql = "INSERT INTO cliente (Nombre, Dni, Domicilio, Telefono) VALUES (?, ?, ?, ?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDni());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar el registro");
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void bajaCliente(int idCliente){
        String sql = "DELETE FROM cliente WHERE IdCliente = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET Nombre = ?, Dni = ?, Domicilio = ?, Telefono = ? WHERE IdCliente = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getDni());
            ps.setString(3, cliente.getDomicilio());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getIdCliente());
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Cliente> obtenerListaDeClientes(){
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            Cliente c;
            while (rs.next()) {                
                c = new Cliente();
                c.setIdCliente(rs.getInt("IdCliente"));
                c.setNombre(rs.getString("Nombre"));
                c.setDni(rs.getString("Dni"));
                c.setDomicilio(rs.getString("Domicilio"));
                c.setTelefono(rs.getString("Telefono"));
                
                lista.add(c);
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Cliente obtenerCliente(int idCliente){
        Cliente c = new Cliente();
        String sql = "SELECT * FROM cliente WHERE IdCliente = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                c.setIdCliente(rs.getInt("IdCliente"));
                c.setNombre(rs.getString("Nombre"));
                c.setDni(rs.getString("Dni"));
                c.setDomicilio(rs.getString("Domicilio"));
                c.setTelefono(rs.getString("Telefono"));
            }
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
}
