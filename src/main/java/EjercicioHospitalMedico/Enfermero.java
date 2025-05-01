package EjercicioHospitalMedico;

import java.util.List;

public class Enfermero extends Persona{
    private int matricula;
    List<AreaEnfermero> areaEnfermeros;

    public Enfermero(String nombre, String apellido, String direccion, int dni, int telefono, int matricula, List<AreaEnfermero> areaEnfermeros) {
        super(nombre, apellido, direccion, dni, telefono);
        this.matricula = matricula;
        this.areaEnfermeros = areaEnfermeros;
    }

    public void agregarAreaEnfermero(AreaEnfermero areaEnfermero) {
        this.areaEnfermeros.add(areaEnfermero);
    }

    public void eliminarAreaEnfermero(AreaEnfermero areaEnfermero){
        this.areaEnfermeros.remove(areaEnfermero);
    }
}
