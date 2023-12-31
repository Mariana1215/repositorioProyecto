/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package vistas.admin;

import controladores.ControladorQuirofano;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modelos.Quirofano;
import modelos.Separado;


/**
 *
 * @author LENOVO
 */
public class VentanaBotones extends javax.swing.JInternalFrame implements ActionListener {
    
    JButton[][] botones;
    private ControladorQuirofano controlador;

    /**
     * Creates new form VentanaQuirofano
     */
    public VentanaBotones() {
        initComponents();
        botones = new JButton[2][5];
        controlador = new ControladorQuirofano();
        cargarBotones();
        validarPosiciones();
    }
    
    private void cargarBotones(){
        int ancho = 45;
        int alto = 45;
        int separadoX = 20;
        int texto = 1;
        
        for (int i = 0; i < botones.length; i++) {
            for(int j = 0; j < botones[i].length; j++){
                botones[i][j] = new JButton();
                int separadoY = (i > 0) ? 40 : 20;
                
                botones[i][j].setBounds(
                        (j * ancho + separadoX),
                        (i * alto + separadoY), 
                        ancho, alto);
                botones[i][j].setText(String.valueOf(texto));
                botones[i][j].addActionListener(this);
                panelQuirofano.add(botones[i][j]);
                texto++;
                
            }
        }
    }
    
    public void validarPosiciones(){
        for(int i = 0; i < botones.length; i++){
            for(int j = 0; j < botones[i].length; j++){
                Quirofano quirofano = controlador.obtenerQuirofano(i, j);
                
                controlador.estadoQuirofano();
                
                if(quirofano.getEstado().equals(Quirofano.DISPONIBLE)){
                    botones[i][j].setBackground(Color.WHITE);
                }else if(quirofano.getEstado().equals(Quirofano.OCUPADO)){
                    botones[i][j].setBackground(Color.RED);
                    if(controlador.enAseo(quirofano)){
                        botones[i][j].setText("ASEO");
                    }
                }else if(quirofano.getEstado().equals(Quirofano.EN_MANTENIMIENTO)){
                    botones[i][j].setBackground(Color.GRAY);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelQuirofano = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Quirofanos");

        javax.swing.GroupLayout panelQuirofanoLayout = new javax.swing.GroupLayout(panelQuirofano);
        panelQuirofano.setLayout(panelQuirofanoLayout);
        panelQuirofanoLayout.setHorizontalGroup(
            panelQuirofanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        panelQuirofanoLayout.setVerticalGroup(
            panelQuirofanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panelQuirofano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panelQuirofano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelQuirofano;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < botones.length; i++){
            for(int j = 0; j < botones[i].length; j++){
                if(e.getSource().equals(botones[i][j])){
                    Quirofano quirofano = controlador.obtenerQuirofano(i, j);
                    
                    if(quirofano.getEstado().equals(Quirofano.DISPONIBLE)){
                        VentanaGestionesQuirofano ventana = new VentanaGestionesQuirofano(quirofano);
                        VentanaOpcionesAdmin.background.add(ventana);
                        ventana.setVisible(true);
                        this.dispose();
                    
                    }else if(quirofano.getEstado().equals(Quirofano.OCUPADO)){
                        Separado separado = controlador.mostrarInfo(quirofano);
                        VentanaInformacionCirugia ventana = new VentanaInformacionCirugia(separado, quirofano);
                        VentanaOpcionesAdmin.background.add(ventana);
                        ventana.setVisible(true);
                        this.dispose();
                    
                    }else if(quirofano.getEstado().equals(Quirofano.EN_MANTENIMIENTO)){
                        VentanaGestionesQuirofano ventana = new VentanaGestionesQuirofano(quirofano);
                        VentanaOpcionesAdmin.background.add(ventana);
                        ventana.setVisible(true);
                        this.dispose();
                    }
                }
            }
        }
    }
}
