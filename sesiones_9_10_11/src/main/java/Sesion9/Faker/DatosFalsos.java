package Sesion9.Faker;

import java.util.ArrayList;

public class DatosFalsos extends DatosReales {

    @Override
    public ArrayList<Double> getData() {
        ArrayList<Double> retorno = new ArrayList();
        retorno.add(1.0);
        retorno.add(2.0);
        retorno.add(3.0);

        return retorno;
    }

}
