package EjerciciosComposicion.Ejercicio2_Videojuegos;

import java.util.ArrayList;

public class MainVideojuego {
    public static void main(String[] args) {

        Enemigo enemigo1 = new Enemigo("Pepe Rust", 2);
        Enemigo enemigo2 = new Enemigo("Juan Steel", 3);

        Nivel nivel1 = new Nivel(new ArrayList<>());
        nivel1.agregarEnemigo(enemigo1);
        nivel1.agregarEnemigo(enemigo2);

        Juego juego1 = new Juego(new ArrayList<>());
        juego1.agregarNivel(nivel1);

        Plataforma plataforma = new Plataforma(new ArrayList<>());
        plataforma.agregarJuego(juego1);

        System.out.println("Plataforma creada con 1 juego, 1 nivel y 2 enemigos.");

    }
}
