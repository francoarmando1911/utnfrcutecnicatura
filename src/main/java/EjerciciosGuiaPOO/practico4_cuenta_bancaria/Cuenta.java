package EjerciciosGuiaPOO.practico4_cuenta_bancaria;

public class Cuenta {
    private float saldo;
    private int consignaciones = 0;
    private int nroRetiros = 0;
    private float tasaAnual;
    private float comisionMensual = 0;
    private int tiempo;

    public Cuenta() {
    }

    public Cuenta(float saldo, int consignaciones, int nroRetiros, float tasaAnual) {
        this.saldo = saldo;
        this.consignaciones = consignaciones;
        this.nroRetiros = nroRetiros;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getConsignaciones() {
        return consignaciones;
    }

    public void setConsignaciones(int consignaciones) {
        this.consignaciones = consignaciones;
    }

    public int getNroRetiros() {
        return nroRetiros;
    }

    public void setNroRetiros(int nroRetiros) {
        this.nroRetiros = nroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void calcularInteresMensual() {
        double interesMensual = (saldo * tasaAnual) / 12;
        saldo += interesMensual;
    }

    public void consignar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            consignaciones++;
        } else {
            System.out.println("La cantidad a consignar debe ser mayor que cero.");
        }
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            nroRetiros++;
        } else {
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
        }
    }


    public void imprimir() {
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Tasa anual: " + (tasaAnual * 100) + "%");
        System.out.println("Comisión mensual: $" + comisionMensual);
    }

}
