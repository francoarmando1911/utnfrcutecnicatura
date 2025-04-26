package EjerciciosComposicion.Ejercicio1_EdificioInteligente;

public class MainEjercicioInteligente {
    public static void main(String[] args) {
        EdificioInteligente edificio = new EdificioInteligente();

        Departamento depto1 = new Departamento();
        Departamento depto2 = new Departamento();

        edificio.agregarDepartamento(depto1);
        edificio.agregarDepartamento(depto2);

        edificio.listarDepartamentos();
    }
}
