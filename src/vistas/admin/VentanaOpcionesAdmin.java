/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.admin;

import vista.login.VentanaLogin;

/**
 *
 * @author LENOVO
 */
public class VentanaOpcionesAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VentanaOpcionesAdmin
     */
    public VentanaOpcionesAdmin() {
        initComponents();
        setLocationRelativeTo(this);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        menuOpciones = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        GestionPacientes = new javax.swing.JMenuItem();
        gestionMedicos = new javax.swing.JMenuItem();
        gestionEnfermeras = new javax.swing.JMenuItem();
        quirofanos = new javax.swing.JMenu();
        PQRS = new javax.swing.JMenu();
        historial = new javax.swing.JMenu();
        salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 125)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRO SALUD");

        lblVersion.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        lblVersion.setForeground(new java.awt.Color(255, 255, 255));
        lblVersion.setText("versión 17.1.2023");

        background.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        background.setLayer(lblVersion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVersion)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVersion)
                .addGap(101, 101, 101))
        );

        opciones.setText("Opciones");

        GestionPacientes.setText("Gestion Pacientes");
        GestionPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionPacientesActionPerformed(evt);
            }
        });
        opciones.add(GestionPacientes);

        gestionMedicos.setText("Gestion Medicos");
        gestionMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionMedicosActionPerformed(evt);
            }
        });
        opciones.add(gestionMedicos);

        gestionEnfermeras.setText("Gestion Enfermeras");
        gestionEnfermeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionEnfermerasActionPerformed(evt);
            }
        });
        opciones.add(gestionEnfermeras);

        menuOpciones.add(opciones);

        quirofanos.setText("Ver quirofanos");
        quirofanos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quirofanosMouseClicked(evt);
            }
        });
        menuOpciones.add(quirofanos);

        PQRS.setText("PQRS");
        PQRS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PQRSMouseClicked(evt);
            }
        });
        menuOpciones.add(PQRS);

        historial.setText("Historial");
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialMouseClicked(evt);
            }
        });
        menuOpciones.add(historial);

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        menuOpciones.add(salir);

        setJMenuBar(menuOpciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionPacientesActionPerformed
        VentanaGestionPaciente ventana = new VentanaGestionPaciente();
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_GestionPacientesActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_salirMouseClicked

    private void gestionMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionMedicosActionPerformed
        // TODO add your handling code here:
        VentanaGestionMedico ventana = new VentanaGestionMedico();
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_gestionMedicosActionPerformed

    private void gestionEnfermerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionEnfermerasActionPerformed
        // TODO add your handling code here:
        VentanaGestionEnfermera ventana = new VentanaGestionEnfermera();
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_gestionEnfermerasActionPerformed

    private void quirofanosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quirofanosMouseClicked
        // TODO add your handling code here:
        VentanaBotones ventana = new VentanaBotones();
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_quirofanosMouseClicked

    private void PQRSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PQRSMouseClicked
        // TODO add your handling code here:
        VentanaAtencionPQRS ventana = new VentanaAtencionPQRS();
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_PQRSMouseClicked

    private void historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseClicked
        // TODO add your handling code here:
        VentanaHistorial ventana = new VentanaHistorial();
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_historialMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GestionPacientes;
    private javax.swing.JMenu PQRS;
    public static javax.swing.JDesktopPane background;
    private javax.swing.JMenuItem gestionEnfermeras;
    private javax.swing.JMenuItem gestionMedicos;
    private javax.swing.JMenu historial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JMenuBar menuOpciones;
    private javax.swing.JMenu opciones;
    private javax.swing.JMenu quirofanos;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
