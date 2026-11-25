package padroescomportamentais.memento.arcondicionado;

public class ModoResfriamento implements Modo {

    private ModoResfriamento() {};
    private static ModoResfriamento instance = new ModoResfriamento();
    public static ModoResfriamento getInstance() {
        return instance;
    }

    public String getNomeModo() {
        return "Resfriamento";
    }

}