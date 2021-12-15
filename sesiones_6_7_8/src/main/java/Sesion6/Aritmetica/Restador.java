package Sesion6.Aritmetica;

import java.util.Arrays;

public class Restador {
    public double resta(int ...valores) {
        return Arrays.stream(valores).reduce(0, (a, b) -> a - b);
    }
}
