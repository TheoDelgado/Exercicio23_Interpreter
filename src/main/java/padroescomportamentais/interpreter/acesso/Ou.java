package padroescomportamentais.interpreter.acesso;

public class Ou implements InterpretadorExpressao {

    private boolean x;
    private boolean y;

    public Ou(Booleano elementoEsquerda, Booleano elementoDireita) {
        x = elementoEsquerda.getValor();
        y = elementoDireita.getValor();
    }

    public boolean interpretar() {
        return x || y;
    }
}