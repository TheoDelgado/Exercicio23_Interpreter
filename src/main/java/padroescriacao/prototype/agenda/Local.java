package padroescriacao.prototype.agenda;

public class Local implements Cloneable {
    private String predio;
    private Integer sala;

    public Local(String predio, Integer sala) {
        super();
        this.predio = predio;
        this.sala = sala;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Local{" +
                "predio='" + predio + '\'' +
                ", sala=" + sala +
                '}';
    }
}