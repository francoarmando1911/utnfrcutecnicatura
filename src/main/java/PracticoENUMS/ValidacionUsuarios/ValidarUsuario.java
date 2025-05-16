package PracticoENUMS.ValidacionUsuarios;

public class ValidarUsuario {

    public static void validarNombre(String nombre){
        if(nombre == null || nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
    }

    public static void validarEdad(int edad){
        if(edad < 0){
            throw new IllegalArgumentException("El edad no puede estar negativa");
        }
    }

    public static void validarEmail(String email){
        if(email == null || email.isEmpty()){
            throw new IllegalArgumentException("El email no puede estar vacio");
        }
    }
}
