package com.test.model;

import java.util.ArrayList;
import java.util.List;
public class Alumno extends Persona {

    private List<String> asignaturas = new ArrayList<String>();

    public void info(){
        System.out.println("Metodo en la clase com.test.model.Alumno");

    }

    public List<String> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<String> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
