package com.test.model;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean trabajo;
    public static String empresa= "java";
    private DNI dni;

    public Persona(DNI dni) {
        this.dni = dni;
    }

    public static String getEmpresa() {
        return empresa;
    }

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    public static void setEmpresa(String empresa) {
        Persona.empresa = empresa;
    }

    public static void empresaDev(){

        System.out.println("Mi empresa es: " +empresa);
    }

    public Persona () {
        super();
        System.out.println("Llamando al constructor por defecto");
    }

    public Persona(String nombre,String apellidos, int edad , boolean trabajo){
        super();
        this.nombre= nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.trabajo=trabajo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTrabajo() {
        return trabajo;
    }

    public void setTrabajo(boolean trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String toString() {
        return "com.test.model.Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", trabajo=" + trabajo +
                '}';
    }

    public void info(){
        System.out.println("Metodo en la clase com.test.model.Persona");

    }
}
