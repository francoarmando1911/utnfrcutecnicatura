package EjerciciosGuiaPOO.Practico5_animales;

public class Perro extends Canino{
    @Override
    public String getNombreCientífico() {
        return "Canis lupus familiaris";
    }

    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "carnivoros";
    }

    @Override
    public String getHabitat() {
        return "domestico";
    }
}
