package k.krt;

public class Main {

	public static void main(String[] args) {
		
		Ingredient tomatoes = new Ingredient("tomatoes");
		Ingredient other = new Ingredient("other");
				
		Hamburger firstHamburger = new Hamburger("Bread", "Chicken", 20.0);
		
		
		firstHamburger.addIngredient(tomatoes);
		firstHamburger.addIngredient(other);
		
		firstHamburger.addIngredient(tomatoes);
		firstHamburger.addIngredient(other);
		firstHamburger.addIngredient(tomatoes);
		
		firstHamburger.displaySummary();
		

	}

}
