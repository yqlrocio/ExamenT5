package aplicacion;

	/**
	 * Mando a distancia para controlar el volumen de la minicadena.
	 */
	public class MandoMinicadena extends Mando implements Ajustable {

	    protected int volumen;

	    public MandoMinicadena(String modelo, double precio, int volumen) {
	        super(modelo, precio);
	        this.volumen = volumen;
	    }

	    public void setVolumen(int volumen) {
	        this.volumen = volumen;
	    }

	    @Override
	    public void subir() throws DispositivoApagadoException {
	        if (!isEncendido()) {
	            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
	        }
	        volumen = Math.min(100, volumen + 10); // Aumenta el volumen en 10, pero sin pasar de 100
	    }

	    @Override
	    public void bajar() throws DispositivoApagadoException {
	        if (!isEncendido()) {
	            throw new DispositivoApagadoException("Error: el dispositivo está apagado.");
	        }
	        volumen = Math.max(0, volumen - 10);  // Disminuye el volumen en 10, pero sin pasar de 0
	    }

	    @Override
	    public String toString() {
	        return super.toString() +
	                ", Volumen: " + volumen; 
	    }

		@Override
		public int compareTo(Mando o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
  
