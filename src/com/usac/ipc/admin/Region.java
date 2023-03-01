/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usac.ipc.admin;

/**
 *
 * @author David
 */
public class Region {
    private String codigo;
    private String nombre;
    private float estandar;
    private float especial;

    public Region(String codigo, String nombre, float estandar, float especial) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estandar = estandar;
        this.especial = especial;
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

    public float getEstandar() {
        return estandar;
    }

    public void setEstandar(float estandar) {
        this.estandar = estandar;
    }

    public float getEspecial() {
        return especial;
    }

    public void setEspecial(float especial) {
        this.especial = especial;
    }
    
    
}
