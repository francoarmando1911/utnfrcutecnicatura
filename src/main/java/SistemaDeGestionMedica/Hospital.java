package SistemaDeGestionMedica;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String nombre;
    private String direccion;
    private int telefono;

    private List<Doctor> doctores;
    private List<Paciente>pacientes;
    private List<SalaAtencion> sala;
    private List<Quirofano> quirofanos;

    public Hospital(List<Doctor> doctores, List<Paciente> paciente, List<SalaAtencion> sala, List<Quirofano> quirofanos) {
        this.doctores = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.sala = new ArrayList<>();
        this.quirofanos = new ArrayList<>();
    }


    public Hospital(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void agregarDoctor(Doctor doctores){
        this.doctores.add(doctores);
    }

    public void agregarPaciente(Paciente paciente){
        this.pacientes.add(paciente);
    }

    public void agregarSala(SalaAtencion sala){
        this.sala.add(sala);
    }

    public void agregarQuirofano(Quirofano quirofano){
        this.quirofanos.add(quirofano);
    }
}
