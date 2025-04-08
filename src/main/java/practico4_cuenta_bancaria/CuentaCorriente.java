package practico4_cuenta_bancaria;

public class CuentaCorriente extends Cuenta {

    private float sobregiroSaldo;

    public CuentaCorriente(float sobregiroSaldo) {
        this.sobregiroSaldo = sobregiroSaldo;
    }

    public CuentaCorriente(float saldo, int consignaciones, int nroRetiros, float tasaAnual, float sobregiroSaldo) {
        super(saldo, consignaciones, nroRetiros, tasaAnual);
        this.sobregiroSaldo = sobregiroSaldo;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            //Si la cantidad que se quiere retirar es menor que el saldo
            if (cantidad <= getSaldo()) {
                setSaldo(getSaldo() - (float) cantidad);
                setNroRetiros(getNroRetiros() + 1);
            } else {
                // Si no hay suficiente saldo se realiza el sobregiro
                float faltante = (float) (cantidad - getSaldo());
                setSaldo(0);
                sobregiroSaldo += faltante;
                setNroRetiros(getNroRetiros() + 1);
                System.out.println("Se ha usado sobregiro por $" + faltante);
            }
        }
    }

    public float getSobregiroSaldo() {
        return sobregiroSaldo;
    }

    public void setSobregiroSaldo(float sobregiroSaldo) {
        this.sobregiroSaldo = sobregiroSaldo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro usado: $" + sobregiroSaldo);
    }
}

