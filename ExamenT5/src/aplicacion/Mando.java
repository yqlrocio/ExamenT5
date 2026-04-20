package aplicacion;

import aplicacion.Mando;

	/**
	 * Clase base de todos los mandos a distancia.
	 */
	public abstract class Mando implements Comparable<Mando> {

	    protected String modelo;
	    protected double precio;
	    protected boolean encendido;
		private Object obj;

	    public Mando(String modelo, double precio) {
	        this.modelo = modelo;
	        this.precio = precio;
	        this.encendido = false;
	    }
	    
	    public String getModelo() {
	        return modelo;
	    } 
	    
	    public void encender() {
	        this.encendido = true;
	    }

	    public void apagar() {
	        this.encendido = false;
	    }

	    public boolean isEncendido() {
	        return encendido;
	    }

	    /**
	     * Compara dos mandos. Se consideran iguales si tienen
	     * el mismo modelo.
	     * 
	     * @param obj objeto a comparar
	     * @return true si son iguales, false en caso contrario
	     */
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) 
	        	return true;
	        if (!(obj instanceof Mando)) 
	        	return false;  
	    
	    
	    Mando m = (Mando) obj;
        return modelo.equals(m.modelo) &&
               obj.equals(m.obj);
    }
	    @Override
	    public int compareTo(Mando otroMando) {
	    	return this.modelo.compareTo(otroMando.modelo);
	    }

	    /**
	     * Devuelve una representación en forma de cadena del mando
	     * con la información básica.
	     * 
	     * @return cadena con el modelo, precio y estado (encendido/apagado)
	     */
	    @Override
	    public String toString() {
	        return "Modelo: " + modelo +
	                ", Precio: " + precio +
	                ", Estado: " + (encendido ? "Encendido" : "Apagado");
	    }
	}



