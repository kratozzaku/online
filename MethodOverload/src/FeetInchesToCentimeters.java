
public class FeetInchesToCentimeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(CalcFeetAndInchesToCentimeters(8, 5));
		System.out.println(CalcFeetAndInchesToCentimeters(3 * 12.0 + 5));

	}
	
	public static double CalcFeetAndInchesToCentimeters (double feet, double inches){
		
		if (( feet >= 0 ) && ((inches >= 0) && (inches <= 12))) {
			
			return ((feet * 12.0)+inches)*2.54;
			
		} else {
			return -1;

		}	
		
	}
	
	public static double CalcFeetAndInchesToCentimeters(double inches){
		if (inches >= 0) {
			double feet = (int)inches/12.0; 
			double reminderInches = inches - (feet * 12.0);
			
			return CalcFeetAndInchesToCentimeters(feet, reminderInches);
			
		} else {
			return -1;
		}
		
		
	}

}
