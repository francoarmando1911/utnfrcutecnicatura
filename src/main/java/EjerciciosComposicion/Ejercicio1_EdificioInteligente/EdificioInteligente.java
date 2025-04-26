package EjerciciosComposicion.Ejercicio1_EdificioInteligente;

import java.util.ArrayList;
import java.util.List;

public class EdificioInteligente {
    private List<Departamento> departamentos;

    public EdificioInteligente() {
        this.departamentos = new ArrayList<>();
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void eliminarDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void listarDepartamentos() {
        for (Departamento departamento : departamentos) {
            System.out.println(departamento);
        }
    }
}
