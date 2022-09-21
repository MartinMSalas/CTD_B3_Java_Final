package com.ctd.b3.java.examen2;

public class CargaSimple extends Carga{
    private double pesoCarga;
    private boolean refrigerada;

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public boolean isRefrigerada() {
        return refrigerada;
    }

    public void setRefrigerada(boolean refrigerada) {
        this.refrigerada = refrigerada;
    }

    @Override
    public double calcularPeso() {
        double resultado = pesoCarga;
        if(refrigerada)
            resultado *= 1.1;
        return resultado;
    }

    @Override
    public String toString() {
        return "---- Contenido Carga Simple ----" + '\n' +
                "Nombre: " + getNombre() + "    Peso: " + calcularPeso() + " Kg" + '\n';
    }
}
