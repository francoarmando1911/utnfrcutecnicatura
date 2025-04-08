package practico4_cuenta_bancaria;

public class CuentaAhorros extends Cuenta {

    private boolean activa;

    public CuentaAhorros(float saldo, int consignaciones, int nroRetiros, float tasaAnual) {
        super(saldo, consignaciones, nroRetiros, tasaAnual);
        this.activa = saldo > 10000;
    }

    @Override
    public void retirar(double cantidad) {
        if (activa) {
            if (cantidad <= getSaldo()) {
                setSaldo(getSaldo() - (float) cantidad);
                setNroRetiros(getNroRetiros() + 1);
            } else {
                System.out.println("Saldo insuficiente para retirar.");
            }
        } else {
            System.out.println("La cuenta está inactiva. No se puede retirar.");
        }
    }

    @Override
    public void consignar(double cantidad) {
        if (cantidad > 0) {
            setSaldo(getSaldo() + (float) cantidad);
            setConsignaciones(getConsignaciones() + 1);
            actualizarEstado();
        }
    }

    private void actualizarEstado() {
        activa = getSaldo() >= 10000;
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
        actualizarEstado();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Estado de la cuenta: " + (activa ? "Activa" : "Inactiva"));
    }
}
