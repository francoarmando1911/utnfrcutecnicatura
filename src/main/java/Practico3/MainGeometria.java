package Practico3;

/*
Crear clases  `Circulo`, `Rectangulo` y `Triangulo`  cada una de estas debe tener los siguientes metodos:
   - `double calcularArea()`
   - `double calcularPerimetro()`

   - `Circulo` debe tener un atributo `radio`
   - `Rectangulo` debe tener atributos `base` y `altura`
   - `Triangulo` debe tener atributos `lado1`, `lado2`, `lado3`

 En la clase `Main`, crear instancias de cada forma y mostrar por pantalla sus áreas y perímetros.
 */

import static java.lang.Math.PI;

public class MainGeometria {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Rectangulo rectangulo = new Rectangulo();

        double perimetroCirculo = Circulo.calcularPerimetro(PI, 15);
        double areaCirculo = Circulo.calcularArea(PI, 15);
        System.out.println("El perimetro del circulo es: " + perimetroCirculo);
        System.out.println("El area del circulo es: " + areaCirculo);

        double perimetroRectangulo = Rectangulo.calcularPerimetro(27, 40);
        double areaRectangulo = Rectangulo.calcularArea(27, 40);
        System.out.println("El periemtro del rectangulo es: " + perimetroRectangulo);
        System.out.println("El area del rectangulo es: " + areaRectangulo);

        double perimetroTriangulo = Triangulo.calcularPerimetro(15, 25, 30);
        double areaTriangulo = Triangulo.calcularArea(15, 25, 30);
        System.out.println("El perimetro del triangulo es: " + perimetroTriangulo);
        System.out.println("El area del triangulo es: " + areaTriangulo);

    }
}
