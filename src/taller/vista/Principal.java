/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.vista;

/**
 *
 * @author User
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        subMenuSalir = new javax.swing.JMenuItem();
        menuClientes = new javax.swing.JMenu();
        subMenuFormClientes = new javax.swing.JMenuItem();
        menuAparatos = new javax.swing.JMenu();
        subMenuFormAparatos = new javax.swing.JMenuItem();
        menuServicios = new javax.swing.JMenu();
        subMenuFormServicios = new javax.swing.JMenuItem();
        menuReparacion = new javax.swing.JMenu();
        subMenuFormReparacion = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");

        subMenuSalir.setMnemonic('A');
        subMenuSalir.setText("Salir");
        subMenuSalir.setAlignmentX(1.0F);
        subMenuSalir.setAlignmentY(1.0F);
        subMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(subMenuSalir);

        jMenuBar1.add(menuArchivo);

        menuClientes.setText("Clientes");

        subMenuFormClientes.setText("Formulario de Clientes");
        subMenuFormClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuFormClientesActionPerformed(evt);
            }
        });
        menuClientes.add(subMenuFormClientes);

        jMenuBar1.add(menuClientes);

        menuAparatos.setText("Aparatos");

        subMenuFormAparatos.setText("Formulario de Aparatos");
        subMenuFormAparatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuFormAparatosActionPerformed(evt);
            }
        });
        menuAparatos.add(subMenuFormAparatos);

        jMenuBar1.add(menuAparatos);

        menuServicios.setText("Servicios");

        subMenuFormServicios.setText("Formulario de Servicios");
        subMenuFormServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuFormServiciosActionPerformed(evt);
            }
        });
        menuServicios.add(subMenuFormServicios);

        jMenuBar1.add(menuServicios);

        menuReparacion.setText("Reparación");

        subMenuFormReparacion.setText("Formulario de Reparaciones");
        subMenuFormReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuFormReparacionActionPerformed(evt);
            }
        });
        menuReparacion.add(subMenuFormReparacion);

        jMenuBar1.add(menuReparacion);

        jMenu1.setText("Búsquedas");

        jMenuItem1.setText("Buscar Aparatos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_subMenuSalirActionPerformed

    private void subMenuFormClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuFormClientesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ClienteView vCliente = new ClienteView();
        vCliente.setVisible(true);
        escritorio.add(vCliente);
        escritorio.moveToFront(vCliente);
        
    }//GEN-LAST:event_subMenuFormClientesActionPerformed

    private void subMenuFormAparatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuFormAparatosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AparatoView vAparato = new AparatoView();
        vAparato.setVisible(true);
        escritorio.add(vAparato);
        escritorio.moveToFront(vAparato);
    }//GEN-LAST:event_subMenuFormAparatosActionPerformed

    private void subMenuFormServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuFormServiciosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ServicioView vServicio = new ServicioView();
        vServicio.setVisible(true);
        escritorio.add(vServicio);
        escritorio.moveToFront(vServicio);
    }//GEN-LAST:event_subMenuFormServiciosActionPerformed

    private void subMenuFormReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuFormReparacionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ReparacionView vReparacion = new ReparacionView();
        vReparacion.setVisible(true);
        escritorio.add(vReparacion);
        escritorio.moveToFront(vReparacion);
    }//GEN-LAST:event_subMenuFormReparacionActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaAparatosView ba = new BusquedaAparatosView();
        ba.setVisible(true);
        escritorio.add(ba);
        escritorio.moveToFront(ba);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuAparatos;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuClientes;
    private javax.swing.JMenu menuReparacion;
    private javax.swing.JMenu menuServicios;
    private javax.swing.JMenuItem subMenuFormAparatos;
    private javax.swing.JMenuItem subMenuFormClientes;
    private javax.swing.JMenuItem subMenuFormReparacion;
    private javax.swing.JMenuItem subMenuFormServicios;
    private javax.swing.JMenuItem subMenuSalir;
    // End of variables declaration//GEN-END:variables
}
