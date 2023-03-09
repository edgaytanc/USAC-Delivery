/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.usac.ipc.cliente;

import com.usac.ipc.admin.Departamento;
import com.usac.ipc.admin.Municipio;
import com.usac.ipc.admin.Region;
import com.usac.ipc.baseDatos;
import com.usac.ipc.user.Users;
import com.usac.ipc.user.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import java.io.*;

/**
 *
 * @author David
 */
public class FCotizacion extends javax.swing.JInternalFrame implements baseDatos,Users {

    
    /**
     * Variables Globales que manejan lo ingresado en el cotizador
     */
    private String origenDepto;
    private String origenMuni;
    private String origenDireccion;
    private String destinoDepto;
    private String destinoMuni;
    private String destinoDireccion;
    private String tipoPago;
    private int numero;
    private int tamano;
    private float servicio;
    private float total;
    
    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_";
    
    public void initVar(){
        this.origenDepto = "";
        this.origenMuni = "";
        this.origenDireccion = "";
        this.destinoDepto = "";
        this.destinoMuni = "";
        this.destinoDireccion = "";
        this.tipoPago="";
        this.numero = 0;
        this.tamano = 0;
        this.servicio = 0;
        this.total = 0;
    }
    
    public void add(Usuario usuario){
        
    }
    
    public void cargaDepto(){
        if(!departamentos.isEmpty()){
            for(Departamento d : departamentos){
                comboOrigenDepto.addItem(d.getNombreDepartamento());
                comboDestinoDepto.addItem(d.getNombreDepartamento());
            }
        }else
        {
            comboOrigenDepto.addItem("");
            comboDestinoDepto.addItem("");
        }
    }
    
    public void cargaDatosFactura(){
        Usuario u = Users.getUsuarioActivo();
        //System.out.println(u.getCorreo());
        if(!datosFacturas.isEmpty()){
            for(DatosFactura df : datosFacturas){
                if(u.getCorreo().equals(df.getCorreoUsuario())){
                    comboDatosFacturacion.addItem(df.getDireccion());
                }
            }
        }
    }
    
    public void cargaMuniOrigen(String codigo){
        ArrayList<String> modelo = new ArrayList<>();
        String[] model;
        if(!municipios.isEmpty()){
            for(Municipio m : municipios){
                if(m.getCodigoMunicipio().equals(codigo)){
                    modelo.add(m.getNombreMunicipio());
                    
                }
            }
            model = modelo.toArray(new String[modelo.size()]);
            System.out.println(Arrays.toString(model));
            comboOrigenMuni.setModel(new DefaultComboBoxModel<String>(model));
        }
    }
    
    public void cargaMuniDestino(String codigo){
        ArrayList<String> modelo = new ArrayList<>();
        String[] model;
        if(!municipios.isEmpty()){
            for(Municipio m : municipios){
                if(m.getCodigoMunicipio().equals(codigo)){
                    modelo.add(m.getNombreMunicipio());
                    
                }
            }
            model = modelo.toArray(new String[modelo.size()]);
            System.out.println(Arrays.toString(model));
            comboDestinoMuni.setModel(new DefaultComboBoxModel<String>(model));
        }
    }
    
    public String devuelveCodigo(String nombre){
        String codigo = new String();
        for(Departamento d: departamentos){
            if(nombre.equals(d.getNombreDepartamento())){
                codigo = d.getCodigoDepartamento();
            }
        }
        return codigo;
    }
    
    public String devuelveCodigoRegion(String nombre){
        String codigo = new String();
        for(Departamento d : departamentos){
            if(nombre.equals(d.getNombreDepartamento())){
                codigo = d.getRegionDepartamento();
            }
        }
        return codigo;
    }
    
    public void cargaServicio(String region){
        for(Region r: regiones){
            if(region.equals(r.getCodigo())){
                lblEstandar.setText(String.valueOf(r.getEstandar()));
                lblEspecial.setText(String.valueOf(r.getEspecial()));
            }
        }
    }
    
    public void seleccionaTamano(){
        if(opcPequeno.isSelected()){
            this.tamano = 15;
        }
        if(opcMediano.isSelected()){
            this.tamano = 25;
        }
        if(opcGrande.isSelected()){
            this.tamano = 35;
        }
    }
    
    public void seleccionaRegion(){
        if(opcEstandar.isSelected()){
            this.servicio = Float.parseFloat(lblEstandar.getText());
        }
        if(opcEspecial.isSelected()){
            this.servicio = Float.parseFloat(lblEspecial.getText());
        }
    }
    
    public void seleccionaPago(){
        if(opcEntrega.isSelected()){
            this.tipoPago = "Contra Entrega";
        }
        if(opcTarjeta.isSelected()){
            this.tipoPago = "Tarjeta";
        }
    }
    
     public String generaStringAleatorio() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
     
     public String buscaNit(String dir){
         String nit = null;
         for(DatosFactura datosFactura : datosFacturas){
             if(datosFactura.getDireccion().equals(dir)){
                 nit = datosFactura.getNit();
             }
         }
         return nit;
     }
     
     
    
