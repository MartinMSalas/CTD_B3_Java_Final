package com.ctd.b3.java.examen2;

public class CargaFactory {
    private static CargaFactory instancia;

    private CargaFactory(){

    }

    public static CargaFactory getInstancia(){
        if(instancia==null){
            instancia = new CargaFactory();
        }
        return instancia;
    }

    public Carga crearCarga(String tipoCarga) throws RuntimeException{
        Carga c;
        switch (tipoCarga){
            case "Simple":
                c = new CargaSimple();
                break;
            case "Contenedor":
                c = new CargaContenedor();
                break;
            default:
                c = null;
                throw new RuntimeException("No se puede crear ese tipo de carga");
        }
        return c;
    }
}
