/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.paciente;

import modelos.Paciente;
import vista.login.VentanaLogin;

/**
 *
 * @author LENOVO
 */
public class VentanaOpcionesPaciente extends javax.swing.JFrame {
    private Paciente paciente;

    /**
     * Creates new form VentanaOpcionesPaciente
     */
    public VentanaOpcionesPaciente(Paciente paciente) {
        initComponents();
        setLocationRelativeTo(this);
        this.paciente = paciente;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        VerHistorial = new javax.swing.JMenu();
        AgendarCita = new javax.swing.JMenuItem();
        verHistorial = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        VerHistorial.setText("Opciones");

        AgendarCita.setText("Agendar cita");
        AgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarCitaActionPerformed(evt);
            }
        });
        VerHistorial.add(AgendarCita);

        verHistorial.setText("Ver historial");
        verHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verHistorialActionPerformed(evt);
            }
        });
        VerHistorial.add(verHistorial);

        jMenuBar1.add(VerHistorial);

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

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

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        // TODO add your handling code here:
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void AgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarCitaActionPerformed
        // TODO add your handling code here:
        VentanaCita ventana = new VentanaCita(paciente);
        VentanaOpcionesPaciente.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_AgendarCitaActionPerformed

    private void verHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verHistorialActionPerformed
        // TODO add your handling code here:
        VentanaHistorial ventana = new VentanaHistorial(paciente);
        VentanaOpcionesPaciente.background.add(ventana);
        ventana.setVisible(true);
    }//GEN-LAST:event_verHistorialActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgendarCita;
    private javax.swing.JMenu VerHistorial;
    public static javax.swing.JDesktopPane background;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu salir;
    private javax.swing.JMenuItem verHistorial;
    // End of variables declaration//GEN-END:variables
}
