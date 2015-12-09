package k.krt;

import java.util.ArrayList;

public class Hamburger {
	private String rollType;
	private String meatType;
	private double price;
	private int maxIngredients;
	private ArrayList<Ingredient> ingredients;
	private int ingredientsCounter;
	private double priceOfIngredients;
	private double totalPrice;
	
	
	// up to four additions
	// should have additional additions - separate class
	// use method to add these
	
	public Hamburger(String rollType, String meat, double price) {
		this.rollType = rollType;
		this.meatType = meat;
		this.price = price;
		this.maxIngredients = 4;
		this.ingredients = new ArrayList<Ingredient>();
		this.ingredientsCounter = 0;
		this.priceOfIngredients = 0;
		this.totalPrice = price;
	}
	
	
	public void addIngredient (Ingredient ingredient){
		
		if (ingredientsCounter < 4 ){
			
			// Add ingredient to ingredients string
			ingredients.add(ingredient);
			System.out.println("Added ingredient: " + this.ingredients.get(this.ingredients.indexOf(ingredient)).getName());
			ingredientsCounter++;
			
			// Calculate priceOfIngredients and totalPrice
			this.priceOfIngredients += this.ingredients.get(this.ingredients.indexOf(ingredient)).getPrice();
			this.totalPrice += this.ingredients.get(this.ingredients.indexOf(ingredient)).getPrice();

		}
		else{
			System.out.println("Can not add more ingredients.");
		}
				
		// DONE check that max ingredients are not met
		// DONE calculate new price
		// DONE increase ingredientsCounter
				
	}
	
	public void displaySummary(){
		
		System.out.println("*************************************************");
		System.out.println("****************** YOUR ORDER *******************");
		System.out.println(this.getClass().getSimpleName() +": " + this.price);
		System.out.println("- Roll Type: " + this.rollType);
		System.out.println("- Meat Type: " + meatType);
		
		if (!ingredients.isEmpty()){
			System.out.println("\nOther ingredients: ");
			
			for (Ingredient ingredient : ingredients) {
				System.out.print(ingredients.get(this.ingredients.indexOf(ingredient)).getName());
				System.out.println(": " + ingredients.get(this.ingredients.indexOf(ingredient)).getPrice());
			}
		}
		
		System.out.println("Ingredients total: " + this.priceOfIngredients + "\n");
		System.out.println("---------------------");
		System.out.println("*** Total: " + totalPrice +" ***");
		
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


	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}


	public int getAddedIngredients() {
		return ingredientsCounter;
	}


	public double getPriceOfIngredients() {
		return priceOfIngredients;
	}
	
	
	
	
	
	
}