package padroesestruturais.proxy.banco;

import java.util.HashMap;
import java.util.Map;

public class BancoDados {
    private static Map<Integer, Conta> contas = new HashMap<>();

    public static Conta getConta(Integer numero) {
        return contas.get(numero);
    }

    public static void addConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }
}