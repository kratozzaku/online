package k.krt;

public class Main {

	public static void main(String[] args) {
		
		Ingredients tomatoes = new Ingredients("Tomatoes");
		Ingredients cheese = new Ingredients("Cheese");
		Ingredients fries = new Ingredients("Fries");
				
		Hamburger firstHamburger = new Hamburger("White bread", "Chicken",20.00);
		HealthyBurger healthyBurger = new HealthyBurger("Beef",25.00);
		
		firstHamburger.addIngredient(tomatoes);
		firstHamburger.addIngredient(cheese);
		firstHamburger.addIngredient(tomatoes);
		firstHamburger.addIngredient(fries);
		firstHamburger.addIngredient(tomatoes);
		
		healthyBurger.addIngredient(tomatoes);
		healthyBurger.addIngredient(cheese);
		healthyBurger.addIngredient(tomatoes);
		healthyBurger.addIngredient(fries);
		healthyBurger.addIngredient(tomatoes);
		healthyBurger.addIngredient(fries);
		healthyBurger.addIngredient(fries);
		healthyBurger.addIngredient(fries);
		
		
		firstHamburger.displaySummary();
		healthyBurger.displaySummary();
		
		

	}

}
