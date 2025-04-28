package EjerciciosGuiaPOO.Practico6_Vehiculos;

/*
recomendarVelocidad(int velocidadViento): si la
velocidad del vien- to es mayor a 80 km/h es muy alta,
se recomienda no salir a navegar
 */
public interface Vela {

    default String recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            return "La velocidad del viento es muy alta, se recomienda no salir a navegar.";
        } else {
            return "La velocidad del viento es adecuada para navegar.";
        }
    }
}
