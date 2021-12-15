package Sesion11.services;

import Sesion11.entities.Usuario;
import Sesion11.entities.UsuariosBuilder;
import Sesion11.repositories.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UsuariosServiceTest {
    @Mock
    UsuariosDB usuariosDB;

    @InjectMocks
    UsuariosService usuariosService;// = new UsuariosService();

    Usuario usuario = new UsuariosBuilder("usuarioStub").build();

    @Test
    void crearUsuario() {
        when(usuariosDB.insertar(usuario))
                .thenReturn(false);

        boolean resultado = usuariosService.crearUsuario(usuario);
        assertTrue(resultado);
    }
}