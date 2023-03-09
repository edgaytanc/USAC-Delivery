/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usac.ipc.cliente;

/**
 *
 * @author David
 */
public class Factura {
    private int     numFactura;
    private String  codigoPaquete;
    private String  origen;
    private String  destino;
    private String  nit;
    private String  tipoPago;
    private String  tamano;
    private int     numeroPaquete;
    private float   total;

    public Factura(int numFactura, String codigoPaquete, String origen, String destino, String nit, String tipoPago, String tamano, int numeroPaquete, float total) {
        this.numFactura = numFactura;
        this.codigoPaquete = codigoPaquete;
        this.origen = origen;
        this.destino = destino;
        this.nit = nit;
        this.tipoPago = tipoPago;
        this.tamano = tamano;
        this.numeroPaquete = numeroPaquete;
        this.total = total;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
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

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public void setNumeroPaquete(int numeroPaquete) {
        this.numeroPaquete = numeroPaquete;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
