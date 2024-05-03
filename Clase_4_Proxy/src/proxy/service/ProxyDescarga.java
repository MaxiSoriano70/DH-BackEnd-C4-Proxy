package proxy.service;

import proxy.model.ETipoUsuario;
import proxy.model.Usuario;

public class ProxyDescarga implements IServicioSpotify{
    Descarga descarga;

    public ProxyDescarga() {
        this.descarga = new Descarga();
    }

    @Override
    public String descargarCancion(Usuario usuario) {
        if(usuario.getTipoUsuario() == ETipoUsuario.PREMIUM){
            return descarga.descargarCancion(usuario);
        }
        return "No puedes desscargar eres usuario FREE";
    }
}
