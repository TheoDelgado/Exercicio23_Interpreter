package padroescomportamentais.interpreter.acesso;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class InterpretadorExpressoesLogicas implements InterpretadorExpressao {

    private InterpretadorExpressao interpretadorInicial;

    public InterpretadorExpressoesLogicas(String contexto) {

        Stack<InterpretadorExpressao> pilhaInterpretadores = new Stack<>();
        List<String> elementos = Arrays.asList(contexto.split(" "));
        Iterator<String> iterator = elementos.iterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            if (elemento.equals("true") || elemento.equals("false")) {
                pilhaInterpretadores.push(new Booleano(Boolean.parseBoolean(elemento)));
            } else if (elemento.equals("AND")) {
                Booleano elementoEsquerda = desempilhar(pilhaInterpretadores, iterator);
                Booleano elementoDireita = proximoOperando(iterator);
                E interpretador = new E(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Booleano(interpretador.interpretar()));
            } else if (elemento.equals("OR")) {
                Booleano elementoEsquerda = desempilhar(pilhaInterpretadores, iterator);
                Booleano elementoDireita = proximoOperando(iterator);
                Ou interpretador = new Ou(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Booleano(interpretador.interpretar()));
            } else if (elemento.equals("XOR")) {
                Booleano elementoEsquerda = desempilhar(pilhaInterpretadores, iterator);
                Booleano elementoDireita = proximoOperando(iterator);
                OuExclusivo interpretador = new OuExclusivo(elementoEsquerda, elementoDireita);
                pilhaInterpretadores.push(new Booleano(interpretador.interpretar()));
            } else {
                throw new IllegalArgumentException("Expressão com elemento inválido");
            }
        }
        if (pilhaInterpretadores.isEmpty()) {
            throw new IllegalArgumentException("Expressão inválida");
        }
        interpretadorInicial = pilhaInterpretadores.pop();
    }

    private Booleano desempilhar(Stack<InterpretadorExpressao> pilha, Iterator<String> iterator) {
        if (!iterator.hasNext() || pilha.isEmpty())
            throw new IllegalArgumentException("Expressão inválida");
        return (Booleano) pilha.pop();
    }

    private Booleano proximoOperando(Iterator<String> iterator) {
        String operando = iterator.next();
        if (!operando.equals("true") && !operando.equals("false"))
            throw new IllegalArgumentException("Expressão com elemento inválido");
        return new Booleano(Boolean.parseBoolean(operando));
    }

    public boolean interpretar() {
        return interpretadorInicial.interpretar();
    }
}