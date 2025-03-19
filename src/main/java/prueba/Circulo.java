package prueba;

public class Circulo {
    double radio = 5;
    String color;
    static int numeroCirculos = 0;
    static final double PI = 3.1416;

    double getCircunsferencia() {
        return getCircunsferencia(this.radio);
    }

    static double getCircunsferencia(double r) {
        return 2 * r * PI;
    }

}