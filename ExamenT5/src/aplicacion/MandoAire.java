package aplicacion;

	/**
	 * MandoAire con control de modo y velocidad.
	 */
	public class MandoAire extends Mando implements Velocidad{

	    protected int velocidad = 0;
	    protected String modo = "ESTADO"; 
	    protected double temperatura;


	    public MandoAire(String modelo, double precio, int velocidad, String modo) {
	        super(modelo, precio);
	        this.velocidad = velocidad;
	        this.modo=modo; 
	    }
	    
	    public void cambiarModo() {
	        modo = modo.equals("ESTADO") ? "FRIO" : "CALOR";
	    }
	    
	    /**
	     * La velocidad va subiendo de 1 en 1, siendo por defecto 0 y máximo 5
	     * @throws DispositivoApagadoException
	     */
	    
	    @Override
	    public void aumentar() throws DispositivoApagadoException {
	        if (!isEncendido()) {
	            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
	        }
	        velocidad = Math.min(5, velocidad + 1);
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
	                ", Velocidad: " + velocidad +
	                ", Modo: " + modo;
	    }
	}