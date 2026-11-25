package padroescomportamentais.interpreter.acesso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void devePermitirAcessoComFormula() {
        Usuario usuario = new Usuario();
        usuario.setAtivo(true);
        usuario.setVerificado(true);

        assertEquals(true, usuario.podeAcessar());
    }

    @Test
    void deveNegarAcessoComFormula() {
        Usuario usuario = new Usuario();
        usuario.setAtivo(true);
        usuario.setVerificado(false);

        assertEquals(false, usuario.podeAcessar());
    }

}