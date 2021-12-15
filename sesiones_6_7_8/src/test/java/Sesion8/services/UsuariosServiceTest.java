package Sesion8.services;

import Sesion8.entities.Usuario;
import Sesion8.entities.UsuariosBuilder;
import Sesion8.repositories.UsuariosDB;
import Sesion8.repositories.UsuariosDBFichero;
import Sesion8.repositories.UsuariosDBMemoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuariosServiceTest {
    UsuariosDB usuariosDB = new UsuariosDBFichero();
    Usuario usuario = new UsuariosBuilder("pruebas").build();

    @Test
    void crearUsuario() {
        usuariosDB.insertar(usuario);
    }

    @Nested
    @DisplayName("Con usuario creado")
    class ConUsuarioCreado {
        @Test
        void borrarUsuario() {
            assertEquals(true, usuariosDB.borrar(usuario));
        }
    }
}