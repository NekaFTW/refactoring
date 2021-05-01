// Nekane Pardo Ruiz | DAM1B

// package refactoring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		// Vehicle1
		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer1 = new Lloguer(date, 2, vehicle1);
		
		// Vehicle2
		Vehicle vehicle2 = new Vehicle("Audi", "RS5", Vehicle.LUXE);
		date = dateFormat.parse("10/10/2017");
		Lloguer lloguer2 = new Lloguer(date, 5, vehicle2);
		
		// Vehicle3
		Vehicle vehicle3 = new Vehicle("Fiat", "Multipla", Vehicle.GENERAL);
		date = dateFormat.parse("2/8/2019");
		Lloguer lloguer3 = new Lloguer(date, 7, vehicle3);

		// demostració de formatat d'una data
		// System.out.println(dateFormat.format(lloguerBasic.getData()));
		
		Client cliente = new Client ("65565667H","pepito","666333222");
		cliente.afegeix(lloguer1);
		cliente.afegeix(lloguer2);
		cliente.afegeix(lloguer3);
		System.out.print(GestorLloguersLite(cliente));
	}
	
	public static String GestorLloguersLite(Client c) {
		return c.informeHTML();
	}

}
