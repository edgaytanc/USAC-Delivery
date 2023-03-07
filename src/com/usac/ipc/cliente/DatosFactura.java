/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usac.ipc.cliente;

/**
 *
 * @author David
 */
public class DatosFactura {
    private String correoUsuario;
    private String nombreCompleto;
    private String direccion;
    private String nit;

    public DatosFactura(String correoUsuario, String nombreCompleto, String direccion, String nit) {
        this.correoUsuario = correoUsuario;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.nit = nit;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    
}
