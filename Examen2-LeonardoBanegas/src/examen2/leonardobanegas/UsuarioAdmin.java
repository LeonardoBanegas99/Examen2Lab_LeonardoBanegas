package examen2.leonardobanegas;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioAdmin extends Usuario {

    private ArrayList<Publicacion> publicacionesbloqueadas = new ArrayList();
    private ArrayList<UsuarioNormal> usuariosnormalesblock = new ArrayList();

    public UsuarioAdmin(String nombre, String correo, Date fecha, String nombreusuario, String contraseña, Image imagen) {
        super(nombre, correo, fecha, nombreusuario, contraseña, imagen);
    }

    public UsuarioAdmin() {
    }

    public ArrayList<Publicacion> getPublicacionesbloqueadas() {
        return publicacionesbloqueadas;
    }

    public void setPublicacionesbloqueadas(ArrayList<Publicacion> publicacionesbloqueadas) {
        this.publicacionesbloqueadas = publicacionesbloqueadas;
    }

    public ArrayList<UsuarioNormal> getUsuariosnormalesblock() {
        return usuariosnormalesblock;
    }

    public void setUsuariosnormalesblock(ArrayList<UsuarioNormal> usuariosnormalesblock) {
        this.usuariosnormalesblock = usuariosnormalesblock;
    }

    @Override
    public String toString() {
        return "UsuarioAdmin{" + "publicacionesbloqueadas=" + publicacionesbloqueadas + ", usuariosnormalesblock=" + usuariosnormalesblock + '}';
    }

    
}
