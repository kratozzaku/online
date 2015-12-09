class Car {
	
	private String name;
	private boolean engine;
	private int cylinders;
	private int wheels;
	
	
	
	public Car(String name, int cylinders) {
		this.name = name;
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 6;
	}

	public String getName() {
		return name;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}
	
	public void startEngine (){
		System.out.println("Car.startEngine(). Engine start.");
	}
	
	public void accelerate(){
		System.out.println("Car.accelerate(). Car accelerates");
	}
	
	public void brake(){
		System.out.println("Car.brake(). Car brakes.");
	}
	
}

class BMW extends Car{
	public BMW (){
		super("BMW", 8);
	}

	@Override
	public void startEngine() {
		System.out.println("BMW.startEngine() Vroom Vroom");
		
	}

	@Override
	public void accelerate() {
		System.out.println("BMW.accelerate() Accelerate");
	}

	@Override
	public void brake() {
		System.out.println("BMW.brake() Braking");
	}
	
	
}

class Suzuki extends Car{
	
	public Suzuki(){
		super("Suzuki", 4);
	}
	
	@Override
	public void startEngine() {
		System.out.println("Suzuki.startEngine() Vroom Vroom");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Suzuki.accelerate() Accelerate");
	}

	@Override
	public void brake() {
		System.out.println("Suzuki.brake() Braking");
	}
	
}

class Mitsubishi extends Car{
	public Mitsubishi(){
		super("Mitsubishi", 6);
	}
	
	@Override
	public void startEngine() {
		System.out.println("Mitsubishi.startEngine() Vroom Vroom");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Mitsubishi.accelerate() Accelerate");
	}

	@Override
	public void brake() {
		System.out.println("Mitsubishi.brake() Braking");
	}
	
}

class Default extends Car{
	
	public Default(){
		super("Generic Car", 4);
	}
}


public class Main {

	public static void main(String[] args) {

		Car car = chooseCar("bmw");
		
		testCar(car);
		
		car = chooseCar("mitsubishi");
		
		testCar(car);

		
	}		


	
	public static Car chooseCar (String carName){
		carName = carName.toLowerCase();
		switch (carName) {
		case "bmw":
			return new BMW();
		
		case "suzuki":
			return new Suzuki();
		
		case "mitsubishi":
			return new Mitsubishi();
		
		default:
			return new Default();
		}
	}
	
	public static void testCar (Car car){
		car.startEngine();
		car.accelerate();
		car.brake();
	}

}
