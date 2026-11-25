package padroesestruturais.adapter.tarefa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {

    @Test
    void deveRetornarPrioridadeTarefa() {
        Tarefa tarefa = new Tarefa();
        tarefa.setPrioridade("Alta");

        assertEquals("Alta", tarefa.getPrioridade());
    }

    @Test
    void deveRetornarNivelTarefa() {
        Tarefa tarefa = new Tarefa();
        tarefa.setPrioridade("Alta");

        assertEquals(3, tarefa.getNivel());
    }

}