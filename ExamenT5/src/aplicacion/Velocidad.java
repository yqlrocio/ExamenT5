package aplicacion;

	/**
	 * Interfaz para mando que pueden aumentar y disminuir niveles, es decir, para MandoAspiradora y MandoAire.
	 */
	public interface Velocidad {
	    void aumentar() throws DispositivoApagadoException;
	    void disminuir() throws DispositivoApagadoException;
	}
