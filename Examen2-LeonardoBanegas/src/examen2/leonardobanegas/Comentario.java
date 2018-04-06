package examen2.leonardobanegas;

import java.util.Date;

public class Comentario extends Publicacion {

    private String comentario;

    public Comentario(String comentario, String ID, String mensaje, Usuario autor, String publicidad, Date fecha) {
        super(ID, mensaje, autor, publicidad, fecha);
        this.comentario = comentario;
    }

    public Comentario() {
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" + "comentario=" + comentario + '}';
    }

}
