package com.tecsup.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class EditorBean {

    private String comentarios;
    
    private Integer puntuación;

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Integer getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(Integer puntuación) {
        this.puntuación = puntuación;
    }
    
    public String grabar() {
        System.out.println("grabando: " + comentarios);
        return "test";
    }

}
