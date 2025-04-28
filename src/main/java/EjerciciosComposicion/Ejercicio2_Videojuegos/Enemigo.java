package EjerciciosComposicion.Ejercicio2_Videojuegos;

public class Enemigo  {

    private String nombre;
    private int poder;

    public Enemigo(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
    }

    public void atacar(Enemigo enemigo){
        System.out.println(this.nombre + " ataca a " + enemigo.nombre + " con poder " + this.poder);
    }

}
