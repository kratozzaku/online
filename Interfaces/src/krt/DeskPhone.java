package krt;

public class DeskPhone implements ITelephone {

	private int myNumber;
	private boolean isRinging;

	public DeskPhone(int myNumber) {
		super();
		this.myNumber = myNumber;
		this.isRinging = false;
	}
	
	@Override
	public void powerOn() {
		System.out.println("Desk Phone does not need powering up. It's using phone line power to function.... Duuh...");
		
	}
	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + phoneNumber + " on deskphone... (when was the last time you actually did that ?)");
		
	}
	@Override
	public void answer() {
		if (isRinging) {
			System.out.println("Hello ?... umm... Hello ?");
			isRinging = false;
		}
		else {
			System.out.println("listening to the tune.");
		}
	}
	
	@Override
	public boolean callPhone(int phoneNumber) {
		if (phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("RIIING!");
		}
		else {
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
