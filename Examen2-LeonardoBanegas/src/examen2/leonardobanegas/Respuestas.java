package examen2.leonardobanegas;

import java.util.ArrayList;
import java.util.Date;

public class Respuestas extends Publicacion {

    private ArrayList<Respuestas> respuestas = new ArrayList();
    private int calificaciongen;
    private ArrayList<Comentario> comentarios = new ArrayList();

    public Respuestas(int calificaciongen, String ID, String mensaje, Usuario autor, String publicidad, Date fecha) {
        super(ID, mensaje, autor, publicidad, fecha);
        this.calificaciongen = calificaciongen;
    }

    public Respuestas() {
    }

    public ArrayList<Respuestas> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuestas> respuestas) {
        this.respuestas = respuestas;
    }

    public int getCalificaciongen() {
        return calificaciongen;
    }

    public void setCalificaciongen(int calificaciongen) {
        this.calificaciongen = calificaciongen;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return super.toString() + ", calificaciongen=" + calificaciongen + ", comentarios=" + comentarios + '}';
    }

}
