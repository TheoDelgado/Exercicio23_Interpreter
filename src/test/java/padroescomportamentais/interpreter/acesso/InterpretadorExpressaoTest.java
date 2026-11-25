package padroescomportamentais.interpreter.acesso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpretadorExpressaoTest {

    @Test
    void deveCalcularExpressaoE() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("true AND false");
        assertEquals(false, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoOu() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("false OR true");
        assertEquals(true, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoOuExclusivo() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("true XOR true");
        assertEquals(false, interpretador.interpretar());
    }

    @Test
    void deveCalcularExpressaoCombinada() {
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("false OR true AND true XOR true");
        assertEquals(false, interpretador.interpretar());
    }

    @Test
    void deveRetonarExcecaoElementoInvalido() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("true NAND false");
            interpretador.interpretar();
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão com elemento inválido", e.getMessage());
        }
    }

    @Test
    void deveRetonarExcecaoInvalida() {
        try {
            InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas("true AND");
            interpretador.interpretar();
            fail();
        } catch(IllegalArgumentException e) {
            assertEquals("Expressão inválida", e.getMessage());
        }
    }

}