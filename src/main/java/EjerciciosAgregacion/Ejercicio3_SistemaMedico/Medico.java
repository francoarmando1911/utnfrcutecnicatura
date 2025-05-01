package EjerciciosAgregacion.Ejercicio3_SistemaMedico;

import java.util.List;

public class Medico {
    private int id;
    private String nombre;
    private String especialidad;
    List<Paciente> pacientes;

    public Medico(int id, String nombre, String especialidad, List<Paciente> pacientes) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pacientes = pacientes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }
}
