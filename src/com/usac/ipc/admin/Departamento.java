/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usac.ipc.admin;

/**
 *
 * @author David
 */
public class Departamento {
    private String codigoDepartamento;
    private String regionDepartamento;
    private String nombreDepartamento;

    public Departamento(String codigoDepartamento, String regionDepartamento, String nombreDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
        this.regionDepartamento = regionDepartamento;
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getRegionDepartamento() {
        return regionDepartamento;
    }

    public void setRegionDepartamento(String regionDepartamento) {
        this.regionDepartamento = regionDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
    
}
