package padroesestruturais.facade.hotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveRetornarPendenciaRecepcaoCheckout() {
        Hospede hospede = new Hospede();
        Recepcao.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.fazerCheckout());
    }

    @Test
    void deveRetornarPendenciaRestauranteCheckout() {
        Hospede hospede = new Hospede();
        Restaurante.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.fazerCheckout());
    }

    @Test
    void deveRetornarPendenciaGovernancaCheckout() {
        Hospede hospede = new Hospede();
        Governanca.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.fazerCheckout());
    }

    @Test
    void deveRetornarHospedeSemPendenciaCheckout() {
        Hospede hospede = new Hospede();

        assertEquals(true, hospede.fazerCheckout());
    }

}