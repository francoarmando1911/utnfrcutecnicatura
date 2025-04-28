package EjerciciosComposicion.Ejercicio2_Videojuegos;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private List<Enemigo> enemigos;

    public Nivel(List<Enemigo> enemigos) {
        this.enemigos = new ArrayList<>();
    }

    public void agregarEnemigo(Enemigo enemigo){
        this.enemigos.add(enemigo);
    }

    public void eliminarEnemigo(Enemigo enemigo){
        this.enemigos.remove(enemigo);
    }

    public List<Enemigo> obtenerEnemigo(){
        return this.enemigos;
    }

}
