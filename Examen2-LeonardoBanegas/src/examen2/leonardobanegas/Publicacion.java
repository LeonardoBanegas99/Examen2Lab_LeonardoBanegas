package examen2.leonardobanegas;

import java.util.Date;

public class Publicacion {
    private String ID;
    private String mensaje;
    private Usuario autor;
    private String publicidad;
    private Date fecha;

    public Publicacion(String ID, String mensaje, Usuario autor, String publicidad, Date fecha) {
        this.ID = ID;
        this.mensaje = mensaje;
        this.autor = autor;
        this.publicidad = publicidad;
        this.fecha = fecha;
    }

    public Publicacion() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public String getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(String publicidad) {
        this.publicidad = publicidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "ID=" + ID + ", mensaje=" + mensaje + ", autor=" + autor + ", publicidad=" + publicidad + ", fecha=" + fecha + '}';
    }
    
}
