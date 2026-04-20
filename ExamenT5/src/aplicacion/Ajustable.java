package aplicacion;

	/**
	 * Interfaz para mandos que pueden subir y bajar niveles, es decir, para MandoTV y MandoMinicadena.
	 */
	public interface Ajustable {
	    void subir() throws DispositivoApagadoException;
	    void bajar() throws DispositivoApagadoException;
	}
