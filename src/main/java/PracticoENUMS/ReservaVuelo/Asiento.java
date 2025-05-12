package PracticoENUMS.ReservaVuelo;

public enum Asiento {
    ECONOMICA(0.8 , "Economica"),
    BUSSINES(1d, "Bussines"),
    PRIMERA(2d, "Primera");

    private Double multiplicadorClase;
    private String descripcion;

    Asiento(Double mc, String descripcion) {
        this.multiplicadorClase = mc;
        this.descripcion = descripcion;
    }

    public Double getMultiplicador() {
        return this.multiplicadorClase;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
