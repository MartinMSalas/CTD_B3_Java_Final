package com.ctd.b3.java.examen2;

import java.util.ArrayList;
import java.util.List;

public class CargaContenedor extends Carga{
    private double pesoContenedor;
    private List<Carga> listaDeCarga = new ArrayList<>();

    public double getPesoContenedor() {
        return pesoContenedor;
    }

    public void setPesoContenedor(double pesoContenedor) {
        this.pesoContenedor = pesoContenedor;
    }

    public List<Carga> getListaDeCarga() {
        return listaDeCarga;
    }

    public void setListaDeCarga(List<Carga> listaDeCarga) {
        this.listaDeCarga = listaDeCarga;
    }

    @Override
    public double calcularPeso() {
        double resultado = pesoContenedor;
        for (Carga c:listaDeCarga
             ) {
            resultado+=c.calcularPeso();
        }
        return resultado;
    }

    @Override
    public String toString() {
        String info = "";
        for (Carga c:listaDeCarga
             ) {
            info += c.toString();
        }
        return  "----------------------------------------------------------" + '\n' + "Carga Contenedor" + '\n' +
                "PesoContenedor: " + pesoContenedor + '\n' +
                "--------------   Contenido Contenedor   ------------------" + '\n' +
                info + '\n' +
                "Peso Total: " + calcularPeso() + " Kg" + '\n';

    }
}
