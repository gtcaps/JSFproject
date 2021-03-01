package com.admercad.dto;

/**
 *
 * @author aybso
 * Clase que permitira contener la informacion del usuario en sesion
 */
public class UsuarioDTO {
    
    /**
     * Usuario
     */
    private String usuario;
    
    /**
     * Password
     */
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
    
    
    
}
