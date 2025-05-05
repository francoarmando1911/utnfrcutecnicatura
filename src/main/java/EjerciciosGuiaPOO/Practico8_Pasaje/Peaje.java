package EjerciciosGuiaPOO.Practico8_Pasaje;

import java.util.List;

public class Peaje {
    private String nombre;
    private String departamento;
    private int totalPeaje = 0;
    private int totalMotos = 0;
    private int totalCarros = 0;
    private int totalCamiones = 0;
    List<Vehiculo> vehiculo;

    public Peaje(String nombre, String departamento, int totalPeaje, int totalMotos, int totalCarros, int totalCamiones, List<Vehiculo> vehiculo) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalPeaje = totalPeaje;
        this.totalMotos = totalMotos;
        this.totalCarros = totalCarros;
        this.totalCamiones = totalCamiones;
        this.vehiculo = vehiculo;
    }

    public void aniadirVehiculo(Vehiculo vehiculo){
        this.vehiculo.add(vehiculo);
    }

    /*public int calcularTotalPeaje(Vehiculo vehiculo) {
        int peaje = 0;
        if (vehiculo instanceof Carro) {
            peaje = 10000;
            totalCarros++;
        } else if (vehiculo instanceof Moto) {
            peaje = 5000;
            totalMotos++;
        } else if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            peaje = 5000 * camion.getNumeroEjes();
            totalCamiones++;
        }
        totalPeaje += peaje;
        return peaje;
    }*/
}
