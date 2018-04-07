package examen2.leonardobanegas;

import java.util.ArrayList;
import java.util.Date;

public class Problema extends Publicacion {

    private ArrayList<Respuestas> respuestas = new ArrayList();
    private String estado;
    private String categoria;

    public Problema(String estado, String categoria, String ID, String mensaje, Usuario autor, String publicidad, Date fecha) {
        super(ID, mensaje, autor, publicidad, fecha);
        this.estado = estado;
        this.categoria = categoria;
    }

    public Problema() {
    }

    public ArrayList<Respuestas> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuestas> respuestas) {
        this.respuestas = respuestas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", categoria=" + categoria + '}';
    }

}
