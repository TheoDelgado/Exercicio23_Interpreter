package padroescomportamentais.interpreter.acesso;

public class E implements InterpretadorExpressao {

    private boolean x;
    private boolean y;

    public E(Booleano elementoEsquerda, Booleano elementoDireita) {
        x = elementoEsquerda.getValor();
        y = elementoDireita.getValor();
    }

    public boolean interpretar() {
        return x && y;
    }
}