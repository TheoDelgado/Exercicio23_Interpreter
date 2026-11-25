package padroescomportamentais.command.portao;

public class AberturaPortaoComando implements Comando {

    private Portao portao;

    public AberturaPortaoComando(Portao portao) {
        this.portao = portao;
    }

    public void executar() {
        this.portao.abrirPortao();
    }

    public void cancelar() {
        this.portao.fecharPortao();
    }
}