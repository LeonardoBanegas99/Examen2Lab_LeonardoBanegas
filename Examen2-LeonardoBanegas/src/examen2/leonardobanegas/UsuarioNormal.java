package examen2.leonardobanegas;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

public class UsuarioNormal extends Usuario{
    private ArrayList<Publicacion> publicaciones = new ArrayList();
    private ArrayList<UsuarioNormal> amigos = new ArrayList();
    private ArrayList<Solicitudes> solicitudes = new ArrayList();

    public UsuarioNormal(String nombre, String correo, Date fecha, String nombreusuario, String contraseña, Image imagen) {
        super(nombre, correo, fecha, nombreusuario, contraseña, imagen);
    }

    public UsuarioNormal() {
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    public ArrayList<UsuarioNormal> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<UsuarioNormal> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Solicitudes> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Solicitudes> solicitudes) {
        this.solicitudes = solicitudes;
    }

    @Override
    public String toString() {
        return "UsuarioNormal{" + "publicaciones=" + publicaciones + ", amigos=" + amigos + ", solicitudes=" + solicitudes + '}';
    }
    
    
}
