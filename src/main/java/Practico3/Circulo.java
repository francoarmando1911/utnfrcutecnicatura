package Practico3;

public class Circulo {
    double radio;
    final double PI = 3.14159265359;


    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //C = 2*pi*r
    public static double calcularPerimetro(double PI, double radio) {
        double perimetro;
        perimetro = 2 * PI * radio;
        return perimetro;
    }

    //A = PI*(r*r)
    public static double calcularArea(double PI, double radio) {
        double area;
        area = PI * (radio * radio);
        return area;
    }


}
