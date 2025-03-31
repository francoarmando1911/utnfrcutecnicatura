package Ejercicio3;

public class Rectangulo {
    double base;
    double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Perímetro (P) = 2 * (largo + ancho)
    public static double calcularPerimetro(double base, double altura) {
        double perimetro;
        double sumaBase = (base + base);
        double sumaAltura = (altura + altura);
        perimetro = 2 * (sumaBase + sumaAltura);
        return perimetro;
    }

    public static double calcularArea(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }
}
