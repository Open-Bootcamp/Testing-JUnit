package Sesion10.Cocktail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class   CombinadoTest {

    @Test
    void contarIngredientes() {
        CombinadoStub combinado = new CombinadoStub();
        int resultado = combinado.contarIngredientes();
        assertEquals(3, resultado);

        for (String cosa : combinado.getIngredientes()) {
            System.out.println("cosa actual: " + cosa);
        }
    }


}