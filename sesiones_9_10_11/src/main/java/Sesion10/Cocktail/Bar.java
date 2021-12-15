package Sesion10.Cocktail;

public class Bar {
    Bebida bebida;

    public Bar(Bebida bebida) {
        this.bebida = bebida;
    }

    public int contarIngredientes() {
        return bebida.contarIngredientes();
    }
}
