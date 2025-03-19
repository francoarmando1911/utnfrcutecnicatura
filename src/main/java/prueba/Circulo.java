package prueba;

public class Circulo {
    private double radio = 5;
    private String color;
    static int numeroCirculos = 0;
    static final double PI = 3.1416;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double getCircunsferencia() {
        return getCircunsferencia(this.radio);
    }

    static double getCircunsferencia(double r) {
        return 2 * r * PI;
    }

}