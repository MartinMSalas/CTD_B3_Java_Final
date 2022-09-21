package com.ctd.b3.java.examen2;

public class Test {
    public static void main(String[] args) {
        CargaFactory cf = CargaFactory.getInstancia();
        // creamos carga Simples y les ponemos info
        CargaSimple cs1 = (CargaSimple) cf.crearCarga("Simple");
        cs1.setPesoCarga(3);
        cs1.setRefrigerada(false);
        cs1.setNombre("Tv32");
        cs1.setDescripcion("Tv 32 pulgadas");
        CargaSimple cs2 = (CargaSimple) cf.crearCarga("Simple");
        cs2.setPesoCarga(2);
        cs2.setRefrigerada(true);
        cs2.setNombre("MediPack");
        cs2.setDescripcion("Caja de medicamentos - Refrigerar");
        // creamos un contenedor
        CargaContenedor cc1 = (CargaContenedor) cf.crearCarga("Contenedor");
        cc1.setPesoContenedor(100);
        cc1.setNombre("ContLiv");
        cc1.setDescripcion("Contenedor Liviano Chico");

        cc1.getListaDeCarga().add(cs1);
        cc1.getListaDeCarga().add(cs2);

        // pruebas internas del dev
        /*
        System.out.println(cc1.calcularPeso());
        System.out.println(cs1);
        System.out.println(cc1);
        Carga fallida = cf.crearCarga("carga Random");
         */

        // Creamos un barco y le cargamos 2 contenedores iguales
        Barco barco1 = new Barco("Libertad");
        barco1.getListaCarga().add(cc1);
        barco1.getListaCarga().add(cc1);
        //mostramos la carga del barco
        barco1.mostrarCarga();



    }
}
