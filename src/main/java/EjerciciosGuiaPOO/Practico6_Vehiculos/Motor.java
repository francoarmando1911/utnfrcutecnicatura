package EjerciciosGuiaPOO.Practico6_Vehiculos;

/*
calcularRevolucionesMotor(int fuerza, int radio): el
número de re- voluciones se calcula como la
multiplicación de la fuerza del motor por su radio.
 */

public interface Motor {
    static int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza * radio;
    }
}
