package EjerciciosGuiaPOO.Practico5_animales;

public class MainAnimales {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro(),
                new Lobo(),
                new Leon(),
                new Gato()
        };

        for (Animal animal : animales) {
            System.out.println("Nombre científico: " + animal.getNombreCientífico());
            System.out.println("Sonido: " + animal.getSonido());
            System.out.println("Alimentos: " + animal.getAlimentos());
            System.out.println("Hábitat: " + animal.getHabitat());
            System.out.println("-----------------------------");
        }
    }
}
