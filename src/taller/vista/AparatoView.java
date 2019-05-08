/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.vista;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import taller.modelo.Aparato;
import taller.modelo.AparatoData;
import taller.modelo.Cliente;
import taller.modelo.ClienteData;
import taller.modelo.Conexion;

/**
 *
 * @author User
 */
public class AparatoView extends javax.swing.JInternalFrame {
    ArrayList<Cliente> listaCliente;
    
    /**
     * Creates new form AparatoView
     */
    public AparatoView() {
        initComponents();
            
        listaCliente = ObtenerListaClientes();
        CargaComboCliente();
        cbCliente.setSelectedIndex(-1);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txId = new javax.swing.JTextField();
        txNroSerie = new javax.swing.JTextField();
        txTipoAparato = new javax.swing.JTextField();
        dtFechaIngreso = new com.toedter.calendar.JDateChooser();
        dtFechaSalida = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        cbCliente = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Aparatos");

        jLabel2.setText("Id:");

        jLabel3.setText("Ciente:");

        jLabel4.setText("Nro. de Serie:");

        jLabel5.setText("Tipo de Aparato:");

        jLabel6.setText("Fecha de Ingreso:");

        jLabel7.setText("Fecha de Salida:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNroSerie)
                    .addComponent(dtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtFechaSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txTipoAparato)
                    .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnBuscar))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addComponent(txNroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(txTipoAparato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(dtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(dtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<Cliente> ObtenerListaClientes(){
        ClienteData cd;
        Conexion con;
        ArrayList<Cliente> cliente = new ArrayList<>();
        try {
            con = new Conexion();
            cd = new ClienteData(con);
            cliente = (ArrayList)cd.obtenerListaDeClientes();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AparatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
    } 
    
    private void CargaComboCliente(){
        for (Cliente cliente : listaCliente) {
            cbCliente.addItem(cliente);
        }
    }
    
    private LocalDate ConvierteFecha(java.util.Date fecha){
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
    private int ObtenerClienteCombo(Cliente cliente){
        int indiceCombo = -1;
        for (int i = 0; i < cbCliente.getItemCount(); i++) {
            if (cbCliente.getItemAt(i).getIdCliente() == cliente.getIdCliente()) {
                indiceCombo = i;
            }
        }
        return indiceCombo;
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int id = Integer.parseInt(txId.getText());
        Aparato aparato;
        
        try {        
            Conexion con = new Conexion();
            AparatoData ad = new AparatoData(con);
            
            aparato = ad.obtenerAparato(id);
            //Limpia el registro
            btnLimpiarActionPerformed(evt);
            
            txId.setText(String.valueOf(id));
            cbCliente.setSelectedIndex(ObtenerClienteCombo(aparato.getDuenio()));
            txNroSerie.setText(aparato.getNroSerie());
            txTipoAparato.setText(aparato.getTipoAparato());
            dtFechaIngreso.setDate(Date.valueOf(aparato.getfIngreso()));
            dtFechaSalida.setDate(Date.valueOf(aparato.getfEgreso()));
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AparatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txId.setText("");
        cbCliente.setSelectedIndex(-1);
        txNroSerie.setText("");
        txTipoAparato.setText("");
        dtFechaIngreso.setDate(null);
        dtFechaSalida.setDate(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            Cliente c = (Cliente)cbCliente.getSelectedItem();
            String nroSerie = txNroSerie.getText();
            String tipoAparato = txTipoAparato.getText();
            LocalDate fecIngreso = ConvierteFecha(dtFechaIngreso.getDate());
            LocalDate fecSalida = ConvierteFecha(dtFechaSalida.getDate());
            
            Aparato aparato = new Aparato(c, nroSerie, tipoAparato, fecIngreso, fecSalida);
            
            Conexion con = new Conexion();
            AparatoData ad = new AparatoData(con);
            
            ad.altaAparato(aparato);
            
            txId.setText(String.valueOf(aparato.getIdAparato()));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AparatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            int id = Integer.parseInt(txId.getText());
            Cliente cliente = (Cliente) cbCliente.getSelectedItem();
            String nroSerie = txNroSerie.getText();
            String tipoAparato = txTipoAparato.getText();
            LocalDate fecIngreso = ConvierteFecha(dtFechaIngreso.getDate());
            LocalDate fecSalida = ConvierteFecha(dtFechaSalida.getDate());
            
            Aparato aparato = new Aparato(id, cliente, nroSerie, tipoAparato, fecIngreso, fecSalida);
            
            Conexion con = new Conexion();
            AparatoData ad = new AparatoData(con);
            
            ad.modificarAparato(aparato);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AparatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int id = Integer.parseInt(txId.getText());
            
            Conexion con = new Conexion();
            AparatoData ad = new AparatoData(con);
            
            ad.bajaAparato(id);
            
            btnLimpiarActionPerformed(evt);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AparatoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Cliente> cbCliente;
    private com.toedter.calendar.JDateChooser dtFechaIngreso;
    private com.toedter.calendar.JDateChooser dtFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNroSerie;
    private javax.swing.JTextField txTipoAparato;
    // End of variables declaration//GEN-END:variables
}