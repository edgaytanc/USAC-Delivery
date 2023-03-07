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
    
    public static void modificaActivo(String correo){
        int cont=0;
        for(Usuario u: usuarios){
            if(u.getCorreo().equals(correo)){
                if(u.getActivo()==false){
                    u.setActivo(true);
                }
                else{
                    u.setActivo(false);
                }
                usuarios.set(cont, u);
            }
            cont++;
        }
    }
    
    public static Usuario getUsuarioActivo(){
        for(Usuario u : usuarios){
            if(u.getActivo()==true){
                return u;
            }
        }
        return null;
    }
    
}
