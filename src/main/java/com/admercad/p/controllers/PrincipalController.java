package com.admercad.p.controllers;

import com.admercad.entities.Empleado;
import com.admercad.services.EmpleadoService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author aybso
 * Clase Controller que se encarga de procesar la informacion para la pantalla Principal.xhtml
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
    
    /**
     * Lista de empleados para la tabla
     */
    private List<Empleado> empleados;
    
    /**
     * Servicio con los metodos que realizan la logica de negocio de empleados
     */
    private EmpleadoService empleadoService = new EmpleadoService();
    
    /**
     * Cuando una pantalla del aplicativo comience a generar un bean, el init se ejecuta
     * es decir al momento de la carga de la pantalla
     * Metodo que se encarga de inicializar la informacion de la pantalla principal
     */
    @PostConstruct
    public void init() {
        this.consultarEmpleados();
    }
    
    /**
     * Metodo que consulta la lista de empleados
     */
    public void consultarEmpleados() {
        
        this.empleados = this.empleadoService.consultarEmpleados();
        
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    
    
}
