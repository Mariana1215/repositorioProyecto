/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.medico;

import controladores.ControladorAtencionCita;
import javax.swing.JOptionPane;
import modelos.Atencion;
import modelos.Cita;
import modelos.Medico;

/**
 *
 * @author LENOVO
 */
public class VentanaAtencion extends javax.swing.JInternalFrame {
    private final Cita cita;
    private final ControladorAtencionCita controlador;

    /**
     * Creates new form VentanaAtencion
     */
    public VentanaAtencion(Medico medico, Cita cita) {
        initComponents();
        this.cita = cita;
        controlador = new ControladorAtencionCita(medico);
        lblNombrePaciente.setText(cita.getPaciente().getNombre());
        lblMotivoCita.setText(cita.getMotivo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblMotivo = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblMotivoCita = new javax.swing.JLabel();
        lblNota = new javax.swing.JLabel();
        lblDiagnostico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        lblTratamiento = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTratamiento = new javax.swing.JTextArea();
        btnHistorial = new javax.swing.JButton();
        btnAtender = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Atención");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblNombre.setText("Nombre paciente");

        lblMotivo.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblMotivo.setText("Motivo cita");

        lblNombrePaciente.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        lblMotivoCita.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        lblNota.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblNota.setText("Nota");

        lblDiagnostico.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblDiagnostico.setText("Diagnostico");

        txtNota.setColumns(20);
        txtNota.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        txtNota.setRows(5);
        jScrollPane1.setViewportView(txtNota);

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        lblTratamiento.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblTratamiento.setText("Tratamiento");

        txtTratamiento.setColumns(20);
        txtTratamiento.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        txtTratamiento.setRows(5);
        jScrollPane3.setViewportView(txtTratamiento);

        btnHistorial.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnHistorial.setText("Historial Paciente");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnAtender.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTratamiento)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNota))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDiagnostico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistorial)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblMotivo))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMotivoCita, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(lblNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(btnAtender)
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMotivo)
                            .addComponent(lblMotivoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnAtender)))
                .addGap(72, 72, 72)
                .addComponent(lblNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDiagnostico)
                    .addComponent(btnHistorial))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTratamiento)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        // TODO add your handling code here:
        VentanaHistorialPaciente ventana = new VentanaHistorialPaciente(cita.getPaciente());
        VentanaOpcionesMedico.background.add(ventana);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        // TODO add your handling code here:
        if(camposVacios()){
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
            return;
        }
        
        String diagnostico = txtDiagnostico.getText();
        String tratamiento = txtTratamiento.getText();
        String nota = txtNota.getText();
        
        Atencion atencion = new Atencion(cita, diagnostico, tratamiento, nota);
        controlador.atenderCita(atencion);
        
        JOptionPane.showMessageDialog(null, "Cita atendida");
        this.dispose();
    }//GEN-LAST:event_btnAtenderActionPerformed
    
    private boolean camposVacios(){
        return (txtDiagnostico.getText().isEmpty() || txtTratamiento.getText().isEmpty());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblMotivo;
    private javax.swing.JLabel lblMotivoCita;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblNota;
    private javax.swing.JLabel lblTratamiento;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextArea txtNota;
    private javax.swing.JTextArea txtTratamiento;
    // End of variables declaration//GEN-END:variables
}
