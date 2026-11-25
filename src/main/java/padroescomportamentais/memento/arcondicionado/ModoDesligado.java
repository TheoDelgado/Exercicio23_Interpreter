package padroescomportamentais.memento.arcondicionado;

public class ModoDesligado implements Modo {

    private ModoDesligado() {};
    private static ModoDesligado instance = new ModoDesligado();
    public static ModoDesligado getInstance() {
        return instance;
    }

    public String getNomeModo() {
        return "Desligado";
    }

}