package com.admercad.p.controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

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
        if (usuario.equals("admin") && password.equals("admin")) {
            System.out.println("Usuario: " + usuario);
            try {
                this.redireccionar("principal.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", 
                        new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no se encuentra", ""));
            }
        } else {
            FacesContext.getCurrentInstance().addMessage("formLogin:txtPassword", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario Incorrecto", ""));
        }
    }

    private void redireccionar(String pagina) throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(pagina);
    }

}
