// Nekane Pardo Ruiz | DAM1B

//package refactoring;

import java.util.Vector;

public class Client {
	private String nif;
	private String nom;
	private String telefon;
	private Vector<Lloguer> lloguers;

	public Client(String nif, String nom, String telefon) {
		this.nif = nif;
		this.nom = nom;
		this.telefon = telefon;
		this.lloguers = new Vector<Lloguer>();
	}

	public String getNif()     { return nif;     }
	public String getNom()     { return nom;     }
	public String getTelefon() { return telefon; }

	public void setNif(String nif) { this.nif = nif; }
	public void setNom(String nom) { this.nom = nom; }
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public void afegeix(Lloguer lloguer) {
		if (! lloguers.contains(lloguer) ) {
			lloguers.add(lloguer);
		}
	}

	public void elimina(Lloguer lloguer) {
		if (lloguers.contains(lloguer) ) {
			lloguers.remove(lloguer);
		}
	}

	public boolean conte(Lloguer lloguer) {
		return lloguers.contains(lloguer);
	}
	
	public String informe() {
		return composaCapsalera()+composaDetall()+composaPeu();
	}

	public String composaCapsalera() {
		String resultat = "Informe de lloguers del client " +
				getNom() + " (" + getNif() + ")\n";
		return resultat;
	}
	
	public String composaDetall() {
		String resultat = "";
		for (Lloguer lloguer: lloguers) {
			// composa els resultats d'aquest lloguer
			resultat += "\t" + lloguer.getVehicle().getMarca() + " " +
			lloguer.getVehicle().getModel() + ": " + (lloguer.quantitat() * 30) + "€" + "\n";
		}
		return resultat;
	}

	public String composaPeu() {
		String resultat = "";
		resultat += "Import a pagar: " + importTotal() + "€\n" + "Punts guanyats: " + bonificacionsTotal() + "\n";
		return resultat;
	}
	
	
	public int bonificacionsTotal() {
		int bonificacions = 0;
		for (Lloguer lloguer: lloguers) {
			bonificacions += lloguer.bonificacions();
		}
		return bonificacions;
	}
	
	public double importTotal() {
		double total = 0;
		for (Lloguer lloguer: lloguers) {
			total += lloguer.quantitat() * 30;
		}
		return total;
	}

	public String informeHTML() {
		return composaCapsaleraHTML()+composaDetallHTML()+composaPeuHTML();
	}
	
	
	public String composaCapsaleraHTML() {
		String resultat = "<h1>Informe de lloguers</h1>" + "\n"
				+"\t <p>Informe de lloguers del client <em>"
				+getNom() + " </em> (<stong>"
				+ getNif() + "</strong>)</p>\n";
		
		return resultat;
	}
	
	public String composaDetallHTML() {
		String resultat = "<table> \n"
				+ "<tr><td><strong>Marca</strong></td>"
				+ "<td><strong>Model</strong></td>"
				+ "<td><strong>Import</strong></td></tr>";
		for (Lloguer lloguer: lloguers) {
			// composa els resultats d'aquest lloguer
			resultat += "\t <tr><td>" + lloguer.getVehicle().getMarca()
					+ "</td><td>" +	lloguer.getVehicle().getModel()
					+ "</td><td>" + (lloguer.quantitat() * 30) + "€</td></tr>\n";
		}
		resultat += "</table>\n";
		return resultat;
	}

	public String composaPeuHTML() {
		String resultat = "";
		resultat += "<p>Import a pagar: <em>" + importTotal() + "€</em></p>\n"
				+ "<p>Punts guanyats: <em>" + bonificacionsTotal() + "</em></p>\n";
		return resultat;
	}


}
