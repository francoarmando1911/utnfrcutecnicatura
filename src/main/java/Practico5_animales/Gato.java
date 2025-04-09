package Practico5_animales;

public class Gato extends Felino {

    @Override
    public String getNombreCientífico() {
        return "Felis silvestris catus";
    }

    @Override
    public String getSonido() {
        return "maullido";
    }

    @Override
    public String getAlimentos() {
        return "ratones";
    }

    @Override
    public String getHabitat() {
        return "domesticos";
    }
}
