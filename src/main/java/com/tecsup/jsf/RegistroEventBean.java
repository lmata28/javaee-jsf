package com.tecsup.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RegistroEventBean {

    private String empleado;
    private String[] horario;
    private String transporte;

    public String getEmpleado() {
        return empleado;
    }

    public String[] getHorario() {
        return horario;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }
    

    public void registrar() {
        System.out.println("Hola Registro de evento");
        
    }

}
