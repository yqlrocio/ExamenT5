package aplicacion;

/**
 * Excepción que se lanza cuando se intenta usar un dispositivo apagado.
 */
public class DispositivoApagadoException extends Exception {

    public DispositivoApagadoException(String mensaje) {
        super(mensaje);
    }
}