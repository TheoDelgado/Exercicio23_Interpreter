package padroescomportamentais.interpreter.acesso;

public class Usuario {
    private boolean ativo;
    private boolean verificado;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    public boolean podeAcessar() {
        return Acesso.avaliar(this.ativo, this.verificado);
    }
}