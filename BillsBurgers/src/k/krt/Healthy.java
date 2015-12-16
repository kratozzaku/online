package k.krt;

public class Healthy extends Hamburger {
	
	private int maxHealthyIngredients = 6;


	public Healthy( String meat) {
		super("Healthy Burger","Brown rye", meat, 25.00);
	}


	public int getMaxHealthyIngredients() {
		return maxHealthyIngredients;
	}
	

	
	
	
	
	
}
