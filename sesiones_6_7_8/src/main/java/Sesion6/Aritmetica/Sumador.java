package Sesion6.Aritmetica;

import java.util.Arrays;

public class Sumador {
    public double suma(int ...valores) {
        return Arrays.stream(valores).sum();
    }
}
