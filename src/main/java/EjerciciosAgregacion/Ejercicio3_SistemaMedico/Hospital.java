package EjerciciosAgregacion.Ejercicio3_SistemaMedico;

import java.util.List;

public class Hospital {
    private String nombre;
    private String direccion;
    List<Paciente> pacientes;

    public Hospital(String nombre, String direccion, List<Paciente> pacientes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pacientes = pacientes;
    }
}
