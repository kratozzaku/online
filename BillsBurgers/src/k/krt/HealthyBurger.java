package k.krt;



public class HealthyBurger extends Hamburger {
	
	private int maxIngredients = 6;

	public HealthyBurger(String meat, double price) {
		super("Brown rye", meat, price);
		
	}
	
	@Override
	public void addIngredient (Ingredients ingredient){
		
		if (ingredientsCounter < this.maxIngredients ){
			
			
			ingredients.add(ingredient); // add ingredient
			System.out.println("Add \"" + this.ingredients.get(this.ingredients.indexOf(ingredient)).getName() + "\" to " + this.getClass().getSimpleName());
			ingredientsCounter++;
			
			// Get ingredient price
			this.priceOfIngredients += this.ingredients.get(this.ingredients.indexOf(ingredient)).getPrice();
			

		}
		else{
			System.out.println("Can not add more than " + this.maxIngredients + " ingredients to " + this.getClass().getSimpleName());
		}

				
	}
	
	public int getMaxIngredients() {
		return maxIngredients;
	}
	
	
	
	
}
