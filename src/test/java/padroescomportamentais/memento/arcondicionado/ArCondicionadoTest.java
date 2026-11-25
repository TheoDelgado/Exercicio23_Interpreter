package padroescomportamentais.memento.arcondicionado;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArCondicionadoTest {

    @Test
    void deveArmazenarModos() {
        ArCondicionado arCondicionado = new ArCondicionado();
        arCondicionado.setModo(ModoDesligado.getInstance());
        arCondicionado.setModo(ModoResfriamento.getInstance());
        assertEquals(2, arCondicionado.getModos().size());
    }

    @Test
    void deveRetornarModoInicial() {
        ArCondicionado arCondicionado = new ArCondicionado();
        arCondicionado.setModo(ModoDesligado.getInstance());
        arCondicionado.setModo(ModoResfriamento.getInstance());
        arCondicionado.restauraModo(0);
        assertEquals(ModoDesligado.getInstance(), arCondicionado.getModo());
    }

    @Test
    void deveRetornarModoAnterior() {
        ArCondicionado arCondicionado = new ArCondicionado();
        arCondicionado.setModo(ModoDesligado.getInstance());
        arCondicionado.setModo(ModoVentilacao.getInstance());
        arCondicionado.setModo(ModoDesligado.getInstance());
        arCondicionado.setModo(ModoEconomia.getInstance());
        arCondicionado.restauraModo(2);
        assertEquals(ModoDesligado.getInstance(), arCondicionado.getModo());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            ArCondicionado arCondicionado = new ArCondicionado();
            arCondicionado.restauraModo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}