package krt;

public class MobilePhone implements ITelephone {
	

	private int myNumber;
	private boolean isRinging;
	private boolean isOn = false;

	public MobilePhone(int myNumber) {
		super();
		this.myNumber = myNumber;
		this.isRinging = false;
	}
	
	@Override
	public void powerOn() {
		isOn = true;
		System.out.println("Mobile is good and running. yey!");
		
	}
	@Override
	public void dial(int phoneNumber) {
		if (isOn) {
			System.out.println("Now ringing " + phoneNumber + " on mobile phone.");
		} else {
			System.out.println("Power up your mobile man before calling.");
		}
		
		
		
	}
	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Hello ?... umm... Hello ?");
			isRinging = false;
		}
	}
	
	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("Tune playing.");
		}
		else {
			System.out.println("Mobile is turned off or number is wrong");
			isRinging = false;
		}
		return isRinging;
	}
	
	
	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
