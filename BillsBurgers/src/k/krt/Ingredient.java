package k.krt;

public class Ingredient {
	
	private String name;
	private double price;
	
	public Ingredient(String name) {
		name.toLowerCase();
		
		switch (name) {
		case "tomatoes":
			this.name = "Tomatoes";
			this.price = 0.50;
			break;

		default:
			this.name = "Other";
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
