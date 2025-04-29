package SistemaDeGestionMedica;

public class Doctor {

    private String nombre;
    private String matricula;

    public enum especialidad{
        PEDIATRA,
        ONCOLOGO,
        NEUROLOGO,
        TRAUMATOLOGO
    }

    public Doctor(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }
}
