/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.admin;

import modelos.Quirofano;

/**
 *
 * @author LENOVO
 */
public class VentanaGestionesQuirofano extends javax.swing.JInternalFrame {
    
    private Quirofano quirofano;

    /**
     * Creates new form VentanaGestionesQuirofano
     */
    public VentanaGestionesQuirofano(Quirofano quirofano) {
        initComponents();
        this.quirofano = quirofano;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSepararQuirofano = new javax.swing.JButton();
        btnMantenimiento = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestiones quirofano");

        btnSepararQuirofano.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnSepararQuirofano.setText("Reservar Quirofano");
        btnSepararQuirofano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepararQuirofanoActionPerformed(evt);
            }
        });

        btnMantenimiento.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnMantenimiento.setText("Mantenimiento quirofano");
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 153));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnReservas.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnReservas.setText("Ver reservas");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnSepararQuirofano))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnReservas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnMantenimiento)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnRegresar)
                .addGap(26, 26, 26)
                .addComponent(btnSepararQuirofano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnReservas)
                .addGap(32, 32, 32)
                .addComponent(btnMantenimiento)
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VentanaBotones ventana = new VentanaBotones();
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSepararQuirofanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepararQuirofanoActionPerformed
        // TODO add your handling code here:
        VentanaQuirofano ventana = new VentanaQuirofano(quirofano);
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
     
        
    }//GEN-LAST:event_btnSepararQuirofanoActionPerformed

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        // TODO add your handling code here:
        VentanaMantenimiento ventana = new VentanaMantenimiento(quirofano);
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btnMantenimientoActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        // TODO add your handling code here:
        VentanaReservas ventana = new VentanaReservas(quirofano);
        VentanaOpcionesAdmin.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnReservasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMantenimiento;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSepararQuirofano;
    // End of variables declaration//GEN-END:variables
}