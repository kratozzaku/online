import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Main {
	

    public static void main(String args[]) {
    	
      	Runway runway = new Runway(16, 2, 16);
    	Car car = new Car();
    	
    	
    	int minSpeed = runway.gap+1;
    	int totalRunway = runway.road + runway.gap + runway.platform;
    	boolean hasJumped = false;
    	
    	System.out.println("Turns to min Speed: " + turnsToMinSpeed(minSpeed));
    	System.out.println("Position on minSpeedReach: " + positionOnMinSpeed(minSpeed));
    	
    	// don't use division - as speed is increasing. try seeing the diffif ()
    	
    	for (int i=0; i<=totalRunway; i++) {
    		car.position = car.position+car.speed;
    		System.out.println("----------- " + i + "----------");
    		printStats(car.position, car.speed);
    		
    		// check when to jump

    		if (!hasJumped){
    			
    			if (car.position < runway.road) { // Fail condition 
      			
		    		if (car.speed < minSpeed){
		    			car.speedUp();
			    		} else if (car.speed == minSpeed) {
			    			
			    			if (car.position != runway.road ) {
								car.hold();
								System.out.println("Car position1:" + (car.position + car.speed));
								
							}else if(car.position == runway.road) {
								car.jump();
								hasJumped = true;
								System.out.println("Car position on jump:" + (car.position + car.speed));
							}
						} else if (car.speed > minSpeed) {
			    			car.slowDown();
						}
    			} else {
    				System.out.println("You Failed !");
    				break;
    			}
    			
    		} else {
    			car.slowDown();
    		}
    	}

    }	 
    
    public static int turnsToMinSpeed(int minSpeed) {
		int tempSpeed = 0;
		int counter = 0;
		
		while (tempSpeed != minSpeed) {
			tempSpeed++;
			counter++;
		}
    	return counter;
	}
    
    public static int positionOnMinSpeed(int minSpeed) {
		int tempPos = 0;
		int speed = 0;
		
		while (speed != minSpeed) {
			speed++;
			tempPos = tempPos+speed;
		}
    	return tempPos;
    }
	  
    public static void printStats(int position, int speed) {
    	System.out.println("============================");
    	System.out.println("Car position: " + position  );
    	System.out.println("Car speed: " + speed);
    
 
    	
    }
    
    public static class Runway {
    	public int road;
    	public int gap ;
    	public int platform;
    	
    	public Runway(int road, int gap, int platform) {
			super();
			this.road = road;
			this.gap = gap;
			this.platform = platform;
		}


    }
    
    public static class Car{
    	public int position = 0;
    	public int speed;
        

	    
	    public void speedUp() {
	    	this.speed = this.speed+1;
	    	
	    }
	    
	    public void slowDown() {
	    	this.speed = this.speed - 1;
	    	
	    }
	    
	    public void jump() {
	       	System.out.println("Jumping");
	       
	    }
	    
	    public void hold() {
	       	System.out.println("Hold Speed");
	       	
	    }
	    
   
	    
    }
    
}
    
