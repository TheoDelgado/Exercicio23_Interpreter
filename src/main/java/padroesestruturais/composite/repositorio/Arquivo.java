package padroesestruturais.composite.repositorio;

public class Arquivo extends Item {

    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        super(nome);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getEstrutura() {
        return "Arquivo: " + this.getNome() + " - tamanho: " + this.tamanho + " KB\n";
    }

}