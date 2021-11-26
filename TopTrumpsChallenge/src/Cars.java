
public class Cars {
	String make;
	String model;
	int wheels;
	boolean engineOn;
	
	
	public Cars(String Make, String Model, int Wheels) {
		make = Make;
		model = Model;
		wheels = Wheels;
		
	
	}
	
	void startEngine() {
		System.out.println("Engine has started" );
		engineOn = true;
		System.out.println(engineOn);
	}
	
	void horsePower(int myCar1, int myCar2) {
		if (myCar1 > myCar2) {
			System.out.println("812 Wins");
		} else {
			System.out.println("488 Wins");
		}
	
}
}

class Ferrari extends Cars {
	String engineSize;
	int horsePower;
	String accelaration;
	int seats;
	String price;
	
	public Ferrari(String Make, String Model, int Wheels, String EngineSize, int HorsePower, String Accelaration, int Seats, String Price, boolean engineOn) {
		super(Make, Model, Wheels);
		
		engineSize = EngineSize;
		horsePower = HorsePower;
		accelaration = Accelaration;
		seats = Seats;
		price = Price;
		
	}
	
	   void startEngine() {
	        engineOn = true;
	        System.out.println("Engine is on.");
	    }
	    void stopEngine() {
	        engineOn = false;
	        System.out.println("Engine is off.");
	    }
	    
	    void tuneEngine() {
	    	horsePower =+ 10;
	    	accelaration += "3 Seconds";
	    }
	    
}
	
