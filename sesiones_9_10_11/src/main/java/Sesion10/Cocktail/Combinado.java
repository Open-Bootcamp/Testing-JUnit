package Sesion10.Cocktail;

import java.util.ArrayList;

public class Combinado implements Bebida {
    private ArrayList<String> ingredientes = new ArrayList();

    public Combinado() {
        int valor = (int)(Math.random() * 100);

        for (int i = 0; i <= valor; i++) {
            ingredientes.add(String.valueOf(i));
        }
    }

    public ArrayList<String> getIngredientes() {
        System.out.println("Estoy en getIngredientes()");
        return ingredientes;
    }

    public int contarIngredientes() {
        return getIngredientes().size();
    }
}
