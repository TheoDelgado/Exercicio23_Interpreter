package padroescomportamentais.interpreter.acesso;

public class Acesso {

    public static String formula = "ativo AND verificado";

    public static boolean avaliar(boolean ativo, boolean verificado) {
        String expressao;
        expressao = formula.replace("ativo", Boolean.toString(ativo));
        expressao = expressao.replace("verificado", Boolean.toString(verificado));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesLogicas(expressao);
        return interpretador.interpretar();
    }
}