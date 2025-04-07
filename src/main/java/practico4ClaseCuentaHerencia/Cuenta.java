package practico4ClaseCuentaHerencia;

public class Cuenta {
    private float saldo;
    private int consignaciones = 0;
    private int retiros = 0;
    private float tasaAnual;
    private float comisionMensual = 0;
    public int tiempo;

    public Cuenta(float saldo, int consignaciones, int retiros, float tasaAnual) {
        this.saldo = saldo;
        this.consignaciones = consignaciones;
        this.retiros = retiros;
        this.tasaAnual = tasaAnual;
    }

    public double calcularInteres(){
        double interes = 0;
        interes = saldo * tasaAnual * tiempo;
        return interes;
    }

    private double extractoMensual(){
        double extractoMensual = 0;
        extractoMensual = comisionMensual + retiros;
        return extractoMensual;
    }

}
