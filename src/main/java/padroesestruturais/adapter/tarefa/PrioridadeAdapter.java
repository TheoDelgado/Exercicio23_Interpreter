package padroesestruturais.adapter.tarefa;

public class PrioridadeAdapter extends PrioridadeNivel {

    private IPrioridade prioridadeTexto;

    public PrioridadeAdapter(IPrioridade prioridadeTexto) {
        this.prioridadeTexto = prioridadeTexto;
    }

    public String recuperarPrioridade() {
        if (this.getNivel() >= 3)
            prioridadeTexto.setPrioridade("Alta");
        else
        if (this.getNivel() >= 2)
            prioridadeTexto.setPrioridade("Media");
        else
            prioridadeTexto.setPrioridade("Baixa");
        return prioridadeTexto.getPrioridade();
    }

    public void salvarPrioridade() {
        if (prioridadeTexto.getPrioridade().equals("Alta"))
            this.setNivel(3);
        else
        if (prioridadeTexto.getPrioridade().equals("Media"))
            this.setNivel(2);
        else
        if (prioridadeTexto.getPrioridade().equals("Baixa"))
            this.setNivel(1);
        else
            this.setNivel(0);
    }
}