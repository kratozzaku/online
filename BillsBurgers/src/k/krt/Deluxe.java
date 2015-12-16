package k.krt;

public class Deluxe extends Hamburger {
	
	public Deluxe(String rollType, String meat) {
		super("Deluxe Burger", rollType, meat, 30.00);
		super.addCombo();
	}

	
}
