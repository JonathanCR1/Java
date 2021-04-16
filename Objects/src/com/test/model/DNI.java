package com.test.model;

public class DNI {

    private String letra;
    private long numero;

    public DNI(String letra, long numero) {
        this.letra = letra;
        this.numero = numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "com.test.model.DNI{" +
                "letra='" + letra + '\'' +
                ", numero=" + numero +
                '}';
    }
}
