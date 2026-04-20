package aplicacion;

	/**
	 * MandoAspiradora con control de velocidad.
	 */
	public abstract class MandoAspiradora extends Mando implements Velocidad{

	    protected int velocidad = 0;
	  

	    public MandoAspiradora(String modelo, double precio, int velocidad) {
	        super(modelo, precio);
	        this.velocidad = velocidad;
	    }
	    
	    
	    /**
	     * La velocidad va subiendo de 1 en 1, siendo por defecto 0 y máximo 3
	     * @throws DispositivoApagadoException
	     */
	    
	    @Override
	    public void aumentar() throws DispositivoApagadoException {
	        if (!isEncendido()) {
	            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
	        }
	        velocidad = Math.min(3, velocidad + 1);
	    }

	    @Override
	    public void disminuir() throws DispositivoApagadoException {
	        if (!isEncendido()) {
	            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
	        }
	        velocidad = Math.max(0, velocidad - 1);
	    }
	    
	    /**
	     * Devuelve una cadena de String con la información recogida
	     */
	    @Override
	    public String toString() {
	        return super.toString() +
	                ", Velocidad: " + velocidad;
	    }
	}