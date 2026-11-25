package padroescomportamentais.memento.arcondicionado;

import java.util.ArrayList;
import java.util.List;

public class ArCondicionado {

    private Modo modo;
    private List<Modo> memento = new ArrayList<Modo>();

    public Modo getModo() {
        return this.modo;
    }

    public void setModo(Modo modo) {
        this.modo = modo;
        this.memento.add(this.modo);
    }

    public void restauraModo(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.modo = this.memento.get(indice);
    }

    public List<Modo> getModos() {
        return this.memento;
    }
}