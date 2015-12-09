package k.krt;

public class StandardBurger {
	private String rollType;
	private String meat;
	private double price;
	
	public StandardBurger(String rollType, String meat, double price) {
		super();
		this.rollType = rollType;
		this.meat = meat;
		this.price = price;
	}

	public String getRollType() {
		return rollType;
	}

	public String getMeat() {
		return meat;
	}

	public double getPrice() {
		return price;
	}
	
}