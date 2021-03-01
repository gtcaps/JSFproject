package com.admercad.controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author aybso
 * Clase que se encarga de cerrar la sesion del usuario
 */
@ManagedBean
public class SessionCloseController {
    
    @PostConstruct
    public void init () {
        
    }
    
    /**
     * Metodo que permite cerrar la sesion del usuario y regresar a la pantalla de login
     */
    public void cerrarSesion() {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.invalidateSession();
        
        try {
            this.redireccionar("login.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(SessionCloseController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * 
     * @param pagina {@link String} pagina a redireccionar
     * @throws IOException Excepcion en caso de error al encontrar la pagina
     */
    private void redireccionar(String pagina) throws IOException {
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(pagina);
    }
    
}
