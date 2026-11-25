package padroesestruturais.facade.hotel;

public class Hospede {

    public boolean fazerCheckout() {
        return HospedeFacade.verificarPendenciasCheckout(this);
    }
}