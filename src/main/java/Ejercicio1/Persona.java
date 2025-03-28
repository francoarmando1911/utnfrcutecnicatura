package Ejercicio1;
// Crear una clase llamada Persona que siga las siguientes condiciones:

// Atributos:
// - Sus atributos son: nombre, edad, DNI, sexo, peso y altura.
// - Sexo puede ser 'H' (hombre) o 'M' (mujer).
// - No queremos que se accedan directamente a ellos (usa modificador de acceso private).
// - Usar el tipo de dato adecuado para cada atributo.
// - Se puede añadir algún atributo adicional si se considera necesario.

// Valores por defecto:
// - Todos los atributos menos el DNI tendrán valores por defecto según su tipo:
//   - Números: 0
//   - Strings: ""
//   - Sexo será 'H' por defecto, usar una constante para esto.

// Constructores:
// - Constructor por defecto (sin parámetros).
// - Constructor con nombre, edad y sexo (el resto con valores por defecto).
// - Constructor con todos los atributos como parámetro.

// Métodos a implementar:

// calcularIMC():
// - Calcula si la persona está en su peso ideal (fórmula: peso en kg / (altura^2 en metros)).
// - Si el valor es menor que 20 → retorna -1 (por debajo del peso ideal).
// - Si está entre 20 y 25 (incluidos) → retorna 0 (peso ideal).
// - Si es mayor a 25 → retorna 1 (sobrepeso).
// - Usar constantes para estos valores de retorno.

// esMayorDeEdad():
// - Devuelve true si la persona es mayor de edad (18 o más), sino false.

// comprobarSexo():
// - Comprueba que el sexo introducido sea válido ('H' o 'M').
// - Si no es válido, se asigna 'H'.
// - No será visible desde fuera (private).

// toString():
// - Devuelve toda la información del objeto en formato String.

// generaDNI():
// - Genera un número aleatorio de 8 cifras para el DNI.
// - Se invoca automáticamente al construir el objeto.
// - No será visible desde fuera (private).
// - Puede dividirse en varios métodos si es necesario.

// Métodos set:
// - Implementar métodos set para cada atributo excepto el DNI.

public class Persona {

}
