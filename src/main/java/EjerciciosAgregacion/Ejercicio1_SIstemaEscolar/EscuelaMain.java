package EjerciciosAgregacion.Ejercicio1_SIstemaEscolar;

public class EscuelaMain {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(1, "Dr. García");
        Profesor profesor2 = new Profesor(2, "Dra. Martínez");

        Curso curso1 = new Curso(101, "Matemáticas");
        curso1.addProfesor(profesor1);

        Curso curso2 = new Curso(102, "Física");
        curso2.addProfesor(profesor1);
        curso2.addProfesor(profesor2);

        Escuela escuela1 = new Escuela("Universidad Nacional", "Av. Principal 123");
        escuela1.addCurso(curso1);
        escuela1.addCurso(curso2);
        escuela1.addProfesor(profesor1);
        escuela1.addProfesor(profesor2);

        Escuela escuela2 = new Escuela("Instituto Tecnológico", "Calle Secundaria 456");
        escuela2.addProfesor(profesor1);
    }
}
