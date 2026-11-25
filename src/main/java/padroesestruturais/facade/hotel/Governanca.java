package padroesestruturais.facade.hotel;

public class Governanca extends Setor {

    private static Governanca governanca = new Governanca();

    private Governanca() {};

    public static Governanca getInstancia() {
        return governanca;
    }
}