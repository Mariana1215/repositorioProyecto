/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.admin;

import controladores.ControladorGestionReserva;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Cirugia;
import modelos.Enfermera;
import modelos.Instrumental;
import modelos.Medico;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class VentanaGestionReserva extends javax.swing.JInternalFrame {
    private Cirugia cirugia;
    private ControladorGestionReserva controlador;
        
    /**
     * Creates new form VentanaGestionAdicional
     */
    public VentanaGestionReserva(Cirugia cirugia) {
        initComponents();
        this.cirugia = cirugia;
        controlador = new ControladorGestionReserva(cirugia);
        llenarTablaInstrumentos();
        llenarTablaMedicosDisponibles();
        llenarTablaMedicosAsignados();
        llenarTablaEnfermerasDisponibles();
        llenarTablaEnfermerasAsignadas();
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        instrumentalGestion = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCantidad = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        lblNombreInstrumento = new javax.swing.JLabel();
        txtNombreInstrumentos = new javax.swing.JTextField();
        btnRegistrarInstrumentos = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaInstrumentos = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        lblInstrumentosRegistrados = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnfermeraDisponibles = new javax.swing.JTable();
        lblEnfermerasDisponibles = new javax.swing.JLabel();
        lblEnfermerasAsignadas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEnfermerasAsignadas = new javax.swing.JTable();
        btnAsignarEnfermeras = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblMedicosDisponibles = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMedicosDisponibles = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        lblMedicosAsignados = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaMedicosAsignados = new javax.swing.JTable();
        btnAsignar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestiones adicionales");

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblCantidad.setText("Cantidad instrumentos");

        lblNombreInstrumento.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblNombreInstrumento.setText("Nombre instrumento");

        txtNombreInstrumentos.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        btnRegistrarInstrumentos.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnRegistrarInstrumentos.setText("Registrar instrumentos");
        btnRegistrarInstrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarInstrumentosActionPerformed(evt);
            }
        });

        tablaInstrumentos.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        tablaInstrumentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tablaInstrumentos);

        lblInstrumentosRegistrados.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblInstrumentosRegistrados.setText("Instrumentos registrado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstrumentosRegistrados)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarInstrumentos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantidad)
                            .addComponent(lblNombreInstrumento))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnCantidad)
                            .addComponent(txtNombreInstrumentos, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreInstrumento)
                    .addComponent(txtNombreInstrumentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(btnRegistrarInstrumentos)
                .addGap(111, 111, 111)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lblInstrumentosRegistrados)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        instrumentalGestion.addTab("Instrumental ", jPanel1);

        tablaEnfermeraDisponibles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEnfermeraDisponibles);

        lblEnfermerasDisponibles.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblEnfermerasDisponibles.setText("Enfermeras Disponibles");

        lblEnfermerasAsignadas.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblEnfermerasAsignadas.setText("Enfermeras asignadas a cirugía ");

        tablaEnfermerasAsignadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaEnfermerasAsignadas);

        btnAsignarEnfermeras.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnAsignarEnfermeras.setText("Asignar");
        btnAsignarEnfermeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarEnfermerasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnfermerasAsignadas)
                            .addComponent(lblEnfermerasDisponibles)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(btnAsignarEnfermeras)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblEnfermerasDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEnfermerasAsignadas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAsignarEnfermeras)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        instrumentalGestion.addTab("Enfermera", jPanel4);

        lblMedicosDisponibles.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblMedicosDisponibles.setText("Médicos disponibles");

        tablaMedicosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaMedicosDisponibles);

        lblMedicosAsignados.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblMedicosAsignados.setText("Médicos asignados a cirugía");

        tablaMedicosAsignados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tablaMedicosAsignados);

        btnAsignar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblMedicosDisponibles))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblMedicosAsignados))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnAsignar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblMedicosDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMedicosAsignados)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnAsignar)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        instrumentalGestion.addTab("Médicos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(instrumentalGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(instrumentalGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarInstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarInstrumentosActionPerformed
        // TODO add your handling code here:
        String nombreInstrumental = txtNombreInstrumentos.getText();
        int cantidad = (int) spnCantidad.getValue();
        if(camposVacios()){
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos");
            return;
        }
            Instrumental instrumental = new Instrumental(nombreInstrumental, cantidad);
            controlador.registrarInstrumentos(instrumental);
            JOptionPane.showMessageDialog(null, "Instrumental registrado correctamente");
            llenarTablaInstrumentos();
            limpiarCampos();
    }//GEN-LAST:event_btnRegistrarInstrumentosActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
        int selec = tablaMedicosDisponibles.getSelectedRow();
        
        if(selec >= 0){
            String cedula = tablaMedicosDisponibles.getValueAt(selec, 0).toString();
            Medico medico = controlador.buscarMedico(cedula);
            controlador.registrarMedico(medico);
            
            DefaultTableModel modeloOriginal = (DefaultTableModel) tablaMedicosDisponibles.getModel();
            modeloOriginal.removeRow(selec);
            
            llenarTablaMedicosAsignados();
            JOptionPane.showMessageDialog(null, "Médico asignado");
        }else{
            JOptionPane.showMessageDialog(null, "Debe de seleccionar un médico de la tabla");
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnAsignarEnfermerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarEnfermerasActionPerformed
        // TODO add your handling code here:
        int selec = tablaEnfermeraDisponibles.getSelectedRow();
        
        if(selec >= 0){
            String cedula = tablaEnfermeraDisponibles.getValueAt(selec, 0).toString();
            Enfermera enfermera = controlador.buscarEnfermera(cedula);
            controlador.registrarEnfermera(enfermera);
            
            DefaultTableModel modeloOrigina = (DefaultTableModel) tablaEnfermeraDisponibles.getModel();
            modeloOrigina.removeRow(selec);
            
            llenarTablaEnfermerasAsignadas();
            JOptionPane.showMessageDialog(null, "Enfermera asignada");
        }else{
            JOptionPane.showMessageDialog(null, "Debe de seleccionar una enfermera de la tabla");
        }
    }//GEN-LAST:event_btnAsignarEnfermerasActionPerformed
    
    
    private void llenarTablaInstrumentos(){
        DefaultTableModel modelo = new DefaultTableModel();
        LSE<Instrumental> instrumentos = cirugia.getInstrumental();
        modelo.setColumnIdentifiers(new Object[]{
            "Nombre instrumento", "Cantidad"
        });
        tablaInstrumentos.setModel(modelo);
        for(int i = 0; i < instrumentos.size(); i++){
            Instrumental instrumental = instrumentos.get(i);
            modelo.addRow(new Object[]{
                instrumental.getNombreInstrumento(),
                instrumental.getCantidad()
            });
        }
    }
    
    private void llenarTablaEnfermerasDisponibles(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        LSE<Enfermera> enfermeras = controlador.obtenerEnfermerasDisponible();
        modelo.setColumnIdentifiers(new Object[]{
            "Cédula", "Nombre"
        });
        
        tablaEnfermeraDisponibles.setModel(modelo);
        for(int i = 0; i < enfermeras.size(); i++){
            Enfermera enfermera = enfermeras.get(i);
            modelo.addRow(new Object[]{
                enfermera.getCedula(),
                enfermera.getNombre()
            });
        }
    }
    
    private void llenarTablaEnfermerasAsignadas(){
         DefaultTableModel modelo = new DefaultTableModel();
        
        LSE<Enfermera> enfermeras = controlador.obtenerEnfermerasAsignadas();
        modelo.setColumnIdentifiers(new Object[]{
            "Cédula", "Nombre"
        });
        
        tablaEnfermerasAsignadas.setModel(modelo);
        for(int i = 0; i < enfermeras.size(); i++){
            Enfermera enfermera = enfermeras.get(i);
            modelo.addRow(new Object[]{
                enfermera.getCedula(),
                enfermera.getNombre()
            });
        }
    }
    
    private void llenarTablaMedicosDisponibles(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        LSE<Medico> medicos = controlador.obtenerMedicosDisponibles();
        modelo.setColumnIdentifiers(new Object[]{
            "Cédula", "Nombre", "Especialización"
        });
        tablaMedicosDisponibles.setModel(modelo);
        for(int i = 0; i < medicos.size(); i++){
            Medico medico = medicos.get(i);
            modelo.addRow(new Object[]{
                medico.getCedula(),
                medico.getNombre(),
                medico.getEspecializacion()
            });
        }
    }
    
    private void llenarTablaMedicosAsignados(){
        DefaultTableModel modelo = new DefaultTableModel();
        
        
        LSE<Medico> medicos = controlador.obtenerMedicosAsignados();
        modelo.setColumnIdentifiers(new Object[]{
            "Cédula", "Nombre", "Especialización"
        });
        tablaMedicosAsignados.setModel(modelo);
        for(int i = 0; i < medicos.size(); i++){
            Medico medico = medicos.get(i);
            modelo.addRow(new Object[]{
                medico.getCedula(),
                medico.getNombre(),
                medico.getEspecializacion()
            });
        }
    }
    private boolean camposVacios(){
        return txtNombreInstrumentos.getText().isEmpty() || spnCantidad.getValue().toString().equals(0);
    }
    
    private void limpiarCampos(){
        txtNombreInstrumentos.setText("");
        spnCantidad.setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnAsignarEnfermeras;
    private javax.swing.JButton btnRegistrarInstrumentos;
    private javax.swing.JTabbedPane instrumentalGestion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblEnfermerasAsignadas;
    private javax.swing.JLabel lblEnfermerasDisponibles;
    private javax.swing.JLabel lblInstrumentosRegistrados;
    private javax.swing.JLabel lblMedicosAsignados;
    private javax.swing.JLabel lblMedicosDisponibles;
    private javax.swing.JLabel lblNombreInstrumento;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tablaEnfermeraDisponibles;
    private javax.swing.JTable tablaEnfermerasAsignadas;
    private javax.swing.JTable tablaInstrumentos;
    private javax.swing.JTable tablaMedicosAsignados;
    private javax.swing.JTable tablaMedicosDisponibles;
    private javax.swing.JTextField txtNombreInstrumentos;
    // End of variables declaration//GEN-END:variables
}
