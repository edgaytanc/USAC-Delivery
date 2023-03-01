/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usac.ipc.admin;

/**
 *
 * @author David
 */
public class Kiosko {
    private String codigo;
    private String nombre;
    private String codRegion;

    public Kiosko(String codigo, String nombre, String codRegion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.codRegion = codRegion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(String codRegion) {
        this.codRegion = codRegion;
    }
    
    
}
