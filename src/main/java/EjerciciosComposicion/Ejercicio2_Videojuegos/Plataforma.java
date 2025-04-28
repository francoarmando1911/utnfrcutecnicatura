package EjerciciosComposicion.Ejercicio2_Videojuegos;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {

    private List<Juego> juegos;

    public Plataforma(List<Juego> juegos) {
        this.juegos = new ArrayList<>(juegos);
    }

    public void agregarJuego(Juego juego) {
        this.juegos.add(juego);
    }

    public void eliminarJuego(Juego juego){
        this.juegos.remove(juego);
    }

    public List<Juego> obtenerJuegos() {
        return this.juegos;
    }
}
