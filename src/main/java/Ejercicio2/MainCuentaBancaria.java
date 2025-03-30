package Ejercicio2;

import java.util.Scanner;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cuanto dinero quiere depositar: ");
        double deposito = entrada.nextInt();

        CuentaBancaria cuenta = new CuentaBancaria(0, "Franco");
        cuenta.ingresarDinero(deposito);


    }
}
