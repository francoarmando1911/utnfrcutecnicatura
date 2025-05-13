package PracticoENUMS.RobotCafe;

public enum TipoCafe {
    //TIPO DE CAFE Y RECETA
    ESPRESSO (70d, 18d, 70d, 5d),
    LATTE(0d,18d,30d,5d),
    CAPPUCCINO(0d,18d,30d,5d),
    AMERICANO(0d,18d,30d,5d);

    private double aguaml;
    private double cafegr;
    private double lecheml;
    private double azucargr;

    TipoCafe(double aguaml, double cafegr, double lecheml, double azucargr) {
        this.aguaml = aguaml;
        this.cafegr = cafegr;
        this.lecheml = lecheml;
        this.azucargr = azucargr;
    }

    public double getAguaml() {
        return aguaml;
    }

    public double getCafegr() {
        return cafegr;
    }

    public double getLecheml() {
        return lecheml;
    }

    public double getAzucargr() {
        return azucargr;
    }
}
