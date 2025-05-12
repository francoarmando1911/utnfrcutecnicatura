package PracticoENUMS.ReservaVuelo;

public enum OrigenDestino {

    ARG_PER("Argentina", "Peru", 800d),
    ARG_URU("Argentina", "Uruguay", 80d),
    ARG_ITA("Argentina", "Italia", 3000d);

    private String origen;
    private String destino;
    private double distancia_km;

    OrigenDestino(String origen, String destino, double distancia_km) {
        this.origen = origen;
        this.destino = destino;
        this.distancia_km = distancia_km;
    }

    public double getDistancia_km() {
        return distancia_km;
    }

    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }
}
