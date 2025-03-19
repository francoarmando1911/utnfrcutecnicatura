package prueba;

public class Main {
    public static void main(String[] args) {

        Circulo circ = new Circulo();
        circ.color = "rojo";
        circ.radio = 23;
        double circunsferencia = circ.getCircunsferencia();
        System.out.println("Circulo: " + circunsferencia);

        Circulo cir2 = new Circulo();
        cir2.color = "verde";
        cir2.radio = 30;
        double circunsferencia2 = cir2.getCircunsferencia();
        System.out.println("Circulo: " + circunsferencia2);

        Circulo cir3 = new Circulo();
        cir3.color = "azul";
        cir2.radio = 40;
        double circunsferencia3 = cir3.getCircunsferencia();
        System.out.println("Circulo: " + circunsferencia3);

    }
}
