
public class SwitchStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char charValue ='D';
//		
//		switch (charValue) {
//		case 'A':
//			System.out.println("Value is A ");
//			break;
//			
//		case 'B': case 'C':
//			System.out.println("Values is " + charValue);
//			break;
//		default:
//			System.out.println("Other letter entered.");
//			break;
//		}
		
		
//		
//	}
		
		String month = "APRIL123";
		
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
			
		case "april":
			System.out.println("Apr");
			break;

		default:
			System.out.println("Other month. ");
			break;
		}
	}

}
