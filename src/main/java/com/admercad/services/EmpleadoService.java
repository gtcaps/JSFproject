package com.admercad.services;

import java.util.ArrayList;
import java.util.List;

import com.admercad.entities.Empleado;

/**
 *
 * @author aybso
 * Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
    
    /**
     * Metodo que permite consultar la lista de empleados de empresas de TI
     * @return {@link Empleado} lista de empleados
     */
    public List<Empleado> consultarEmpleados() {
        //Generar lista de empleados a consultar
        List<Empleado> empleados = new ArrayList<Empleado>();
        
        Empleado empleadoIBM = new Empleado();
        Empleado empleadoMicrosoft = new Empleado();
        Empleado empleadoApple = new Empleado();
        
        empleadoIBM.setNombre("Pedro");
        empleadoIBM.setApellido("Perez");
        empleadoIBM.setPuesto("Programador");
        empleadoIBM.setEstatus(true);
        
        empleadoMicrosoft.setNombre("Uriel");
        empleadoMicrosoft.setApellido("Hernandez");
        empleadoMicrosoft.setPuesto("CEO");
        empleadoMicrosoft.setEstatus(true);
        
        empleadoApple.setNombre("Oscar");
        empleadoApple.setApellido("Blancarte");
        empleadoApple.setPuesto("Arquitecto de Software");
        empleadoApple.setEstatus(false);
        
        empleados.add(empleadoIBM);
        empleados.add(empleadoMicrosoft);
        empleados.add(empleadoApple);
        
        
        for(int i = 0; i < 50; i++) {
            Empleado nuevoEmpleado = new Empleado();
            nuevoEmpleado.setNombre("Nombre " + i);
            nuevoEmpleado.setApellido("Apellido" + i);
            nuevoEmpleado.setPuesto("Programador " + i);
            nuevoEmpleado.setEstatus(true);
            empleados.add(nuevoEmpleado);
        }
        
        
        return empleados;
    }
    
}
