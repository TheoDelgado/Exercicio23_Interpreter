package padroescomportamentais.memento.arcondicionado;

public class ModoVentilacao implements Modo {

    private ModoVentilacao() {};
    private static ModoVentilacao instance = new ModoVentilacao();
    public static ModoVentilacao getInstance() {
        return instance;
    }

    public String getNomeModo() {
        return "Ventilação";
    }

}