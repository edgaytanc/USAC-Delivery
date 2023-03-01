/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.usac.ipc.user;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public interface Users {
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public void add(Usuario user);
    
}
