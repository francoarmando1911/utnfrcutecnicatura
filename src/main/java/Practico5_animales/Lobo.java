package Practico5_animales;

public class Lobo extends Canino{

    @Override
    public String getNombreCientífico() {
        return "Canis lupulus";
    }

    @Override
    public String getSonido() {
        return "aullido";
    }

    @Override
    public String getAlimentos() {
        return "carnivoros";
    }

    @Override
    public String getHabitat() {
        return "bosque";
    }
}
