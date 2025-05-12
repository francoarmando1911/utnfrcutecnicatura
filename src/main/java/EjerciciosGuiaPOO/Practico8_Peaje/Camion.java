package EjerciciosGuiaPOO.Practico8_Peaje;

public class Camion {
    private int numeroEjes;
    private String matricula;

    public Camion(int numeroEjes, String matricula) {
        this.numeroEjes = numeroEjes;
        this.matricula = matricula;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
