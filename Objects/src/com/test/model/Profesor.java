package com.test.model;

import com.test.model.Persona;

public class Profesor extends Persona {

    private String asignatura;

    @Override
    public String getNombre() {
        System.out.println("Accediendo al getter de nombre de profesor");
        return super.getNombre();
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "com.test.model.Profesor{" +
                "asignatura='" + asignatura + '\'' +
                '}';
    }
}
