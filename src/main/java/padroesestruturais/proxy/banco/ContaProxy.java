package padroesestruturais.proxy.banco;

import java.util.List;

public class ContaProxy implements IConta {

    private Conta conta;

    private Integer numero;

    public ContaProxy(Integer numero) {
        this.numero = numero;
    }

    @Override
    public List<String> obterDadosCadastrais() {
        if (this.conta == null) {
            this.conta = new Conta(this.numero);
        }
        return this.conta.obterDadosCadastrais();
    }

    @Override
    public List<Float> obterSaldos(Atendente atendente) {
        if (!atendente.isGerente()) {
            throw new IllegalArgumentException("Atendente não autorizado");
        }
        if (this.conta == null) {
            this.conta = new Conta(this.numero);
        }
        return this.conta.obterSaldos(atendente);
    }
}