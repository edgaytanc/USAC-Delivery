/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usac.ipc;

import com.usac.ipc.admin.Departamento;
import com.usac.ipc.admin.Kiosko;
import com.usac.ipc.admin.Municipio;
import com.usac.ipc.admin.Region;
import com.usac.ipc.cliente.DatosFactura;
import com.usac.ipc.cliente.Factura;
import com.usac.ipc.cliente.Guia;
import com.usac.ipc.cliente.Tarjeta;
import java.util.ArrayList;

/**
 *
 * @author David
 */
public interface baseDatos {
    static ArrayList<Kiosko> kiosko = new ArrayList<>();
    static ArrayList<Region> regiones = new ArrayList<>();
    static ArrayList<Departamento> departamentos = new ArrayList<>();
    static ArrayList<Municipio> municipios = new ArrayList<>();
    static ArrayList<Tarjeta> tarjetas = new ArrayList<>();
    static ArrayList<DatosFactura> datosFacturas = new ArrayList<>();
    static ArrayList<Factura> facturas = new ArrayList<>();
    static ArrayList<Guia> guias = new ArrayList<>();
    static String correoCliente = new String();
    
    
    //metodos de acceso
    //public void addKiosko(Kiosko k);
}
