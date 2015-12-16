package k.krt;

public class Main {

	public static void main(String[] args) {
		
		Ingredients tomatoes = new Ingredients("Tomatoes");
		Ingredients cheese = new Ingredients("Cheese");
		Ingredients fries = new Ingredients("Fries");
		Ingredients chips = new Ingredients("Chips");
		Ingredients drink = new Ingredients("Drink");
				
		Hamburger simpleHamburger = new Hamburger("Simple Burger","White bread", "Chicken");
		Healthy healthyBurger = new Healthy("Beef");
		Deluxe deluxe = new Deluxe("Rice roll", "Turkey");
		
		
		
				
		simpleHamburger.addIngredient(tomatoes);
		simpleHamburger.addIngredient(tomatoes);
		simpleHamburger.addIngredient(tomatoes);
		simpleHamburger.addIngredient(tomatoes);
		simpleHamburger.addIngredient(tomatoes);
		simpleHamburger.addIngredient(tomatoes);
		simpleHamburger.addIngredient(tomatoes);
		
		healthyBurger.addIngredient(tomatoes);
		healthyBurger.addIngredient(cheese);
		healthyBurger.addIngredient(tomatoes);
		healthyBurger.addIngredient(fries);
		healthyBurger.addIngredient(tomatoes);
		healthyBurger.addIngredient(fries);
		healthyBurger.addIngredient(fries);
		healthyBurger.addIngredient(fries);
		
		deluxe.addIngredient(drink);
		
		
		simpleHamburger.displaySummary();
		healthyBurger.displaySummary();
		deluxe.displaySummary();
		

	}

}
