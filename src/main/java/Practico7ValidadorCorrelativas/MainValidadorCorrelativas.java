package Practico7ValidadorCorrelativas;

public class MainValidadorCorrelativas {
    Materia m1 = new Materia("Matematica 1");
    Materia m2 = new Materia(m1, "Matematica 2");

    Materia p1 = new Materia("Programacion");
    Materia p2 = new Materia(p1, "Programacion2");
    Materia p3 = new Materia(p2, "Programacion3");
}
