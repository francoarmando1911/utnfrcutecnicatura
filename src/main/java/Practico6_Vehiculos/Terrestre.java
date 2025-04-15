package Practico6_Vehiculos;

public class Terrestre extends Vehiculo implements Motor {

    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public void acelerar(int velocidad) {
        int vel = velocidadActual + velocidad;
        if (vel > velocidadMaxima) {
            System.out.println("Supera la velocidad máxima permitida.");
        } else {
            velocidadActual = vel;
        }
    }

    @Override
    public void frenar(int velocidad) {
        int vel = velocidadActual - velocidad;
        if (vel < 0) {
            System.out.println("La velocidad no puede ser negativa.");
        } else {
            velocidadActual = vel;
        }
    }

    public void mostrarRevolucionesMotor(int fuerza, int radio) {
        int revoluciones = Motor.calcularRevolucionesMotor(fuerza, radio);
        System.out.println("Las revoluciones del motor son: " + revoluciones);
    }
}
