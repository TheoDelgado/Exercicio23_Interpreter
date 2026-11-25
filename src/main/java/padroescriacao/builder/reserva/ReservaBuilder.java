package padroescriacao.builder.reserva;

import java.util.Date;

public class ReservaBuilder {

    private Reserva reserva;

    public ReservaBuilder() {
        reserva = new Reserva();
    }

    public Reserva build() {
        if (reserva.getCodigo() == 0) {
            throw new IllegalArgumentException("Código inválido");
        }
        if (reserva.getNomeHospede().equals("")) {
            throw new IllegalArgumentException("Nome do hóspede inválido");
        }
        return reserva;
    }

    public ReservaBuilder setCodigo(int codigo) {
        reserva.setCodigo(codigo);
        return this;
    }

    public ReservaBuilder setNomeHospede(String nomeHospede) {
        reserva.setNomeHospede(nomeHospede);
        return this;
    }

    public ReservaBuilder setDataEntrada(Date dataEntrada) {
        reserva.setDataEntrada(dataEntrada);
        return this;
    }

    public ReservaBuilder setDataSaida(Date dataSaida) {
        reserva.setDataSaida(dataSaida);
        return this;
    }

    public ReservaBuilder setTipoQuarto(String tipoQuarto) {
        reserva.setTipoQuarto(tipoQuarto);
        return this;
    }

    public ReservaBuilder setNumeroHospedes(int numeroHospedes) {
        reserva.setNumeroHospedes(numeroHospedes);
        return this;
    }

    public ReservaBuilder setCafeIncluso(boolean cafeIncluso) {
        reserva.setCafeIncluso(cafeIncluso);
        return this;
    }

    public ReservaBuilder setEstacionamento(boolean estacionamento) {
        reserva.setEstacionamento(estacionamento);
        return this;
    }

    public ReservaBuilder setObservacoes(String observacoes) {
        reserva.setObservacoes(observacoes);
        return this;
    }

    public ReservaBuilder setEmail(String email) {
        reserva.setEmail(email);
        return this;
    }

    public ReservaBuilder setCelular(String celular) {
        reserva.setCelular(celular);
        return this;
    }

}