package EjercicioHospitalMedico;

public class Paciente extends Persona{

    private String histMedico;
    private int numHistoriaClinica;

    public Paciente(String nombre, String apellido, String direccion, int dni, int telefono, String histMedico, int numHistoriaClinica) {
        super(nombre, apellido, direccion, dni, telefono);
        this.histMedico = histMedico;
        this.numHistoriaClinica = numHistoriaClinica;
    }
}
