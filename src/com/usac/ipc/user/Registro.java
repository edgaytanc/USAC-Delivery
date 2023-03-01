/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.usac.ipc.user;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class Registro extends javax.swing.JInternalFrame implements Users {
    //Usuarios users = new Usuarios();
    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
    }
    
    public void add(Usuario user){
        System.out.println(usuarios.size());
        usuarios.add(user);
        System.out.println(usuarios.size());
        
    }
    
    public boolean validaContrasena(){
        String contrasena = txtContrasena.getText();
        String recontrasena = txtReingreso.getText();
        if(contrasena.equals(recontrasena)){
            if(contrasena.matches("^[A-Za-z0-9ñÑáéíóúÁÉÍÓÚüÜ_\\-.,:;!?¡¿@#$%&*\\(\\)\\\\\\/\\[\\]\\{\\}\\<\\>\\+=\\\"\\'\\^`\\|]+$")){
                return true;
            }
        }
        return false;
    }
    
    public void limpiaFormulario(){
        txtCorreo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtContrasena.setText("");
        txtReingreso.setText("");
        txtDpi.setText("");
        txtFecha.setCalendar(null);
        comboGenero.setSelectedIndex(2);
        txtNacionalidad.setText("");
        txtSobrenombre.setText("");
        txtTelefono.setText("");
        comboRol.setSelectedIndex(3);
        lblImagen.setIcon(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        lblReingreso = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JTextField();
        txtReingreso = new javax.swing.JTextField();
        lblDpi = new javax.swing.JLabel();
        txtDpi = new javax.swing.JTextField();
        lblRol = new javax.swing.JLabel();
        comboRol = new javax.swing.JComboBox<>();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblFecha = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        lblNacionalidad = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        lblSobrenombre = new javax.swing.JLabel();
        txtSobrenombre = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        btnSubir = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);

        lblCorreo.setText("Correo Electronico");

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblContrasena.setText("Contrasena");

        lblReingreso.setText("Reingresar Contra. ");

        lblDpi.setText("DPI");

        lblRol.setText("Rol");

        comboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario Individual", "Usuario Empresarial", "Kiosco", " " }));
        comboRol.setSelectedIndex(3);

        lblFecha.setText("Fecha de nacimiento");

        lblGenero.setText("Genero");

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maculino", "Femenino", " " }));
        comboGenero.setSelectedIndex(2);
        comboGenero.setToolTipText("");

        lblNacionalidad.setText("Nacionalidad");

        lblSobrenombre.setText("Sobrenombre (alias)");

        lblTelefono.setText("Telefono");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSubir.setText("Subir");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRol)
                    .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnRegistrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                            .addComponent(btnSubir)
                            .addGap(18, 18, 18)
                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCorreo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNombre)
                                    .addGap(74, 74, 74)
                                    .addComponent(lblApellido))
                                .addComponent(txtCorreo)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtReingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblContrasena))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(lblReingreso))))
                                .addComponent(lblDpi)
                                .addComponent(txtDpi))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFecha)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGenero)
                                .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSobrenombre)
                                .addComponent(lblNacionalidad)
                                .addComponent(txtNacionalidad, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtSobrenombre)
                                .addComponent(lblTelefono)
                                .addComponent(txtTelefono)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblFecha)
                    .addComponent(lblNacionalidad))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContrasena)
                    .addComponent(lblReingreso)
                    .addComponent(lblGenero)
                    .addComponent(lblSobrenombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSobrenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDpi)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRol)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar)
                            .addComponent(btnSubir)
                            .addComponent(lblError)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if(validaContrasena()){
            Usuario usuario = new Usuario(txtCorreo.getText(),txtNombre.getText(),
                txtApellido.getText(),txtContrasena.getText(),
                txtDpi.getText(),txtFecha.toString(),(String)comboGenero.getSelectedItem(),
                txtNacionalidad.getText(),txtSobrenombre.getText(),
                txtTelefono.getText(),(String)comboRol.getSelectedItem(),"");
            add(usuario);
            limpiaFormulario();
        }else{
            lblError.setText("Error en la contraseña, no son iguales o no cumple los requisitos.");
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        // Crear un objeto JFileChooser para que el usuario seleccione un archivo de imagen
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(null);
        
        // Si el usuario seleccionó un archivo, cargarlo en un objeto ImageIcon y mostrarlo en un JLabel
        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            ImageIcon imagen = new ImageIcon(archivo.getAbsolutePath());
            //lblImagen = new JLabel(imagen);
            lblImagen.setIcon(imagen);
        }
    }//GEN-LAST:event_btnSubirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JComboBox<String> comboRol;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDpi;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNacionalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReingreso;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblSobrenombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDpi;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtReingreso;
    private javax.swing.JTextField txtSobrenombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}