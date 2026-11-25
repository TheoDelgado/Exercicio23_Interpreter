package padroescomportamentais.command.portao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PorteiroTest {

    Porteiro porteiro;
    Portao portao;

    @BeforeEach
    void setUp() {
        porteiro = new Porteiro();
        portao = new Portao("Portão Principal");
    }

    @Test
    void deveAbrirPortao() {
        Comando aberturaPortao = new AberturaPortaoComando(portao);
        porteiro.executarComando(aberturaPortao);

        assertEquals("Portão aberto", portao.getSituacao());
    }

    @Test
    void deveFecharPortao() {
        Comando fechamentoPortao = new FechamentoPortaoComando(portao);
        porteiro.executarComando(fechamentoPortao);

        assertEquals("Portão fechado", portao.getSituacao());
    }

    @Test
    void deveCancelarFechamentoPortao() {
        Comando aberturaPortao = new AberturaPortaoComando(portao);
        Comando fechamentoPortao = new FechamentoPortaoComando(portao);

        porteiro.executarComando(aberturaPortao);
        porteiro.executarComando(fechamentoPortao);

        porteiro.cancelarUltimoComando();

        assertEquals("Portão aberto", portao.getSituacao());
    }

}