package k.krt;

import java.util.ArrayList;


// Base class for Hamburger subclasses:


public class Hamburger {
	
	private String name;
	private String rollType;
	private String meatType;
	private ArrayList<Ingredients> ingredients = new ArrayList<Ingredients>();
	private double price;
	
	// Defaults
	private int maxIngredients = 4;
	private int ingredientsCounter = 0;
	private double priceOfIngredients = 0;
	
		

	public Hamburger(String name, String rollType, String meat, double price) {
		this.name = name;
		this.rollType = rollType;
		this.meatType = meat;
		this.price = price;
	}
	
	public Hamburger(String name, String rollType, String meat) {
		this.name = name;
		this.rollType = rollType;
		this.meatType = meat;
		this.price = 20.00;
	}
	
	
	// Adds new ingredient to the ingredient list
	
	public void addIngredient (Ingredients ingredient){
		if (this.name == "Healthy Burger"){
			this.maxIngredients = 6;
		}
		
		if (this.name == "Deluxe Burger"){
			this.maxIngredients = 0;
		}		
	
		if (ingredientsCounter < this.maxIngredients ){
			
			
			ingredients.add(ingredient); // add ingredient
			System.out.println("Add \"" + this.ingredients.get(this.ingredients.indexOf(ingredient)).getName() + "\" to " + this.name);
			ingredientsCounter++;
			
			// Get ingredient price
			calculateTotals(ingredient);
			
			

		}
		else{
			System.out.println("Can not add more than " + this.maxIngredients + " ingredients to " + this.name);
		}

				
	}
	
	
	public void addCombo(){
		
		if (this.name == "Deluxe Burger"){
			this.maxIngredients = 0;
			if (this.ingredientsCounter == 0){
				Ingredients chips = new Ingredients("Chips");
				Ingredients drink = new Ingredients("Drink");
				ingredients.add(chips);
				ingredients.add(drink);
				calculateTotals(chips);
				calculateTotals(drink);
				this.ingredientsCounter = 1;
			}
			
		}	
		
	}
	
	public void calculateTotals(Ingredients ingredient){
		this.priceOfIngredients += this.ingredients.get(this.ingredients.indexOf(ingredient)).getPrice();
	}
	
	


	// Display order summary
	public void displaySummary(){
		
		System.out.println("\n*************************************************");
		System.out.println("****************** YOUR ORDER *******************");
		
		System.out.println(this.name+": $" + this.price);
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


	protected void setMaxIngredients(int maxIngredients) {
		this.maxIngredients = maxIngredients;
	}
	
	
	
	
	
	
}