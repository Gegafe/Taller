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
import javax.swing.JComboBox;
import taller.modelo.Aparato;
import taller.modelo.AparatoData;
import taller.modelo.Conexion;
import taller.modelo.Reparacion;
import taller.modelo.ReparacionData;
import taller.modelo.Servicio;
import taller.modelo.ServicioData;

/**
 *
 * @author User
 */
public class ReparacionView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReparacionView
     */
    public ReparacionView() {
        initComponents();
        CargarComboAparatos();
        CargarComboServicios();
        cbAparato.setSelectedIndex(-1);
        cbServicio.setSelectedIndex(-1);
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
        txId = new javax.swing.JTextField();
        cbAparato = new javax.swing.JComboBox<>();
        cbServicio = new javax.swing.JComboBox<>();
        dtFechaReparacion = new com.toedter.calendar.JDateChooser();
        chkEstado = new javax.swing.JCheckBox();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reparaciones");
        jLabel1.setToolTipText("");

        jLabel2.setText("Id:");

        jLabel3.setText("Aparato:");

        jLabel4.setText("Servicio:");

        jLabel5.setText("Fecha Reparación:");

        jLabel6.setText("Estado:");

        chkEstado.setText("Sin Reparar");
        chkEstado.setToolTipText("");
        chkEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkEstadoMouseClicked(evt);
            }
        });

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                    .addComponent(btnBuscar))
                                .addComponent(cbAparato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dtFechaReparacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(chkEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addContainerGap(46, Short.MAX_VALUE))
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2))
                                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbAparato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(cbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(dtFechaReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(chkEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CargarComboAparatos(){
        try {
            Conexion con = new Conexion();
            AparatoData ad = new AparatoData(con);
            ArrayList<Aparato> listaAparatos = (ArrayList)ad.obtenerListaDeAparatos();
            
            for(Aparato aparato:listaAparatos){
                cbAparato.addItem(aparato);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReparacionView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void CargarComboServicios(){
        try {
            Conexion con = new Conexion();
            ServicioData sd = new ServicioData(con);
            ArrayList<Servicio> listaServicios = (ArrayList) sd.obtenerListaDeServicios();
            
            for (Servicio servicio : listaServicios) {
                cbServicio.addItem(servicio);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReparacionView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void SeleccionarIndiceComboAparato(int id){
        int indice= -1;
        for (int i = 0; i < cbAparato.getItemCount(); i++) {
            if (cbAparato.getItemAt(i).getIdAparato() == id) {
                indice = i;
            }
        }
        cbAparato.setSelectedIndex(indice);
    }
    
    private void SeleccionarIndiceComboServicio(int id){
        int indice= -1;
        for (int i = 0; i < cbServicio.getItemCount(); i++) {
            if (cbServicio.getItemAt(i).getIdServicio() == id) {
                indice = i;
            }
        }
        cbServicio.setSelectedIndex(indice);
    }
    
    private LocalDate ConvierteFecha(java.util.Date fecha){
        return fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
        
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txId.setText("");
        cbAparato.setSelectedIndex(-1);
        cbServicio.setSelectedIndex(-1);
        dtFechaReparacion.setDate(null);
        chkEstado.setText("Sin Reparar");
        chkEstado.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void chkEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkEstadoMouseClicked
        // TODO add your handling code here:
        if (chkEstado.isSelected()) {
            chkEstado.setText("Reparado");
        } else {
            chkEstado.setText("Sin Reparar");
        }
    }//GEN-LAST:event_chkEstadoMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            int id = Integer.parseInt(txId.getText());
            Conexion con = new Conexion();
            ReparacionData rd = new ReparacionData(con);
            Reparacion rep = rd.obtenerReparacion(id);
            
            SeleccionarIndiceComboAparato(rep.getAparato().getIdAparato());
            SeleccionarIndiceComboServicio(rep.getServicio().getIdServicio());
            
            dtFechaReparacion.setDate(Date.valueOf(rep.getFechaReparacion()));
            chkEstado.setSelected(rep.getEstado());
            if (rep.getEstado()) {
                chkEstado.setText("Reparado");
            } else {
                chkEstado.setText("Sin Reparar");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReparacionView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            Aparato ap = (Aparato) cbAparato.getSelectedItem();
            Servicio ser = (Servicio) cbServicio.getSelectedItem();
            LocalDate fecReparacion = ConvierteFecha(dtFechaReparacion.getDate());
            boolean estado = chkEstado.isSelected();
            
            Reparacion rep = new Reparacion(ap, ser, fecReparacion, estado);
            Conexion con = new Conexion ();
            ReparacionData rd = new ReparacionData(con);
            rd.altaReparacion(rep);
            
            txId.setText(String.valueOf(rep.getIdReparacion()));
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReparacionView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            int id = Integer.parseInt(txId.getText());
            Aparato ap = (Aparato) cbAparato.getSelectedItem();
            Servicio ser = (Servicio) cbServicio.getSelectedItem();
            LocalDate fecReparacion = ConvierteFecha(dtFechaReparacion.getDate());
            boolean estado = chkEstado.isSelected();
            
            Reparacion rep = new Reparacion(id, ap, ser, fecReparacion, estado);
            Conexion con = new Conexion ();
            ReparacionData rd = new ReparacionData(con);
            rd.modificarReparacion(rep);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReparacionView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int id = Integer.parseInt(txId.getText());
            
            Conexion con = new Conexion();
            ReparacionData rd = new ReparacionData(con);
            rd.bajaReparacion(id);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReparacionView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

// <editor-fold defaultstate="collapsed" desc="Variables declaration - do not modify">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Aparato> cbAparato;
    private javax.swing.JComboBox<Servicio> cbServicio;
    javax.swing.JCheckBox chkEstado;
    private com.toedter.calendar.JDateChooser dtFechaReparacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txId;
    // End of variables declaration//GEN-END:variables
// </editor-fold> 
}
