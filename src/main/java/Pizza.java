import java.util.ArrayList;

public abstract class Pizza {

	protected String nom;
	protected String pate;
	protected String sauce;
	protected ArrayList<String> garnitures;

	protected Pizza() {
		this.nom = "";
		this.pate = "";
		this.sauce = "";
		this.garnitures = new ArrayList<String>();

	}


	protected void preparer() {
		System.out.println("Préparation de " + this.nom );
		System.out.println("Etalage de la pâte...");
		System.out.println("Ajout de la sauce... ");
		System.out.println("Ajout des garnitures:");
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}

	}

	protected void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}

	abstract void couper();

	protected void emballer() {
		System.out.println("Emballage dans une boîte officielle");

	}
	protected String getNom() {

		return this.nom;

	}
	
	public void setNom(String pNom) {
		this.nom = pNom;
	}
}