    /**
     * Creates new form FCotizacion
     */
    public FCotizacion() {
        initComponents();
        initVar();
        cargaDepto();
        cargaMuniOrigen("SA");
        cargaMuniDestino("SA");
        cargaDatosFactura();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTamano = new javax.swing.ButtonGroup();
        grupoServicio = new javax.swing.ButtonGroup();
        grupoPago = new javax.swing.ButtonGroup();
        lblOrigen = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        comboOrigenDepto = new javax.swing.JComboBox<>();
        comboOrigenMuni = new javax.swing.JComboBox<>();
        comboDestinoDepto = new javax.swing.JComboBox<>();
        comboDestinoMuni = new javax.swing.JComboBox<>();
        lblOrigenDepto = new javax.swing.JLabel();
        lblDestinoDepto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNumeroPaquetes = new javax.swing.JLabel();
        txtDireccionOrigen = new javax.swing.JTextField();
        opcPequeno = new javax.swing.JRadioButton();
        opcMediano = new javax.swing.JRadioButton();
        opcGrande = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDireccionDestino = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        opcEstandar = new javax.swing.JRadioButton();
        lblEstandar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        opcEspecial = new javax.swing.JRadioButton();
        lblEspecial = new javax.swing.JLabel();
        btnCotizar = new javax.swing.JButton();
        spUno = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        opcEntrega = new javax.swing.JRadioButton();
        opcTarjeta = new javax.swing.JRadioButton();
        lblDatosFacturacion = new javax.swing.JLabel();
        comboDatosFacturacion = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblServicioFact = new javax.swing.JLabel();
        lblTotalFact = new javax.swing.JLabel();
        btnPago = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnDescargaFact = new javax.swing.JButton();
        btnDescargaGuia = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cotizacion");
        setPreferredSize(new java.awt.Dimension(900, 600));

        lblOrigen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrigen.setText("Origen");

        lblDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDestino.setText("Destino");

        comboOrigenDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrigenDeptoActionPerformed(evt);
            }
        });

        comboOrigenMuni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                comboOrigenMuniFocusGained(evt);
            }
        });
        comboOrigenMuni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboOrigenMuniMouseClicked(evt);
            }
        });

        comboDestinoDepto.setPreferredSize(new java.awt.Dimension(140, 22));
        comboDestinoDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDestinoDeptoActionPerformed(evt);
            }
        });

        lblOrigenDepto.setText("Departamento");

        lblDestinoDepto.setText("Departamento");

        jLabel3.setText("Municipio");

        jLabel4.setText("Municipio");

        lblNumeroPaquetes.setText("Dirección de Origen");

        txtDireccionOrigen.setPreferredSize(new java.awt.Dimension(50, 22));

        grupoTamano.add(opcPequeno);
        opcPequeno.setText("Pequeño");

        grupoTamano.add(opcMediano);
        opcMediano.setText("Mediano");

        grupoTamano.add(opcGrande);
        opcGrande.setText("Grande");

        jLabel1.setText("Tamano de paquete");

        jLabel2.setText("Dirección de Destino");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 150));

        grupoServicio.add(opcEstandar);
        opcEstandar.setText("Servicio Estandar");

        lblEstandar.setText("Total Q");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(opcEstandar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblEstandar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(opcEstandar)
                .addGap(18, 18, 18)
                .addComponent(lblEstandar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        grupoServicio.add(opcEspecial);
        opcEspecial.setText("Servicio Especial");

        lblEspecial.setText("Total Q");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblEspecial))
                    .addComponent(opcEspecial))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(opcEspecial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEspecial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCotizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCotizar.setText("Cotizar");
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });

        spUno.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tipo de Pago");

        grupoPago.add(opcEntrega);
        opcEntrega.setText("Pago contra entrega");

        grupoPago.add(opcTarjeta);
        opcTarjeta.setText("Pago con Tarjeta de Credito o Debito");

        lblDatosFacturacion.setText("Datos de Facturacion");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblServicioFact.setText("Servicio ");

        lblTotalFact.setText("Total Q");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblServicioFact)
                    .addComponent(lblTotalFact))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblServicioFact)
                .addGap(18, 18, 18)
                .addComponent(lblTotalFact)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        btnPago.setText("Realizar Pago y Enviar");
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar Orden");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnDescargaFact.setText("Descargar Factura");
        btnDescargaFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargaFactActionPerformed(evt);
            }
        });

        btnDescargaGuia.setText("Descargar Guia");

        lblCantidad.setText("Cantidad de Paquetes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblOrigen)
                                    .addGap(160, 160, 160))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblOrigenDepto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(56, 56, 56)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboOrigenDepto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboOrigenMuni, 0, 140, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblNumeroPaquetes)
                            .addComponent(jLabel1)
                            .addComponent(txtDireccionOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtDireccionDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDestino)
                                    .addComponent(lblDestinoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(comboDestinoDepto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboDestinoMuni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCotizar)
                            .addGap(58, 58, 58)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(opcPequeno)
                            .addGap(18, 18, 18)
                            .addComponent(opcMediano)
                            .addGap(18, 18, 18)
                            .addComponent(opcGrande)
                            .addGap(282, 282, 282))))
                .addGap(24, 24, 24)
                .addComponent(spUno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(opcEntrega)
                        .addComponent(opcTarjeta)
                        .addComponent(lblDatosFacturacion)
                        .addComponent(comboDatosFacturacion, 0, 251, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnDescargaFact)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDescargaGuia))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnPago)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(opcEntrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcTarjeta)
                        .addGap(27, 27, 27)
                        .addComponent(lblDatosFacturacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboDatosFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPago)
                            .addComponent(btnCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDescargaFact)
                            .addComponent(btnDescargaGuia))
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(spUno)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCotizar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblOrigen)
                                    .addComponent(lblDestino))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblOrigenDepto)
                                    .addComponent(lblDestinoDepto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboOrigenDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboDestinoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboOrigenMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboDestinoMuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNumeroPaquetes)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccionOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCantidad)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(opcPequeno)
                                    .addComponent(opcMediano)
                                    .addComponent(opcGrande))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboOrigenMuniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboOrigenMuniFocusGained
        
    }//GEN-LAST:event_comboOrigenMuniFocusGained

    private void comboOrigenMuniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboOrigenMuniMouseClicked
     
    }//GEN-LAST:event_comboOrigenMuniMouseClicked

    private void comboOrigenDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrigenDeptoActionPerformed
        String select = (String)comboOrigenDepto.getSelectedItem();
        cargaMuniOrigen(devuelveCodigo(select));
        
    }//GEN-LAST:event_comboOrigenDeptoActionPerformed

    private void comboDestinoDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDestinoDeptoActionPerformed
        String select = (String)comboDestinoDepto.getSelectedItem();
        cargaMuniDestino(devuelveCodigo(select));
        cargaServicio(devuelveCodigoRegion(select));
    }//GEN-LAST:event_comboDestinoDeptoActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
        numero = Integer.parseInt(txtCantidad.getText());
        seleccionaTamano();
        seleccionaRegion();
        this.total = this.servicio*this.tamano*numero;
        lblTotalFact.setText("Total Q "+this.total);
        
        this.origenDepto = comboOrigenDepto.getSelectedItem().toString();
        this.origenMuni = comboOrigenMuni.getSelectedItem().toString();
        this.destinoDepto = comboDestinoDepto.getSelectedItem().toString();
        this.destinoMuni = comboDestinoMuni.getSelectedItem().toString();
        this.numero = Integer.parseInt(txtCantidad.getText());
        
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed
        int numeroFactura = facturas.size()+1;
        String codigoPaquete = "IPC1D"+generaStringAleatorio();
        String nit = buscaNit(comboDatosFacturacion.getSelectedItem().toString());
        String origen = this.origenDepto+" "+this.origenMuni+" "+this.origenDireccion;
        String destino = this.destinoDepto+" "+this.destinoMuni+" "+this.destinoDireccion;
        
        Factura factura = new Factura(numeroFactura,codigoPaquete,origen,
                destino,nit,this.tipoPago,String.valueOf(this.tamano),
                this.numero,this.total);
        
        facturas.add(factura);
        
        Guia guia = new Guia(codigoPaquete,origen, destino,this.tipoPago,
                String.valueOf(this.tamano),this.numero,new Date(),
                this.total);
        
        guias.add(guia);
    }//GEN-LAST:event_btnPagoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnDescargaFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargaFactActionPerformed
        StringBuilder html = new StringBuilder();
        html.append("<html>");
        html.append("<head><title>Factura</title></head>");
        
    }//GEN-LAST:event_btnDescargaFactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnDescargaFact;
    private javax.swing.JButton btnDescargaGuia;
    private javax.swing.JButton btnPago;
    private javax.swing.JComboBox<String> comboDatosFacturacion;
    private javax.swing.JComboBox<String> comboDestinoDepto;
    private javax.swing.JComboBox<String> comboDestinoMuni;
    private javax.swing.JComboBox<String> comboOrigenDepto;
    private javax.swing.JComboBox<String> comboOrigenMuni;
    private javax.swing.ButtonGroup grupoPago;
    private javax.swing.ButtonGroup grupoServicio;
    private javax.swing.ButtonGroup grupoTamano;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDatosFacturacion;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblDestinoDepto;
    private javax.swing.JLabel lblEspecial;
    private javax.swing.JLabel lblEstandar;
    private javax.swing.JLabel lblNumeroPaquetes;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblOrigenDepto;
    private javax.swing.JLabel lblServicioFact;
    private javax.swing.JLabel lblTotalFact;
    private javax.swing.JRadioButton opcEntrega;
    private javax.swing.JRadioButton opcEspecial;
    private javax.swing.JRadioButton opcEstandar;
    private javax.swing.JRadioButton opcGrande;
    private javax.swing.JRadioButton opcMediano;
    private javax.swing.JRadioButton opcPequeno;
    private javax.swing.JRadioButton opcTarjeta;
    private javax.swing.JSeparator spUno;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDireccionDestino;
    private javax.swing.JTextField txtDireccionOrigen;
    // End of variables declaration//GEN-END:variables
}
