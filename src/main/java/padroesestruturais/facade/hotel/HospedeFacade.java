package padroesestruturais.facade.hotel;

public class HospedeFacade {

    public static boolean verificarPendenciasCheckout(Hospede hospede) {
        if (Recepcao.getInstancia().verificarHospedeComPendencia(hospede)) {
            return false;
        }
        if (Restaurante.getInstancia().verificarHospedeComPendencia(hospede)) {
            return false;
        }
        if (Governanca.getInstancia().verificarHospedeComPendencia(hospede)) {
            return false;
        }
        return true;
    }
}