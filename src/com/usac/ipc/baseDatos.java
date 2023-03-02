/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usac.ipc;

import com.usac.ipc.admin.Departamento;
import com.usac.ipc.admin.Kiosko;
import com.usac.ipc.admin.Municipio;
import com.usac.ipc.admin.Region;
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
    
    //metodos de acceso
    //public void addKiosko(Kiosko k);
}
