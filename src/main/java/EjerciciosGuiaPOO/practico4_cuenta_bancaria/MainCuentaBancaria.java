package EjerciciosGuiaPOO.practico4_cuenta_bancaria;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaAhorros ahorro = new CuentaAhorros(9500, 0, 0, 0.04f); // Saldo < 10000, inactiva
        CuentaCorriente corriente = new CuentaCorriente(5000);

        System.out.println("Cuenta de Ahorros");
        ahorro.imprimir();

        System.out.println();

        ahorro.retirar(1000);
        ahorro.consignar(1000);

        System.out.println();

        ahorro.retirar(200);
        ahorro.extractoMensual();
        ahorro.imprimir();

        System.out.println();

        System.out.println("Cuenta corriente");
        corriente.imprimir();
    }
}
