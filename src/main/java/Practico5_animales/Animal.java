package Practico5_animales;

public abstract class Animal {
    private String sonidos;
    private String alimentos;
    private String habitat;
    private String nombre_cientifico;

    public abstract String getNombreCientífico();
    public abstract String getSonido();
    public abstract String getAlimentos();
    public abstract String getHabitat();


}
