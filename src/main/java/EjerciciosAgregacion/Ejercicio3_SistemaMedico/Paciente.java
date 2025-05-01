package EjerciciosAgregacion.Ejercicio3_SistemaMedico;

import java.util.List;

public class Paciente {
    private int id;
    private String nombre;
    List<Medico> medicos;

    public Paciente(int id, String nombre, List<Medico> medicos) {
        this.id = id;
        this.nombre = nombre;
        this.medicos = medicos;
    }
}
