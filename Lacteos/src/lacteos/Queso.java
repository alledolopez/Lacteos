package lacteos;

public class Queso {
	private String tipo_leche;
	private int cantidad_leche;
	private double peso;
	
	/**
	 * @param tipo_leche
	 * @param cantidad_leche
	 * @param peso
	 */
	public Queso(String tipo_leche, int cantidad_leche, double peso) {
		setTipo_leche(tipo_leche);
		setCantidad_leche(cantidad_leche);
		setPeso(peso);
	}
	public Queso() {
		
	}

	/**
	 * @return the tipo_leche
	 */
	public String getTipo_leche() {
		return tipo_leche;
	}

	/**
	 * @param tipo_leche the tipo_leche to set
	 */
	public void setTipo_leche(String tipo_leche) {
		this.tipo_leche = tipo_leche;
	}

	/**
	 * @return the cantidad_leche
	 */
	public int getCantidad_leche() {
		return cantidad_leche;
	}

	/**
	 * @param cantidad_leche the cantidad_leche to set
	 */
	public void setCantidad_leche(int cantidad_leche) {
		this.cantidad_leche = cantidad_leche;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
