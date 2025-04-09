package Practico5_animales;

public class Leon extends Felino {

    @Override
    public String getNombreCientífico() {
        return "Panthera leo";
    }

    @Override
    public String getSonido() {
        return "rugido";
    }

    @Override
    public String getAlimentos() {
        return "carnivoros";
    }

    @Override
    public String getHabitat() {
        return "pradera";
    }

}
