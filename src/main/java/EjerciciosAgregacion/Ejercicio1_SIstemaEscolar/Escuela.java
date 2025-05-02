package EjerciciosAgregacion.Ejercicio1_SIstemaEscolar;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private String nombre;
    private String direccion;
    private List<Curso> cursos;
    private List<Profesor> profesores;

    public Escuela(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cursos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public List<Curso> getCursos() { return cursos; }
    public List<Profesor> getProfesores() { return profesores; }
    public void addCurso(Curso curso) { cursos.add(curso); }
    public void addProfesor(Profesor profesor) { profesores.add(profesor); }
}
