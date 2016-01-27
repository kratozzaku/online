import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Main {
	

    public static void main(String args[]) {
    	
      	Runway runway = new Runway (20, 2, 5);
    	Car car = new Car();
    	
    	
    	int minSpeed = runway.gap+1;
    	int totalRunway = runway.road + runway.gap + runway.platform;
    	boolean hasJumped = false;
    	int turnsToWait = waitingTurns(runway.road, minSpeed, positionOnMinSpeed(minSpeed));
    	int wasDelayed = 0;
    	car.speed =1;
    	
    	System.out.println("Turns to min Speed: " + turnsToMinSpeed(minSpeed));
    	System.out.println("Position on minSpeedReach: " + positionOnMinSpeed(minSpeed));
    	
    	
    	
    	// don't use division - as speed is increasing. try seeing the diffif ()
    	
    	for (int i=0; i<=totalRunway; i++) {
    		car.position = car.position+car.speed;
    		System.out.println("----------- " + i + "----------");
    		printStats(car.position, car.speed);
    		
    		// check when to jump

    		if (!hasJumped){
    			if (waiting(runway.road, minSpeed, positionOnMinSpeed(minSpeed)) && (wasDelayed != turnsToWait) && (car.speed == 1)) {
    				car.hold();
    				wasDelayed++;
    				System.out.println("WAS DELAYED");
    			}else {
        			if (car.position == car.position) { // Fail condition car.position < runway.road
              			
    		    		if (car.speed < minSpeed){
    		    			car.speedUp();
    			    		} else if (car.speed == minSpeed) {
    			    			
    			    			if (car.position != runway.road ) {
    								car.hold();
    								System.out.println("Car position1:" + (car.position ));
    								
    							}else if(car.position == runway.road) {
    								car.jump();
    								hasJumped = true;
    								System.out.println("Car position on jump:" + (car.position));
    							}
    						} else if (car.speed > minSpeed) {
    			    			car.slowDown();
    						}
        			} else {
        				System.out.println("You Failed !");
        				
        				break;
        			}

    			}

    		} else {
    			car.slowDown();
    		}
    		System.out.println("V2 " + car.speed);
    	}

    }	 
    
    
    public static boolean waiting(int road, int minSpeed, int turnsToMinsSpeed) {
    	
    	System.out.println("road: " + road + " - Pos on Minspeed " + turnsToMinsSpeed + " = " + (road-turnsToMinsSpeed) );
    	System.out.println("Division = " + ((road-turnsToMinsSpeed) % minSpeed) );
		
    	if (((road-turnsToMinsSpeed) % minSpeed) <= 0) {
    		return false;
    	}
    	
    	return true;
	}
    
    public static int waitingTurns(int road, int minSpeed, int turnsToMinsSpeed) {
    			
    	if (((road-turnsToMinsSpeed) % minSpeed) <= 0) {
    		return 0;
    	}
    	
    	return ((road-turnsToMinsSpeed) % minSpeed);
	}
    
    
    public static int turnsToMinSpeed(int minSpeed) {
		int tempSpeed = 0;
		int counter = 0;
		
		while (tempSpeed != minSpeed) {
			tempSpeed++;
			counter++;
		}
		System.out.println("Turns to MinSpeed: " + counter);
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
	    	System.out.println("SPEED");
	    	
	    }
	    
	    public void slowDown() {
	    	this.speed = this.speed - 1;
	    	System.out.println("SLOW");
	    	
	    }
	    
	    public void jump() {
	       	System.out.println("JUMP");
	       
	    }
	    
	    public void hold() {
	       	System.out.println("WAIT");
	       	
	    }
	    
   
	    
    }
    
}
    
