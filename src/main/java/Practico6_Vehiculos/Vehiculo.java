package Practico6_Vehiculos;

public class Vehiculo {

    private int velocidadActual;
    private int velocidadMaxima;

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

    //Metodo para acelerar
    public static int acelerar(int velocidad){
        return velocidad;
    }

    //Metodo para frenar
    public static int frenar(int velocidad){
        return velocidad;
    }
}
