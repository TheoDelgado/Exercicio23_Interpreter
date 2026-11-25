package padroescomportamentais.interpreter.acesso;

public class Booleano implements InterpretadorExpressao {

    private boolean valor;

    public Booleano(boolean valor) {
        this.valor = valor;
    }

    public boolean interpretar() {
        return valor;
    }

    public boolean getValor() {
        return this.valor;
    }

}