package EjercicioHospitalMedico;

import java.util.List;

public class Doctor extends Persona {

    private String matricula;
    private List<Especialidad> especialidad;

    public Doctor(String nombre, String apellido, String direccion, int dni, int telefono, String matricula, List<Especialidad> especialidad) {
        super(nombre, apellido, direccion, dni, telefono);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidad.add(especialidad);
    }

    public void removerEspecialidad(Especialidad especialidad){
        this.especialidad.remove(especialidad);
    }
}
