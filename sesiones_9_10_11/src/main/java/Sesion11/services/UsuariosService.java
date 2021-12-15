package Sesion11.services;


import Sesion11.entities.Usuario;
import Sesion11.entities.UsuariosBuilder;
import Sesion11.repositories.UsuariosDB;
import Sesion11.repositories.UsuariosDBMemoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuariosService {
    UsuariosDB usuariosDB = new UsuariosDBMemoria();

    public void UsuariosService() {}

    public ArrayList<Usuario> listarUsuarios() {
        return usuariosDB.obtener();
    }

    public void setUsuariosDB(UsuariosDB usuariosDB) {
        this.usuariosDB = usuariosDB;
    }

    public Usuario obtenerUsuario(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        return usuariosDB.buscar(usuario);
    }

    /*
     * - Cosas a probar:
     *   - Si le paso un objeto "usuario" nulo, ¿me devuelve algun error?
     *   - Si el usuario ya existe, ¿lo crea igualmente?
     *          - Si ya existe, DEBO OBTENER "ya existe"
     *          - Si no existe, no debo obtener nada
     *
     *   - Si el usuario NO existe, ¿lo crea?
     *      - Si lo crea con éxito, no debo obtener nada PERO PUEDO BUSCARLO
     *      - Si no lo crea, debo obtener un valor de retorno null.
     */
    public boolean crearUsuario(Usuario usuario) {
        if (usuariosDB.buscar(usuario) instanceof Usuario) {
            return false;
        }

        return usuariosDB.insertar(usuario);
    }

    public boolean borrarUsuario(String username) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;
        return usuariosDB.borrar(usuario);
    }

    private Usuario crearUsuarioReal(Usuario usuario) {
        UsuariosBuilder usuariosBuilder = new UsuariosBuilder(usuario.nombreUsuario);

        return usuariosBuilder
                .conNombre(usuario.nombre)
                .conApellidos(usuario.apellidos)
                .conNivelDeAcceso(usuario.nivelAcceso)
                .conEmail(usuario.email)
                .build();
    }
}

