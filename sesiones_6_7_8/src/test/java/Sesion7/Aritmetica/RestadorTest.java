package Sesion7.Aritmetica;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestadorTest {

    private String hola = "";

    @Test
    @DisplayName("Resta con un solo valor")
    void resta() {
    }

    @Nested
    @DisplayName("Resta con varios valores")
    public class RestadorUnValorTest {
        @Test
        void restaDosValores() {
            double valor1 = 5;
            double valor2 = 3;
            double resultado = Restador.resta(valor1, valor2);
            assertEquals(-8, resultado);
        }

        @Nested
        public class RestadorTresValoresTest {
            @Test
            void restaDosValores() {
                double valor1 = 5;
                double valor2 = 3;
                double valor3 = 1;
                assertEquals(-9, Restador.resta(valor1, valor2, valor3));
            }
        }
    }
}