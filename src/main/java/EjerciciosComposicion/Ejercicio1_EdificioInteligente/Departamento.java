package EjerciciosComposicion.Ejercicio1_EdificioInteligente;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<SensorAmbiental> sensores;

    public Departamento() {
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(SensorAmbiental sensor) {
        sensores.add(sensor);
    }

    public void eliminarSensor(SensorAmbiental sensor) {
        sensores.remove(sensor);
    }

    public void listarSensores() {
        for (SensorAmbiental sensor : sensores) {
            System.out.println(sensor);
        }
    }
}
