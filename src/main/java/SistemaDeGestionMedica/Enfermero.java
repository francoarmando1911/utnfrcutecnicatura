package SistemaDeGestionMedica;

import java.util.ArrayList;
import java.util.List;

public class Enfermero {

    private String nombre;
    private String matricula;
    private List<SalaAtencion> sala;

    public enum areaServicio{
        ANESTESISTA,
        NURSE,
        ASISTENCIA
    }

    public List<SalaAtencion> asignarSala(SalaAtencion sala) {
        if (this.sala == null) {
            this.sala = new ArrayList<>();
        }
        this.sala.add(sala);
        return this.sala;
    }
}
