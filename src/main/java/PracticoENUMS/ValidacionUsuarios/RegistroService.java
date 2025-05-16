package PracticoENUMS.ValidacionUsuarios;

public class RegistroService {

    public void registrarUsuario(String nombre, int edad, String email) throws RegistroInvalidoException {
        try {
            ValidarUsuario.validarNombre(nombre);
            ValidarUsuario.validarEdad(edad);
            ValidarUsuario.validarEmail(email);
        } catch (IllegalArgumentException e) {
            throw new RegistroInvalidoException("Error en validación: " + e.getMessage(), e);
        }
    }
}

