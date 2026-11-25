package padroesestruturais.composite.repositorio;

public class Repositorio {

    private Item raiz;

    public void setRaiz(Item raiz) {
        this.raiz = raiz;
    }

    public String getEstrutura() {
        if (this.raiz == null) {
            throw new NullPointerException("Repositório sem raiz");
        }
        return this.raiz.getEstrutura();
    }
}