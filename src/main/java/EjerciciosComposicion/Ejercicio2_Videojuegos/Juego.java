package EjerciciosComposicion.Ejercicio2_Videojuegos;

import java.util.ArrayList;
import java.util.List;

public class Juego {

    private List<Nivel> niveles;

    public Juego(List<Nivel> niveles) {
        this.niveles = new ArrayList<>();
    }

    public void agregarNivel(Nivel niveles){
        this.niveles.add(niveles);
    }

    public void eliminarNivel(Nivel niveles){
        this.niveles.remove(niveles);
    }

    public List<Nivel> obtenerNiveles(){
        return this.niveles;
    }

}
