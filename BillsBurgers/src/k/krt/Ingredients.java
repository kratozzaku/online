package k.krt;

public class Ingredients {
	
	private String name;
	private double price;
	
	// List of ingredient names and prices
	// Add case to add new ingredient
	
	public Ingredients(String name) {
		 String lowerCaseName = name.toLowerCase();
		
		switch (lowerCaseName) {
		case "tomatoes":
			this.name = "Tomatoes";
			this.price = 0.50;
			break;
		
		case "cheese":
			this.name = "Cheese";
			this.price = 1.50;
			break;

		default:
			this.name = "Other - " + name;
			this.price = 1.00;
			break;
		}
		
	}
	

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	
	

}
