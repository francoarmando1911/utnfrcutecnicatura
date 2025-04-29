package EjerciciosGuiaPOO.Practico7ValidadorCorrelativas;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private ArrayList<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<Materia>();
    }

    public Materia(Materia correlativas, String nombre) {
        this.correlativas.add(correlativas);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<Materia> correlativas) {
        this.correlativas = correlativas;
    }

}
