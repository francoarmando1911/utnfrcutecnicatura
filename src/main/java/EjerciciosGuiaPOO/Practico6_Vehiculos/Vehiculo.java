package EjerciciosGuiaPOO.Practico6_Vehiculos;

public class Vehiculo {

    public int velocidadActual;
    public int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int velocidad) {
        System.out.println("Este vehículo no tiene implementación específica para acelerar.");
    }

    public void frenar(int velocidad) {
        System.out.println("Este vehículo no tiene implementación específica para frenar.");
    }
}
