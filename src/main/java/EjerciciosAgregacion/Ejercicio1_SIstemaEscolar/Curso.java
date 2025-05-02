package EjerciciosAgregacion.Ejercicio1_SIstemaEscolar;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String nombre;
    private List<Profesor> profesores;

    public Curso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
    }

    public List<Profesor> getProfesores() { return profesores; }
    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
}
