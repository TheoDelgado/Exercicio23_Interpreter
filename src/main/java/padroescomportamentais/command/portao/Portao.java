package padroescomportamentais.command.portao;

public class Portao {

    private String identificacao;
    private String situacao;

    public Portao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirPortao() {
        this.situacao = "Portão aberto";
    }

    public void fecharPortao() {
        this.situacao = "Portão fechado";
    }
}