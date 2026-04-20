package aplicacion;

	/**
	 * Mando a distancia para controlar  el volumen y los canales de la televisión.
	 */
	public abstract class MandoTV extends Mando implements Ajustable {

	    protected String canal;
	    protected int volumen;

	    public MandoTV(String modelo, double precio, int volumen, String canal) {
	        super(modelo, precio);
	        this.canal = canal;
	    }
	  
        public String getCanal() {
            return canal;
        }

        
        /**
         *  El volumen va subiendo de 5 en 5, mínimo 0 y máximo 100, esto ocurrirá si está encendido. 
         *  En caso contrario lanzará una excepción
         */
        
	    @Override
	    public void subir() throws DispositivoApagadoException {
	        if (!isEncendido()) {
	            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
	        }
	        volumen = Math.min(100, volumen + 5);
	    }

	    @Override
	    public void bajar() throws DispositivoApagadoException {
	        if (!isEncendido()) {
	            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
	        }
	        volumen = Math.max(0, volumen - 5);
	    }

	    /**
	     * Devuelve una cadena de String con la información 
	     */
	    @Override
	    public String toString() {
	        return super.toString() +
	                ", Canal: " + canal +
	                ", Volumen: " + volumen;
	    }
}