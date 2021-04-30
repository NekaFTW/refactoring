// Nekane Pardo Ruiz | DAM1B

package refactoring;

public class Vehicle {
	public static final String BASIC = "BASIC";
	public static final String GENERAL = "GENERAL";
	public static final String LUXE = "LUXE";
	private String model;
	private String marca;
	private String categoria;

	// Constructor
	public Vehicle(String model, String marca, String categoria) {
		this.model = model;
		this.marca = marca;
		this.categoria = categoria;
	}

	// Getters n Setters
	public String getCategoria() {
		return categoria;
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
