package com.ctd.b3.java.examen2;

import java.util.ArrayList;
import java.util.List;

public class Barco {
    private String nombre;
    private List<Carga> listaCarga = new ArrayList<>();

    public Barco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carga> getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(List<Carga> listaCarga) {
        this.listaCarga = listaCarga;
    }

    public void mostrarCarga(){
        double resultado = 0;
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Reporte de carga en Barco: " + nombre + '\n' +
                "----------------------------------------------------------------------------------");

        for (Carga c: listaCarga
             ) {
            System.out.println(c);
            resultado += c.calcularPeso();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Peso total de la carga: " + resultado + " kg");
    }
}
