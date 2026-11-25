package padroesestruturais.proxy.banco;

import java.util.Arrays;
import java.util.List;

public class Conta implements IConta {

    private Integer numero;
    private String titular;
    private String agencia;
    private Float saldoCorrente;
    private Float saldoPoupanca;

    public Conta(int numero) {
        this.numero = numero;
        Conta objeto = BancoDados.getConta(numero);
        this.titular = objeto.titular;
        this.agencia = objeto.agencia;
        this.saldoCorrente = objeto.saldoCorrente;
        this.saldoPoupanca = objeto.saldoPoupanca;
    }

    public Conta(Integer numero, String titular, String agencia, Float saldoCorrente, Float saldoPoupanca) {
        this.numero = numero;
        this.titular = titular;
        this.agencia = agencia;
        this.saldoCorrente = saldoCorrente;
        this.saldoPoupanca = saldoPoupanca;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public List<String> obterDadosCadastrais() {
        return Arrays.asList(this.titular, this.agencia);
    }

    @Override
    public List<Float> obterSaldos(Atendente atendente) {
        return Arrays.asList(this.saldoCorrente, this.saldoPoupanca);
    }
}