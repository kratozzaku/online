package k.krt;

import java.util.ArrayList;

// Base class for Hamburger subclasses:


public class Hamburger {
	private String rollType;
	private String meatType;
	protected ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();
	
	// Defaults
	private double price = 20;
	private int maxIngredients = 4;
	protected int ingredientsCounter = 0;
	protected double priceOfIngredients = 0;
		

	public Hamburger(String rollType, String meat, double price) {
		this.rollType = rollType;
		this.meatType = meat;
		this.price = price;
	}
	
	// Testing
	public void setPrice(double price) {
		this.price = price;		
	}
	// End testing
	
	// Adds new ingredient to the ingredient list
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

	// Display order summary
	public void displaySummary(){
		
		System.out.println("\n*************************************************");
		System.out.println("****************** YOUR ORDER *******************");
		
		System.out.println(this.getClass().getSimpleName() +": $" + this.price);
		System.out.println("- Roll Type: " + this.rollType);
		System.out.println("- Meat Type: " + meatType);
		
		if (!ingredients.isEmpty()){
			System.out.println("---------------------");
			System.out.println("Other ingredients: \n");
			
			
			for (Ingredients ingredient : ingredients) {
				System.out.print(ingredients.get(this.ingredients.indexOf(ingredient)).getName());
				System.out.println(": $" + ingredients.get(this.ingredients.indexOf(ingredient)).getPrice());
			}
		}
		System.out.println("---------------------");
		System.out.println("Ingredients total: $" + this.priceOfIngredients);
		System.out.println("\n*** Grand Total: $" + (this.price + this.priceOfIngredients) +" ***");
		
		
	}
	
	// GETTERS

	public String getRollType() {
		return rollType;
	}

	public String getMeat() {
		return meatType;
	}

	public double getPrice() {
		return price;
	}

	public int getMaxIngredients() {
		return maxIngredients;
	}


	public ArrayList<Ingredients> getIngredients() {
		return ingredients;
	}


	public int getAddedIngredients() {
		return ingredientsCounter;
	}


	public double getPriceOfIngredients() {
		return priceOfIngredients;
	}
	
	
	
	
	
	
}