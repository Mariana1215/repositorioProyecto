/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.admin;

import controladores.ControladorGestionEnfermera;
import excepciones.PersonaYaRegistradaException;
import excepciones.RegistroInvalidoException;
import excepciones.UsuarioEnUsoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Enfermera;
import modelos.Paciente;
import modelos.Persona;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class VentanaGestionEnfermera extends javax.swing.JInternalFrame {
    private ControladorGestionEnfermera controlador;

    /**
     * Creates new form VentanaGestionEnfermera
     */
    public VentanaGestionEnfermera() {
        initComponents();
        controlador = new ControladorGestionEnfermera();
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

        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblAsistencial = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        chbxAsistencial = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnfermera = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión enfermera");

        lblCedula.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblCedula.setText("Cédula");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblNombre.setText("Nombre");

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblDireccion.setText("Dirección");

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblTelefono.setText("Teléfono");

        lblAsistencial.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblAsistencial.setText("Asistencial");

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        chbxAsistencial.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        tablaEnfermera.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEnfermera);

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblContrasenia.setText("Contraseña");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        txtContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCedula)
                                        .addGap(94, 94, 94))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNombre)
                                        .addGap(84, 84, 84)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDireccion)
                                    .addGap(73, 73, 73)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addGap(79, 79, 79)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAsistencial)
                            .addGap(64, 64, 64)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblContrasenia))
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono)
                    .addComponent(chbxAsistencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario)
                    .addComponent(txtContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnRegistrar)
                .addGap(57, 57, 57)
                .addComponent(btnBuscar)
                .addGap(69, 69, 69)
                .addComponent(btnEditar)
                .addGap(57, 57, 57)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedula)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAsistencial)
                            .addComponent(chbxAsistencial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContrasenia)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        boolean asistencial = chbxAsistencial.isSelected();
        
        if(cedula.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()
                || usuario.isEmpty() || contrasenia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Llenar los campos requeridos");
            return;
        }
        try{
            Enfermera enfermera = new Enfermera(asistencial, cedula, nombre, direccion, telefono, usuario, contrasenia);
            controlador.registrarEnfermera(enfermera);
            JOptionPane.showMessageDialog(null,"Enfermera registrada");
            llenarTabla();
            limpiarCampos();
        }catch(PersonaYaRegistradaException | UsuarioEnUsoException | RegistroInvalidoException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la cédula de la enfermera que desea buscar");
            return;
        }
        
        Enfermera enfermera = controlador.buscarEnfermera(cedula);
        
        if(enfermera != null){
            
            txtCedula.setText(enfermera.getCedula());
            txtNombre.setText(enfermera.getNombre());
            txtDireccion.setText(enfermera.getDireccion());
            txtTelefono.setText(enfermera.getTelefono());
            chbxAsistencial.setSelected(enfermera.isAsistencial());
        }else{
            JOptionPane.showMessageDialog(null,"Enfermera no encontrada");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(null, "Busque a la enfermera que desea editar");
            return;
        }
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        boolean asistencial = chbxAsistencial.isSelected();
        
         if(cedula.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() 
                 || usuario.isEmpty() || contrasenia.isEmpty()){
            JOptionPane.showMessageDialog(null, "Llenar todos los campos requeridos");
            return;
        }
         
         try{
             Enfermera enfermera = new Enfermera(asistencial, cedula, nombre, direccion, telefono, usuario, contrasenia);
             controlador.editarEnfermera(enfermera);
             JOptionPane.showMessageDialog(null, "Enfermera editada");
             llenarTabla();
             limpiarCampos();
         }catch(UsuarioEnUsoException ex){
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese la cedula de la enfermera que desea eliminar");
            return;
        }
        controlador.eliminarEnfermera(cedula);
        JOptionPane.showMessageDialog(null, "Enfermera eliminada");
        llenarTabla();
        limpiarCampos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        // TODO add your handling code here:
          String cedula = txtCedula.getText();
        
      if(!cedula.isEmpty()){
          Paciente paciente = controlador.buscarPaciente(cedula);
          
          if(paciente != null){
                txtNombre.setText(paciente.getNombre());
                txtTelefono.setText(paciente.getTelefono());
                txtDireccion.setText(paciente.getDireccion());
                
                txtNombre.setEditable(false);
                txtTelefono.setEditable(false);
                txtDireccion.setEditable(false);
          }else{
                txtNombre.setText("");
                txtTelefono.setText("");
                txtDireccion.setText("");
                
                txtNombre.setEditable(true);
                txtTelefono.setEditable(true);
                txtDireccion.setEditable(true);
          }
      }else{
          txtNombre.setText("");
          txtTelefono.setText("");
          txtDireccion.setText("");
                
          txtNombre.setEditable(true);
          txtTelefono.setEditable(true);
          txtDireccion.setEditable(true);
      }
    }//GEN-LAST:event_txtCedulaKeyReleased
    private void llenarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        LSE<Enfermera> Enfermeras = controlador.getEnfermeras();
        modelo.setColumnIdentifiers(new Object[]{
           "Cédula", "Nombre", "Dirección", "Teléfono"
        });
        tablaEnfermera.setModel(modelo);
        for(int i = 0; i < Enfermeras.size(); i++){
                Enfermera enfermera = (Enfermera) Enfermeras.get(i);
                modelo.addRow(new Object[]{
                    enfermera.getCedula(),
                    enfermera.getNombre(),
                    enfermera.getDireccion(),
                    enfermera.getTelefono()
                
                });
            
            
        }
    }
    
    private void limpiarCampos(){
        txtCedula.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        txtContrasenia.setText("");
        chbxAsistencial.setSelected(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JCheckBox chbxAsistencial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAsistencial;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tablaEnfermera;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
