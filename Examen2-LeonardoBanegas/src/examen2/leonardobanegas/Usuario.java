package examen2.leonardobanegas;

import java.awt.Image;
import java.util.Date;
import javax.swing.Icon;

public class Usuario {

    private String nombre;
    private String correo;
    private Date fecha;
    private String nombreusuario;
    private String contraseña;
    private Icon imagen;

    public Usuario(String nombre, String correo, Date fecha, String nombreusuario, String contraseña, Icon imagen) {
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

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }

}
