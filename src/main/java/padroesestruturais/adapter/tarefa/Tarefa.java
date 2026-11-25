package padroesestruturais.adapter.tarefa;

public class Tarefa {

    IPrioridade prioridade;
    PrioridadeAdapter persistencia;

    public Tarefa() {
        prioridade = new PrioridadeTexto();
        persistencia = new PrioridadeAdapter(prioridade);
    }

    public void setPrioridade(String prioridade) {
        this.prioridade.setPrioridade(prioridade);
        persistencia.salvarPrioridade();
    }

    public String getPrioridade() {
        return persistencia.recuperarPrioridade();
    }

    // Método apenas para mostrar que está convertendo prioridade para nível através do adaptador
    public int getNivel() {
        return persistencia.getNivel();
    }

}