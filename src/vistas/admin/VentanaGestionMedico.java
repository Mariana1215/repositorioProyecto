/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.admin;

import controladores.ControladorGestionMedico;
import excepciones.PersonaYaRegistradaException;
import excepciones.UsuarioEnUsoException;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import enums.Especializacion;
import excepciones.RegistroInvalidoException;
import modelos.Medico;
import modelos.Paciente;
import util.LSE;

/**
 *
 * @author LENOVO
 */
public class VentanaGestionMedico extends javax.swing.JInternalFrame {

    private ControladorGestionMedico controlador;

    /**
     * Creates new form VentanaGestionMedico
     */
    public VentanaGestionMedico() {
        initComponents();
        controlador = new ControladorGestionMedico();
        llenarComboBox();
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
        lblEspecializacion = new javax.swing.JLabel();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraFinal = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cbxEspecializacion = new javax.swing.JComboBox<>();
        txtHoraInicial = new javax.swing.JFormattedTextField();
        txtHoraFinal = new javax.swing.JFormattedTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaGestionMedico = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestión medico");

        lblCedula.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblCedula.setText("Cédula");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblNombre.setText("Nombre");

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblDireccion.setText("Dirección");

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblTelefono.setText("Teléfono");

        lblEspecializacion.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblEspecializacion.setText("Especialización");

        lblHoraInicio.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblHoraInicio.setText("Hora inicio jornada");

        lblHoraFinal.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblHoraFinal.setText("Hora final jornada");

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        lblContrasenia.setText("Contraseña");

        txtCedula.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        cbxEspecializacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            txtHoraInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraInicial.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        try {
            txtHoraFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraFinal.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        txtContrasenia.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N

        tablaGestionMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaGestionMedico);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHoraInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(txtHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContrasenia)
                            .addComponent(lblUsuario)
                            .addComponent(lblHoraFinal))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasenia)
                            .addComponent(txtUsuario)
                            .addComponent(txtHoraFinal)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCedula)
                                .addGap(171, 171, 171))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEspecializacion)
                                    .addComponent(lblTelefono)
                                    .addComponent(lblDireccion)
                                    .addComponent(lblNombre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addComponent(txtDireccion)
                            .addComponent(txtTelefono)
                            .addComponent(cbxEspecializacion, 0, 214, Short.MAX_VALUE))))
                .addGap(121, 121, 121)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btnRegistrar)
                .addGap(72, 72, 72)
                .addComponent(btnBuscar)
                .addGap(65, 65, 65)
                .addComponent(btnEditar)
                .addGap(87, 87, 87)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(lblEspecializacion)
                            .addComponent(cbxEspecializacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoraInicio)
                            .addComponent(txtHoraInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoraFinal)
                            .addComponent(txtHoraFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContrasenia)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(41, 41, 41))
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
        String especializaciones = (String) cbxEspecializacion.getSelectedItem();
        Especializacion especializacion = Especializacion.valueOf(especializaciones.toUpperCase());

        if (cedula.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || usuario.isEmpty()
                || contrasenia.isEmpty() || cbxEspecializacion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos requeridos");
            return;
        }
        try {
            LocalTime horaInicioJornada = LocalTime.parse(txtHoraInicial.getText());
            LocalTime horaFinJornada = LocalTime.parse(txtHoraFinal.getText());

            if (horaInicioJornada.isAfter(horaFinJornada)) {
                JOptionPane.showMessageDialog(null, "Hora invalida");
                return;
            }
            Medico medico = new Medico(especializacion, horaInicioJornada, horaFinJornada, cedula, nombre, direccion, telefono, usuario, contrasenia);
            controlador.registrarMedico(medico);
            JOptionPane.showMessageDialog(null, "Médico registrado");

            llenarTabla();
            limpiarCampos();
        } catch (PersonaYaRegistradaException | UsuarioEnUsoException | RegistroInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Hora invalida");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();

        if (cedula.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la cédula del medico que desea buscar");
            return;
        }

        Medico medico = controlador.buscarMedico(cedula);

        if (medico != null) {
            txtCedula.setText(medico.getCedula());
            txtNombre.setText(medico.getNombre());
            txtDireccion.setText(medico.getDireccion());
            txtTelefono.setText(medico.getTelefono());
            txtUsuario.setText(medico.getUsuario());
            txtContrasenia.setText(medico.getContrasenia());
            txtHoraInicial.setText(String.valueOf(medico.getHoraInicioJornada()));
            txtHoraFinal.setText(String.valueOf(medico.getHoraFinJornada()));

            for (int i = 0; i < cbxEspecializacion.getItemCount(); i++) {
                if (cbxEspecializacion.getItemAt(i).equals(medico.getEspecializacion().getValor())) {
                    cbxEspecializacion.setSelectedIndex(i);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Médico no encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        String especializaciones = (String) cbxEspecializacion.getSelectedItem();
        Especializacion especializacion = Especializacion.valueOf(especializaciones.toUpperCase());

        if (cedula.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty() || usuario.isEmpty()
                || contrasenia.isEmpty() || cbxEspecializacion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos requeridos");
            return;
        }

        try {
            LocalTime horaInicioJornada = LocalTime.parse(txtHoraInicial.getText());
            LocalTime horaFinJornada = LocalTime.parse(txtHoraFinal.getText());

            if (horaInicioJornada.isAfter(horaFinJornada)) {
                JOptionPane.showMessageDialog(null, "Hora invalida");
                return;
            }
            Medico medico = new Medico(especializacion, horaInicioJornada, horaFinJornada, cedula, nombre, direccion, telefono, usuario, contrasenia);
            boolean respuesta = controlador.editarMedico(medico);
            if (respuesta) {
                JOptionPane.showMessageDialog(null, "Médico editado");
                llenarTabla();
                limpiarCampos();

            } else {
                JOptionPane.showMessageDialog(null, "El médico no se ha podido editar");
            }

        } catch (UsuarioEnUsoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null, "Hora invalida");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();

        if (cedula.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la cédula del medico que desea eliminar");
            return;
        }
        controlador.eliminarMedico(cedula);
        JOptionPane.showMessageDialog(null, "Médico eliminado correctamente");
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
    private void llenarComboBox() {
        cbxEspecializacion.setModel(new javax.swing.DefaultComboBoxModel<>(Especializacion.obtenerEspecializaciones()));
        cbxEspecializacion.insertItemAt("Seleccione una opción", 0);
        cbxEspecializacion.setSelectedIndex(0);
    }

    private void limpiarCampos() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        cbxEspecializacion.setSelectedIndex(0);
        txtHoraInicial.setText("");
        txtHoraFinal.setText("");
        txtUsuario.setText("");
        txtContrasenia.setText("");
    }

    private void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        LSE<Medico> medicos = controlador.getMedicos();
        modelo.setColumnIdentifiers(new Object[]{
            "Cédula", "Nombre", "Dirección", "Teléfono", "Especialización", "Jornada"
        });
        tablaGestionMedico.setModel(modelo);
        for (int i = 0; i < medicos.size(); i++) {
            Medico medico = (Medico) medicos.get(i);
            modelo.addRow(new Object[]{
                medico.getCedula(),
                medico.getNombre(),
                medico.getDireccion(),
                medico.getTelefono(),
                medico.getEspecializacion().getValor().toLowerCase(),
                medico.getHoraInicioJornada() + " - " + medico.getHoraFinJornada()
            });
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxEspecializacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEspecializacion;
    private javax.swing.JLabel lblHoraFinal;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tablaGestionMedico;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JFormattedTextField txtHoraFinal;
    private javax.swing.JFormattedTextField txtHoraInicial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}