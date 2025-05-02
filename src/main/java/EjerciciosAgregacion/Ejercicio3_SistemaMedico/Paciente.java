package EjerciciosAgregacion.Ejercicio3_SistemaMedico;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private int id;
    private String nombre;
    private List<Medico> medicos;

    public Paciente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.medicos = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Medico> getMedicos() { return medicos; }
}
