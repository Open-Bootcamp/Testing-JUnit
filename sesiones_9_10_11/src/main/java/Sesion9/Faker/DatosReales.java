package Sesion9.Faker;

import java.util.ArrayList;

public class DatosReales {
    public DatosReales() {
        System.out.println("Datos conectados, en produccion!");
    }

    public void estoEsReal() {

    }

    public ArrayList<Double> getData() {
        ArrayList<Double> retorno = new ArrayList();
        for (int i = 0; i < 3; i++) {
            double valor = Math.random() * 100;
            retorno.add(valor);

        }

        return retorno;
    }
}
