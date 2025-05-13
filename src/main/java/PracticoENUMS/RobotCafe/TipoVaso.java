package PracticoENUMS.RobotCafe;

public enum TipoVaso {
    //VALORES EN ML
    PEQUENIO(60d, 3000, 1d),
    MEDIANO(160d, 8000, 1.5d),
    GRANDE(224d, 10000, 2);

    private double tamanioVaso;
    private double costo;
    private double multiplicador;

    TipoVaso(double tamanioVaso, double costo, double multiplicador) {
        this.tamanioVaso = tamanioVaso;
        this.costo = costo;
        this.multiplicador = multiplicador;
    }

    public double getTamanioVaso() {
        return tamanioVaso;
    }

    public double getCosto() {
        return costo;
    }

    public double getMultiplicador() {
        return multiplicador;
    }
}
