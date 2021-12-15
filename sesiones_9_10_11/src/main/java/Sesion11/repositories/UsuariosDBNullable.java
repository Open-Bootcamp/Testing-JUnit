package Sesion11.repositories;

import Sesion11.entities.Usuario;

import java.util.ArrayList;

public class UsuariosDBNullable extends UsuariosDB {
    @Override
    public ArrayList<Usuario> obtener() {
        return null;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        return null;
    }

    @Override
    public boolean insertar(Usuario usuario) {
        return false;
    }

    @Override
    public boolean borrar(Usuario usuario) {
        return true;
    }
}
