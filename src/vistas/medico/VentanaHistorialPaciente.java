/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.medico;

import controladores.ControladorHistorialPaciente;
import javax.swing.table.DefaultTableModel;
import modelos.Atencion;
import modelos.Paciente;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class VentanaHistorialPaciente extends javax.swing.JInternalFrame {

    private ControladorHistorialPaciente controlador;
    /**
     * Creates new form VentanaHistorialPaciente
     */
    public VentanaHistorialPaciente(Paciente paciente) {
        initComponents();
        controlador = new ControladorHistorialPaciente(paciente);
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("historial");

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaHistorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        
        LSE<Atencion> atenciones = controlador.getAtenciones();
        
       modelo.setColumnIdentifiers(new Object[] {
           "Médico", "Fecha", "Motivo", "Diagnóstico"
       });
       
       tablaHistorial.setModel(modelo);
       
       for (int i = 0; i < atenciones.size(); i++) {
           modelo.addRow(new Object[]{
               atenciones.get(i).getCita().getMedico().getNombre(),
               atenciones.get(i).getCita().getFecha(),
               atenciones.get(i).getCita().getMotivo(),
               atenciones.get(i).getDiagnostico()
           });
       }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
}
