package examen2.leonardobanegas;

public class Solicitudes {

    private UsuarioNormal emisor;
    private UsuarioNormal receptor;

    public Solicitudes(UsuarioNormal emisor, UsuarioNormal receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public Solicitudes() {
    }

    public UsuarioNormal getEmisor() {
        return emisor;
    }

    public void setEmisor(UsuarioNormal emisor) {
        this.emisor = emisor;
    }

    public UsuarioNormal getReceptor() {
        return receptor;
    }

    public void setReceptor(UsuarioNormal receptor) {
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "Solicitudes{" + "emisor=" + emisor + ", receptor=" + receptor + '}';
    }
    
}
