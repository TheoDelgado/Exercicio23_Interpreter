package padroescriacao.prototype.agenda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Evento evento = new Evento(123, "Reunião de Planejamento", new Local("Prédio A", 1), "Maria");

        Evento eventoClone = evento.clone();
        eventoClone.setCodigo(456);
        eventoClone.setTitulo("Reunião de Planejamento - Semana 2");
        eventoClone.getLocal().setSala(2);

        assertEquals("Evento{codigo=123, titulo='Reunião de Planejamento', local=Local{predio='Prédio A', sala=1}, organizador='Maria'}", evento.toString());
        assertEquals("Evento{codigo=456, titulo='Reunião de Planejamento - Semana 2', local=Local{predio='Prédio A', sala=2}, organizador='Maria'}", eventoClone.toString());
    }
}