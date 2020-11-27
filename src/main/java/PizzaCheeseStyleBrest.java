public class PizzaCheeseStyleBrest extends Pizza{
	
	public PizzaCheeseStyleBrest() {
		this.nom = "Pizza sauce style brest et fromage";
		this.garnitures.add("Parmigiano reggiano rapé");
		
	}
	@Override
	protected void couper() {

		System.out.println("Découpage en parts triangulaires");
	}

}
