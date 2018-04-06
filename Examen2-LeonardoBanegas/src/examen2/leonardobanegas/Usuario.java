package examen2.leonardobanegas;

import java.awt.Image;
import java.util.Date;

public class Usuario {
    private String nombre;
    private String correo;
    private Date fecha;
    private String nombreusuario;
    private String contraseña;
    private Image imagen;

    public Usuario(String nombre, String correo, Date fecha, String nombreusuario, String contraseña, Image imagen) {
        this.nombre = nombre;
        this.correo = correo;
        this.fecha = fecha;
        this.nombreusuario = nombreusuario;
        this.contraseña = contraseña;
        this.imagen = imagen;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correo=" + correo + ", fecha=" + fecha + ", nombreusuario=" + nombreusuario + ", contrase\u00f1a=" + contraseña + ", imagen=" + imagen + '}';
    }
    
}
