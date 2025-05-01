package EjerciciosAgregacion.Ejercicio3_SistemaMedico;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nombre;
    private String direccion;
    private List<Paciente> pacientes;

    public Hospital(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pacientes = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public List<Paciente> getPacientes() { return pacientes; }
}
