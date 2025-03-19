package prueba;

public class Main {
    public static void main(String[] args) {

        Circulo circ = new Circulo();
        circ.setColor("rojo");
        circ.setRadio(25);
        double circunsferencia = circ.getCircunsferencia();
        System.out.println("Circulo: " + circunsferencia);

        Circulo cir2 = new Circulo();
        cir2.setColor("verde");
        cir2.setRadio(30);
        double circunsferencia2 = cir2.getCircunsferencia();
        System.out.println("Circulo: " + circunsferencia2);

        Circulo cir3 = new Circulo();
        cir3.setColor("azul");
        cir3.setRadio(35);
        double circunsferencia3 = cir3.getCircunsferencia();
        System.out.println("Circulo: " + circunsferencia3);
    }
}
