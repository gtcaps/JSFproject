package com.admercad.controllers;

import com.admercad.entities.Empleado;
import com.admercad.services.EmpleadoService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

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
     * Lista de empleados filtrados
     */
    private List<Empleado> empleadosFiltrados;
    
    
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
        this.empleados = this.empleadoService.consultarEmpleados();
        
    }
    
    public void filaSeleccionada(SelectEvent<Empleado> event){
        String personaSeleccionada = String.valueOf(event.getObject().getNombre());
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,  "Mensaje", personaSeleccionada);
        PrimeFaces.current().dialog().showMessageDynamic(msg);
    }
    

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleadosFiltrados() {
        return empleadosFiltrados;
    }

    public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
        this.empleadosFiltrados = empleadosFiltrados;
    }

    public EmpleadoService getEmpleadoService() {
        return empleadoService;
    }

    public void setEmpleadoService(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }
    
    
    
    
}
