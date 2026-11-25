package padroescriacao.builder.reserva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaBuilderTest {

    @Test
    void deveRetornarExcecaoParaReservaSemCodigo() {
        try {
            ReservaBuilder reservaBuilder = new ReservaBuilder();
            Reserva reserva = reservaBuilder
                    .setNomeHospede("Hóspede 1")
                    .setEmail("hospede1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaReservaSemNomeDoHospede() {
        try {
            ReservaBuilder reservaBuilder = new ReservaBuilder();
            Reserva reserva = reservaBuilder
                    .setCodigo(1)
                    .setEmail("hospede1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do hóspede inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarReservaValida() {
        ReservaBuilder reservaBuilder = new ReservaBuilder();
        Reserva reserva = reservaBuilder
                .setCodigo(1)
                .setNomeHospede("Hóspede 1")
                .setEmail("hospede1@email.com")
                .build();

        assertNotNull(reserva);
    }
}