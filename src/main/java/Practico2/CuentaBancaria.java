package Practico2;
import Practico1.Persona;
/*
Crea una clase llamada CuentaBancaria que tendrá los siguientes atributos: titular y saldo (puede tener decimales).
El titular es del tipo Persona ( Persona del Practico 1) será obligatorio y el saldo se inicializa en cero. Crea el/los
constructores que cumplan lo anterior.
Tendrá dos métodos especiales:
    - Ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
    - Retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa
    no se debe permitir.
 */

public class CuentaBancaria {
    private Persona titular;
    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldo, String nombreTitular) {
        this.saldo = saldo = 0.0;
        this.titular = new Persona(nombreTitular);
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double cantidad){
        if(cantidad > 0){
            this.saldo += cantidad;
            System.out.println("Dinero ingresado: " + cantidad);
            System.out.println("Saldo actual: " + this.saldo);
        }
    }

    public void retirarDinero(double cantidad){
        if(cantidad > 0 && cantidad <= this.saldo){
            this.saldo -= cantidad;
            System.out.println("Dinero retirado: " + cantidad);
            System.out.println("Saldo actual: " + this.saldo);
        }
    }
}
