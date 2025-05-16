package PracticoENUMS.ValidacionUsuarios;

import java.util.Scanner;

public class MainUsuarios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        RegistroService servicio = new RegistroService();

        try {
            System.out.println("Ingrese su nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();
            System.out.println("Ingrese su correo: ");
            String correo = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
}