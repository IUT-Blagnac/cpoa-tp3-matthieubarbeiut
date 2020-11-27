public class PizzaCheeseStyleStrasbourg extends Pizza{

		public PizzaCheeseStyleStrasbourg() {
			this.nom = "Pizza sauce style Strasbourg et fromage";
			this.garnitures.add("Mozzarella en lamelles");
		
		}
		@Override
		protected void couper() {

			
			
			System.out.println("Découpage en parts carrées");
		}

}
