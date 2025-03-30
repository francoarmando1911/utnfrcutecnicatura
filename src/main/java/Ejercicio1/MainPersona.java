package Ejercicio1;
/* Clase Main:
   - Crear 3 objetos de la clase Persona:
   - El primero con todos los atributos seteados.
   - El segundo con nombre, edad y sexo (sin peso ni altura).
   - El tercero usando el constructor por defecto y luego setear los valores usando los métodos set.

Para cada objeto:
 - Comprobar si está en su peso ideal, tiene sobrepeso o está por debajo del peso ideal. Mostrar un mensaje.
 - Indicar si es mayor de edad.
 - Mostrar la información completa del objeto (usando toString()).*/

public class MainPersona {
    public static void main(String[] args) {
        // Crear 3 objetos de la clase Persona
        Persona persona1 = new Persona("Franco", 22, "H", 12345678, 90, 1.85);
        Persona persona2 = new Persona("Natalia", 30, "M");
        Persona persona3 = new Persona();

        // Setear valores para el tercer objeto
        persona3.setNombre("Iñaki");
        persona3.setEdad(26);
        persona3.setSexo("H");
        persona3.setPeso(85);
        persona3.setAltura(1.80);

        // Comprobar peso ideal y mostrar mensaje
        System.out.println(persona1.toString());
        System.out.println("Peso ideal: " + persona1.calcularIMC(persona1.getPeso(), persona1.getAltura()));
        System.out.println("Mayor de edad: " + persona1.esMayorEdad(persona1.getEdad()));

        System.out.println(persona2.toString());
        System.out.println("Peso ideal: " + persona2.calcularIMC(persona2.getPeso(), persona2.getAltura()));
        System.out.println("Mayor de edad: " + persona2.esMayorEdad(persona2.getEdad()));

        System.out.println(persona3.toString());
        System.out.println("Peso ideal: " + persona3.calcularIMC(persona3.getPeso(), persona3.getAltura()));
        System.out.println("Mayor de edad: " + persona3.esMayorEdad(persona3.getEdad()));
    }
}
