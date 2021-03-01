package com.admercad.controllers;

import com.admercad.dto.UsuarioDTO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@ManagedBean
public class LoginController {

    private String usuario;

    private String password;
    
    /**
     * Bean que mantiene la informacion en sesion
     * con MangedProperty se inyecta
     */
    @ManagedProperty("#{sessionController}")
    private SessionController sessionController;

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

    public SessionController getSessionController() {
        return sessionController;
    }

    public void setSessionController(SessionController sessionController) {
        this.sessionController = sessionController;
    }
    
    

    public void ingresar() {
        if (usuario.equals("admin") && password.equals("admin")) {
            System.out.println("Usuario: " + usuario);
            try {
                UsuarioDTO usuarioDTO = new UsuarioDTO();
                usuarioDTO.setUsuario(this.usuario);
                usuarioDTO.setPassword(this.password);
                
                this.sessionController.setUsuarioDTO(usuarioDTO);
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
