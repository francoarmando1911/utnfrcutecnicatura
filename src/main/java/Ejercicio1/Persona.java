package Ejercicio1;

public class Persona {

    // - Sus atributos son: nombre, edad, DNI, sexo, peso y altura.
    private String nombre = "";
    private int edad = 0;
    private String sexo = "H";
    private int dni;
    private double peso = 0;
    private double altura = 0;

    public Persona(String nombreTitular) {
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = generaDNI();
    }

    public Persona(String nombre, int edad, String sexo, int dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    /* calcularIMC():
     - Calcula si la persona está en su peso ideal (fórmula: peso en kg / (altura^2 en metros)).
     - Si el valor es menor que 20 → retorna -1 (por debajo del peso ideal).
     - Si está entre 20 y 25 (incluidos) → retorna 0 (peso ideal).
     - Si es mayor a 25 → retorna 1 (sobrepeso).
     - Usar constantes para estos valores de retorno.*/

    public int calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    /* esMayorDeEdad():
     - Devuelve true si la persona es mayor de edad (18 o más), sino false.*/

    public boolean esMayorEdad(int edad) {
        return edad >= 18;
    }

    /* comprobarSexo():
    - Comprueba que el sexo introducido sea válido ('H' o 'M').
    - Si no es válido, se asigna 'H'.
    - No será visible desde fuera (private).*/

    private void comprobarSexo(String sexo) {
        if (sexo.equals("H") || sexo.equals("M")) {
            this.sexo = sexo;
        } else {
            this.sexo = "H";
        }
    }

    /* toString():
     - Devuelve toda la información del objeto en formato String.*/

    public String toString() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("DNI: " + dni);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nSexo: " + sexo + "\nDNI: " + dni + "\nPeso: " + peso + "\nAltura: " + altura;
    }

    /* generaDNI():
    - Genera un número aleatorio de 8 cifras para el DNI.
    - Se invoca automáticamente al construir el objeto.
    - No será visible desde fuera (private).
    - Puede dividirse en varios métodos si es necesario.*/

    private static int generaDNI() {
        return (int) (Math.random() * 100000000);
    }
}
