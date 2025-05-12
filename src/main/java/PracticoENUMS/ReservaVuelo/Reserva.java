package PracticoENUMS.ReservaVuelo;

public class Reserva {
    Pasajero pasajero;
    OrigenDestino origenDestino;
    Asiento TipoAsiento;

    private static final Double PRECIO_BASE = 2d;

    public Reserva(Pasajero pasajero, OrigenDestino origenDestino, Asiento tipoAsiento) {
        this.pasajero = pasajero;
        this.origenDestino = origenDestino;
        TipoAsiento = tipoAsiento;
    }

    public Double calcularPrecio() {
        return calcularPrecio(this.TipoAsiento, this.origenDestino);
    }

    public static Double calcularPrecio(Asiento tipoAsiento, OrigenDestino origenDestino) {
        return origenDestino.getDistancia_km()*PRECIO_BASE * tipoAsiento.getMultiplicador();

    }

}
