package proxy.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import proxy.model.ETipoUsuario;
import proxy.model.Usuario;

import static org.junit.jupiter.api.Assertions.*;

class IServicioSpotifyTest {

    @Test
    @DisplayName("La descarga a sido completada con exito. Gracias por ser PREMIUM")
    void testPremium(){
        Usuario usuarioP = new Usuario("696969", ETipoUsuario.PREMIUM);
        IServicioSpotify iServicioSpotify = new ProxyDescarga();
        String respuestaObtenida = iServicioSpotify.descargarCancion(usuarioP);
        assertEquals("La descarga a sido completada con exito. Gracias por ser PREMIUM",respuestaObtenida);
    }

    @Test
    @DisplayName("La descarga a sido completada con exito. Gracias por ser PREMIUM")
    void testFreeRechazado(){
        Usuario usuarioP = new Usuario("696969", ETipoUsuario.FREE);
        IServicioSpotify iServicioSpotify = new ProxyDescarga();
        String respuestaObtenida = iServicioSpotify.descargarCancion(usuarioP);
        assertNotEquals("La descarga a sido completada con exito. Gracias por ser PREMIUM",respuestaObtenida);
    }

    @Test
    @DisplayName("No puedes desscargar eres usuario FREE")
    void testFree(){
        Usuario usuarioP = new Usuario("696969", ETipoUsuario.FREE);
        IServicioSpotify iServicioSpotify = new ProxyDescarga();
        String respuestaObtenida = iServicioSpotify.descargarCancion(usuarioP);
        assertEquals("No puedes desscargar eres usuario FREE",respuestaObtenida);
    }

}