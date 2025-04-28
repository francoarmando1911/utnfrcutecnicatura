package EjerciciosComposicion.Ejercicio2_Videojuegos;

import java.util.ArrayList;
import java.util.List;

public class Nivel {
    private List<Enemigo> enemigos;

    public Nivel(List<Enemigo> enemigos) {
        this.enemigos = new ArrayList<>();
    }

    //agregarEnemigo(enemigo: Enemigo): void
    //eliminarEnemigo(enemigo: Enemigo):: void
    //obtenerEnemigo(): List<Enemigo>
}
