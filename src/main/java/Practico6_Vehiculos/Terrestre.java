package Practico6_Vehiculos;

public class Terrestre extends Vehiculo implements Motor{

    public Terrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    //Metodo para acelerar
    public static int acelerar(int velocidad){
        return velocidad + 40;
    }

    //Metodo para frenar
    public static int frenar(int velocidad){
        return velocidad - 40;
    }

    //calcularRevolucionesMotor
    public static int calcuarRevolucionesMotor(int fuerza, int radio){

    }
}
