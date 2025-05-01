package EjercicioHospitalMedico;

public class Especialidad {
    private int idEspecialidadDoctor;
    private String nombre;
    private String descripcion;

    public Especialidad(int idEspecialidadDoctor, String nombre, String descripcion) {
        this.idEspecialidadDoctor = idEspecialidadDoctor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
