package com.admercad.p.controllers;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginController {
    
    private String usuario;
    
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void ingresar() {
        System.out.println("Usuario: " +  usuario);
    }
    
}
