package proxy.service;

import proxy.model.Usuario;

public class Descarga implements IServicioSpotify{
    @Override
    public String descargarCancion(Usuario usuario) {
        return "La descarga a sido completada con exito. Gracias por ser PREMIUM";
    }
}
