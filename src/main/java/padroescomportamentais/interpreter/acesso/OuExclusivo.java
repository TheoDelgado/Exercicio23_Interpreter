package padroescomportamentais.interpreter.acesso;

public class OuExclusivo implements InterpretadorExpressao {

    private boolean x;
    private boolean y;

    public OuExclusivo(Booleano elementoEsquerda, Booleano elementoDireita) {
        x = elementoEsquerda.getValor();
        y = elementoDireita.getValor();
    }

    public boolean interpretar() {
        return x ^ y;
    }
}