package com.admercad.controllers;

import com.admercad.dto.UsuarioDTO;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author aybso
 * Clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo en sesion
 */
@ManagedBean(name="sessionController")
@SessionScoped
public class SessionController {
    
    /**
     * Usuario que se mantendra en sesion
     */
    private UsuarioDTO usuarioDTO;
    
    /**
     * Inicializa la sesion del usuario
     */
    @PostConstruct
    public void init() {
        System.out.println("Cargando informacion de usuario en la sesion ...");
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }
    
    
    
}
