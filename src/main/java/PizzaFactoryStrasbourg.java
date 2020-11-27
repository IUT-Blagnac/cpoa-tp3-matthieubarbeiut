public class PizzaFactoryStrasbourg extends PizzaFactory{
	
	static PizzaFactoryStrasbourg instance = new PizzaFactoryStrasbourg();
	
	private PizzaFactoryStrasbourg() {
	
	}
	
	public static PizzaFactoryStrasbourg getInstance() {
		
		return instance;
	}
	
	public Pizza creerPizza(String type) {
		Pizza Pizza = null;
		if (type.equals("fromage")) {
			Pizza = new PizzaCheeseStyleStrasbourg();
		} else if (type.equals("poivron")) {
			Pizza = new PizzaPoivronStyleStrasbourg();
		} else if (type.equals("grec")) {
			Pizza = new PizzaGrecqueStyleStrasbourg();
		} 
		return Pizza;
	}
}
