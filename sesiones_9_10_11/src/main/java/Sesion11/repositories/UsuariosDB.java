package Sesion11.repositories;

import Sesion11.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
abstract public class UsuariosDB {

    private int totalInserciones = 0;
    private int totalEliminaciones = 0;

    protected void incrementarInserciones() {
        totalInserciones++;
    }

    protected void incrementarEliminaciones() {
        totalEliminaciones++;
    }

    abstract public ArrayList<Usuario> obtener();

    abstract public Usuario buscar(Usuario usuario);

    abstract public boolean insertar(Usuario usuario);

    abstract public boolean borrar(Usuario usuario);
}
