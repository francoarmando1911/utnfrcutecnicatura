package EjerciciosGuiaPOO.Practico6_Vehiculos;

public class MainVehiculos {
    public static void main(String[] args) {
        Terrestre camioneta = new Terrestre(50, 120);

        System.out.println("Camioneta:");
        camioneta.acelerar(40);  // Acelera
        System.out.println("Velocidad actual después de acelerar: " + camioneta.getVelocidadActual());

        camioneta.frenar(30);  // Frena 30
        System.out.println("Velocidad actual después de frenar: " + camioneta.getVelocidadActual());
        System.out.println();

        // Crear una moto de agua
        Acuatico motoAcuatica = new Acuatico(30, 80); // velocidad actual 30, velocidad máxima 80

        System.out.println("Moto Acuática:");
        motoAcuatica.acelerar(20);  // Acelera 20 km/h
        System.out.println("Velocidad actual después de acelerar: " + motoAcuatica.getVelocidadActual());

        motoAcuatica.frenar(10);  // Frena 10 km/h
        System.out.println("Velocidad actual después de frenar: " + motoAcuatica.getVelocidadActual());

        // Recomendar velocidad según la velocidad del viento
        int velocidadViento = 85;
        System.out.println(motoAcuatica.recomendarVelocidad(velocidadViento));
    }
}
