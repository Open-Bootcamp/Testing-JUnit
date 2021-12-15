package Sesion10.Cocktail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BarTest {

    @Test
    void contarIngredientes() {
        Bebida bebida = mock(Cerveza.class);

        when(bebida.contarIngredientes())
                .thenReturn(5);

        Bar bar = new Bar(bebida);
        assertEquals(50, bar.contarIngredientes());
    }
}