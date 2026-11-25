package padroesestruturais.adapter.tarefa;

public class PrioridadeTexto implements IPrioridade {

    private String prioridade;

    @Override
    public String getPrioridade() {
        return this.prioridade;
    }

    @Override
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}