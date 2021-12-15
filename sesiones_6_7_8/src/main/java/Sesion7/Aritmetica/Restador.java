package Sesion7.Aritmetica;

public class Restador {
    public static double resta(double ...valores) {
        double resultado = 0;

        for (int i = 0; i < valores.length; i++) {
            resultado = resultado - valores[i];
        }

        return resultado;
    }
}
