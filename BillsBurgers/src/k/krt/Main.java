package k.krt;

public class Main {

	public static void main(String[] args) {
		
		Ingredients tomatoes = new Ingredients("Tomatoes");
		Ingredients cheese = new Ingredients("Cheese");
		Ingredients fries = new Ingredients("Fries");
				
		Hamburger simpleHamburger = new Hamburger("Simple Burger","White bread", "Chicken",20.00);
		Healthy healthyBurger = new Healthy("Beef",25.00);
		
		
		
				
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
		
		
		
		
		simpleHamburger.displaySummary();
		healthyBurger.displaySummary();
		
		

	}

}
