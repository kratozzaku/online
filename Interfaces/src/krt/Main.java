package krt;

public class Main {

	public static void main(String[] args) {
		
		
		ITelephone myPhone;
		myPhone = new DeskPhone(1122553);
		myPhone.powerOn();
		myPhone.callPhone(1122553);
		myPhone.answer();
		
		myPhone = new MobilePhone(24567);
		//myPhone.powerOn();
		myPhone.callPhone(24567);
		myPhone.answer();
		

	}

}
