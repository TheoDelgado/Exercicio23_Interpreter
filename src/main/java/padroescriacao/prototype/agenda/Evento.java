package padroescriacao.prototype.agenda;

public class Evento implements Cloneable {
    private int codigo;
    private String titulo;
    private Local local;
    private String organizador;

    public Evento(int codigo, String titulo, Local local, String organizador) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.local = local;
        this.organizador = organizador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    @Override
    public Evento clone() throws CloneNotSupportedException {
        Evento eventoClone = (Evento) super.clone();
        eventoClone.local = (Local) eventoClone.local.clone();
        return eventoClone;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", local=" + local +
                ", organizador='" + organizador + '\'' +
                '}';
    }
}