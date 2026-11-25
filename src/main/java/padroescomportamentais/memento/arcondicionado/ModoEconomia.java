package padroescomportamentais.memento.arcondicionado;

public class ModoEconomia implements Modo {

    private ModoEconomia() {};
    private static ModoEconomia instance = new ModoEconomia();
    public static ModoEconomia getInstance() {
        return instance;
    }

    public String getNomeModo() {
        return "Economia";
    }

}