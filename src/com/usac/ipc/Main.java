/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.usac.ipc;

import com.usac.ipc.admin.Departamento;
import com.usac.ipc.admin.FDepartamento;
import com.usac.ipc.admin.FKiosko;
import com.usac.ipc.admin.FMunicipio;
import com.usac.ipc.admin.FRegion;
import com.usac.ipc.admin.Municipio;
import com.usac.ipc.admin.Region;
import com.usac.ipc.cliente.FCotizacion;
import com.usac.ipc.user.Login;
import com.usac.ipc.user.Registro;

/**
 *
 * @author David
 */
public class Main extends javax.swing.JFrame implements baseDatos{
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        mnRegistro.setVisible(false);
        mnAdmin.setVisible(false);
        mmDeptoMuni.setVisible(false);
        //mnCotizacion.setVisible(false);
        
        cargaRegiones();
        cargaDepartamentos();
        cargaMunicipios();
    }
    
    /**
     * Quemado de datos de la aplicacion
     */
    public void cargaRegiones(){
        Region region1 = new Region("M","Metropolitana",35,25);
        Region region2 = new Region("NT","Norte",(float)68.50,(float)45.55);
        Region region3 = new Region("NO","Nororiente",(float)58.68,(float)35.48);
        Region region4 = new Region("SO","Suroriente",(float)38.68,(float)32.48);
        Region region5 = new Region("SOC","Suroccidente",(float)34.0,(float)29.0);
        Region region6 = new Region("NOC","Noroccidente",(float)44.5,(float)40.0);
        
        regiones.add(region1);
        regiones.add(region2);
        regiones.add(region3);
        regiones.add(region4);
        regiones.add(region5);
        regiones.add(region6);
    }
    
    public void cargaDepartamentos(){
        Departamento departamento1= new Departamento("SA","NOC","Sacatepequez");
        Departamento departamento2= new Departamento("GU","M","Guatemala");
        Departamento departamento3= new Departamento("ES","SO","Escuintla");
        Departamento departamento4= new Departamento("PE","NO","Peten");
        Departamento departamento5= new Departamento("JA","SO","Jalapa");
        
        departamentos.add(departamento1);
        departamentos.add(departamento2);
        departamentos.add(departamento3);
        departamentos.add(departamento4);
        departamentos.add(departamento5);
    }
    
    public void cargaMunicipios(){
        Municipio municipio1 = new Municipio("SA","Antigua Guatemala");
        Municipio municipio2 = new Municipio("SA","Jocotenango");
        Municipio municipio3 = new Municipio("SA","Pastores");
        Municipio municipio4 = new Municipio("SA","Sumpango");
        Municipio municipio5 = new Municipio("SA","Ciudad Vieja");
        
        Municipio municipio6 = new Municipio("GU","Guatemala");
        Municipio municipio7 = new Municipio("GU","Mixco");
        Municipio municipio8 = new Municipio("GU","Amatitlan");
        Municipio municipio9 = new Municipio("GU","San Miguel Petapa");
        Municipio municipio10 = new Municipio("GU","Villa Canales");
        
        Municipio municipio11 = new Municipio("ES","Escuintla");
        Municipio municipio12 = new Municipio("ES","La Democracia");
        Municipio municipio13 = new Municipio("ES","Siquinala");
        Municipio municipio14 = new Municipio("ES","Masagua");
        Municipio municipio15 = new Municipio("ES","la Gomera");
        
        Municipio municipio16 = new Municipio("PE","Flores");
        Municipio municipio17 = new Municipio("PE","San Jose");
        Municipio municipio18 = new Municipio("PE","San Benito");
        Municipio municipio19 = new Municipio("PE","San Andres");
        Municipio municipio20 = new Municipio("PE","la Libertad");
        
        Municipio municipio21 = new Municipio("JA","Jalapa");
        Municipio municipio22 = new Municipio("JA","Monjas");
        Municipio municipio23 = new Municipio("JA","San Pedro Pinula");
        Municipio municipio24 = new Municipio("JA","Mataquescuintla");
        Municipio municipio25 = new Municipio("JA","San Luis Jilotepeque");
        
        //Cargando al ArrayList
        municipios.add(municipio1);
        municipios.add(municipio2);
        municipios.add(municipio3);
        municipios.add(municipio4);
        municipios.add(municipio5);
        municipios.add(municipio6);
        municipios.add(municipio7);
        municipios.add(municipio8);
        municipios.add(municipio9);
        municipios.add(municipio10);
        municipios.add(municipio11);
        municipios.add(municipio12);
        municipios.add(municipio13);
        municipios.add(municipio14);
        municipios.add(municipio15);
        municipios.add(municipio16);
        municipios.add(municipio17);
        municipios.add(municipio18);
        municipios.add(municipio19);
        municipios.add(municipio20);
        municipios.add(municipio21);
        municipios.add(municipio22);
        municipios.add(municipio23);
        municipios.add(municipio24);
        municipios.add(municipio25);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnRegistro = new javax.swing.JMenu();
        mnAdmin = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mmDeptoMuni = new javax.swing.JMenu();
        mnDepartamentos = new javax.swing.JMenuItem();
        mnMunicipios = new javax.swing.JMenuItem();
        mnCotizacion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USAC-DELIVERY");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        mnRegistro.setText("Registro Usuarios");
        mnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnRegistroMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnRegistro);

        mnAdmin.setText("Administracion");

        jMenuItem1.setText("Manejo de Kioskos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnAdmin.add(jMenuItem1);

        jMenuItem2.setText("Manejo de Regiones y Precios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnAdmin.add(jMenuItem2);

        jMenuItem4.setText("Reportes");
        mnAdmin.add(jMenuItem4);

        jMenuBar1.add(mnAdmin);

        mmDeptoMuni.setText("Departamentos y Municipios");

        mnDepartamentos.setText("Departamentos");
        mnDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDepartamentosActionPerformed(evt);
            }
        });
        mmDeptoMuni.add(mnDepartamentos);

        mnMunicipios.setText("Municipios");
        mnMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMunicipiosActionPerformed(evt);
            }
        });
        mmDeptoMuni.add(mnMunicipios);

        jMenuBar1.add(mmDeptoMuni);

        mnCotizacion.setText("Cotización");
        mnCotizacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnCotizacionMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnCotizacion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //maximiza el formulario
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Login login = new Login();
        this.escritorio.add(login);
        login.setVisible(true);
        
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void mnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnRegistroMouseClicked
        Registro registro = new Registro();
        this.escritorio.add(registro);
        registro.setVisible(true);
    }//GEN-LAST:event_mnRegistroMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FKiosko fkiosko = new FKiosko();
        this.escritorio.add(fkiosko);
        fkiosko.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FRegion fregion = new FRegion();
        this.escritorio.add(fregion);
        fregion.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDepartamentosActionPerformed
        FDepartamento fdepartamento = new FDepartamento();
        this.escritorio.add(fdepartamento);
        fdepartamento.setVisible(true);
    }//GEN-LAST:event_mnDepartamentosActionPerformed

    private void mnMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMunicipiosActionPerformed
        FMunicipio fmunicipio = new FMunicipio();
        this.escritorio.add(fmunicipio);
        fmunicipio.setVisible(true);
    }//GEN-LAST:event_mnMunicipiosActionPerformed

    private void mnCotizacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnCotizacionMouseClicked
        FCotizacion fcotizacion = new FCotizacion();
        this.escritorio.add(fcotizacion);
        fcotizacion.setVisible(true);
    }//GEN-LAST:event_mnCotizacionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu mmDeptoMuni;
    private javax.swing.JMenu mnAdmin;
    private javax.swing.JMenu mnCotizacion;
    private javax.swing.JMenuItem mnDepartamentos;
    private javax.swing.JMenuItem mnMunicipios;
    private javax.swing.JMenu mnRegistro;
    // End of variables declaration//GEN-END:variables
}
