
public class Cars {
	String make;
	String model;
	float engineSize;
	int topSpeed;
	int horsePower;
	float accelaration;
	int price;
	
	
	public Cars(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Accelaration, int Price) {
		make = Make;
		model = Model;
		engineSize = EngineSize;
		topSpeed = TopSpeed;
		horsePower = HorsePower;
		accelaration = Accelaration;
		price = Price;
		
		
	}
	

	
	// Horse Power Tests ----------------------------------------------------------------------------------------------
	void horsePowerAudi(int A3, int A4) {
		if (A3 > A4) {
			
		} else {
			System.out.println("A4 Wins");
		}
	}
	
	
	void horsePowerBMW(int Series7, int Series8) {
		if (Series7 > Series8) {
			System.out.println("7 Series Wins");
		} else {
			System.out.println("8 Series Wins");
		}
		
	}
	
	
	void horsePowerMercedes(int EClass, int SClass) {
		if (EClass > SClass) {
			System.out.println("E Class Wins");
		} else {
			System.out.println("S Class Wins");
		}
	}

	
//	accelaration Tests --------------------------------------------------------------------------------------------------
	
	void accelarationMercedes(float EClass, float SClass) {
		if (EClass < SClass) {
			System.out.println("E Class Wins in accelaration");
		} else {
			System.out.println("S Class Wins in accelaration");
		}
	}
}




class Audi extends Cars {

	public Audi(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Accelaration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Accelaration, Price);
		
		
		}
	
	    
	    void tuneEngine() {
	    	horsePower =+ 10;
	    	accelaration += 3;
	    }
	    
}


class BMW extends Cars {

	public BMW(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Accelaration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Accelaration, Price);
		
		
		}
	
	    
	    void tuneEngine() {
	    	horsePower =+ 10;
	    	accelaration += 3;
	    }
	    
}


class Mercedes extends Cars {

	public Mercedes(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Accelaration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Accelaration, Price);
		
		
		}
	
	    
	    void tuneEngine() {
	    	horsePower =+ 10;
	    	accelaration += 3;
	    }
	    
}


