package PracticoENUMS.ValidacionUsuarios;

public class RegistroInvalidoException extends Exception {
    public RegistroInvalidoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
