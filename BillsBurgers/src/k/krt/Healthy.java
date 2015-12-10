package k.krt;

public class Healthy extends Hamburger {
	
	private int maxHealthyIngredients = 6;


	public Healthy( String meat, double price) {
		super("Healthy Burger","Brown rye", meat, price);
	}


	public int getMaxHealthyIngredients() {
		return maxHealthyIngredients;
	}
	
//	@Override
//	public void addIngredient (Ingredients ingredient){
//		
//
//				
//	}

	
	
	
	
	
}
