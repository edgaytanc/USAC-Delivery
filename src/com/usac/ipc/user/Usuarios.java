/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usac.ipc.user;
import com.usac.ipc.user.Usuario;
import com.usac.ipc.user.Users;
import java.util.ArrayList;
/**
 *
 * @author David
 */
public class Usuarios implements Users {
    
    
    

    
    public Usuarios() {
        Usuario user = new Usuario("edgaytanc@gmail.com","David",
                "Gaytan","edgc2001--",null,null,
                null,null,null,null,"admin",null );
        add(user);
        
        Usuario normal = new Usuario("pcychips@gmail.com","Edgar",
                "Gaytan","edgc2001--",null,null,
                null,null,null,null,"Usuario",null);
        add(normal);
        
    }
    
    public void add(Usuario user){
        usuarios.add( user);
    }
    
    
    
}
