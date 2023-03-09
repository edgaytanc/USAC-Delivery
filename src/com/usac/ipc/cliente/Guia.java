/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usac.ipc.cliente;

import java.util.Date;

/**
 *
 * @author David
 */
public class Guia {
    private String codigoPaquete;
    private String origen;
    private String destino;
    private String tipoPago;
    private String tamano;
    private int numeroPaquetes;
    private Date fechaEnvio;
    private float total;

    public Guia(String codigoPaquete, String origen, String destino, String tipoPago, String tamano, int numeroPaquetes, Date fechaEnvio, float total) {
        this.codigoPaquete = codigoPaquete;
        this.origen = origen;
        this.destino = destino;
        this.tipoPago = tipoPago;
        this.tamano = tamano;
        this.numeroPaquetes = numeroPaquetes;
        this.fechaEnvio = fechaEnvio;
        this.total = total;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getNumeroPaquetes() {
        return numeroPaquetes;
    }

    public void setNumeroPaquetes(int numeroPaquetes) {
        this.numeroPaquetes = numeroPaquetes;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
}
