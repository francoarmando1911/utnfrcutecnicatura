package Practico6_Vehiculos;

public class Acuatico extends Vehiculo implements Vela {

    public Acuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public void acelerar(int velocidad) {
        int vel = velocidadActual + velocidad;
        if (vel > velocidadMaxima) {
            System.out.println("Supera la velocidad máxima permitida en el agua.");
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

    @Override
    public String recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            return "La velocidad del viento es muy alta, se recomienda no salir a navegar.";
        } else {
            return "La velocidad del viento es adecuada para navegar.";
        }
    }
}
