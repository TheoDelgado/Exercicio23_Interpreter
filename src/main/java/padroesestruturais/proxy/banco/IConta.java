package padroesestruturais.proxy.banco;

import java.util.List;

public interface IConta {
    List<String> obterDadosCadastrais();
    List<Float> obterSaldos(Atendente atendente);
}