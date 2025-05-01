package EjerciciosAgregacion.Ejercicio3_SistemaMedico;

public class MainHospital {
    public static void main(String[] args) {

        Medico medico1 = new Medico(1, "Dr. Pérez", "Cardiología");
        Medico medico2 = new Medico(2, "Dra. Gómez", "Pediatría");

        Paciente paciente1 = new Paciente(101, "Ana López");
        paciente1.getMedicos().add(medico1);
        paciente1.getMedicos().add(medico2);
        medico1.getPacientes().add(paciente1);
        medico2.getPacientes().add(paciente1);

        Paciente paciente2 = new Paciente(102, "Carlos Ruiz");
        paciente2.getMedicos().add(medico2);
        medico2.getPacientes().add(paciente2);


        Hospital hospital1 = new Hospital("Hospital Central", "Calle Principal 123", "4");
        hospital1.getPacientes().add(paciente1);
        hospital1.getPacientes().add(paciente2);

        Hospital hospital2 = new Hospital("Clínica Norte", "Avenida Secundaria 456");
        hospital2.getPacientes().add(paciente1);
    }
}
