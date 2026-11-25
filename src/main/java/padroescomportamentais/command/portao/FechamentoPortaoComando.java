package padroescomportamentais.command.portao;

public class FechamentoPortaoComando implements Comando {

    private Portao portao;

    public FechamentoPortaoComando(Portao portao) {
        this.portao = portao;
    }

    public void executar() {
        this.portao.fecharPortao();
    }

    public void cancelar() {
        this.portao.abrirPortao();
    }
}