package practico4ClaseCuentaHerencia;

import Practico2.CuentaBancaria;

public class CuentaAhorros extends Cuenta {
    public CuentaAhorros(float saldo, int consignaciones, int retiros, float tasaAnual) {
        super(saldo, consignaciones, retiros, tasaAnual);
    }
}
