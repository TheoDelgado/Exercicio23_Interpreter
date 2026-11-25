package padroesestruturais.proxy.banco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ContaProxyTest {

    @BeforeEach
    void setUp() {
        BancoDados.addConta(new Conta(1, "João Silva", "Agência 001", 1500.0f, 300.0f));
        BancoDados.addConta(new Conta(2, "Maria Souza", "Agência 002", 2500.0f, 1000.0f));
    }

    @Test
    void deveRetornarDadosCadastraisConta() {
        ContaProxy conta = new ContaProxy(1);

        assertEquals(Arrays.asList("João Silva", "Agência 001"), conta.obterDadosCadastrais());
    }

    @Test
    void deveRetornarSaldosConta() {
        Atendente atendente = new Atendente("Ana", true);
        ContaProxy conta = new ContaProxy(2);

        assertEquals(Arrays.asList(2500.0f, 1000.0f), conta.obterSaldos(atendente));
    }

    @Test
    void deveRetornarExcecaoAtendenteNaoAutorizadoConsultarSaldosConta() {
        try {
            Atendente atendente = new Atendente("Joana", false);
            ContaProxy conta = new ContaProxy(2);

            conta.obterSaldos(atendente);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Atendente não autorizado", e.getMessage());
        }
    }
}