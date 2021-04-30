// Nekane Pardo Ruiz | DAM1B

package refactoring;
import java.util.Date;

public class Lloguer {
	private Date data;
	private int dies;
	private Vehicle vehicle;
	
	// Constructor
	public Lloguer(Date data, int dies, Vehicle vehicleBasic) {
		this.data = data;
		this.dies = dies;
		this.vehicle = vehicleBasic;
	}

	// Getters n Setters
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getDies() {
		return dies;
	}

	public void setDies(int dies) {
		this.dies = dies;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}
	
}
