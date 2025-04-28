package EjerciciosGuiaPOO.Practico7ValidadorCorrelativas;

import java.util.List;

public class Alumno {

    private String nombre;
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre, List<Materia> materiasAprobadas, String legajo) {
        this.nombre = nombre;
        this.materiasAprobadas = materiasAprobadas;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
