
public class Vehicle {
	String make;
	String model;
	int doors;
	int wheels;
	int engineSize;
	int horsePower;
	boolean engineOn;
	
	public Vehicle(String Make, String Model, int Doors, int Wheels) {
		make = Make;
		model = Model;
		doors = Doors;
		wheels = Wheels;
		
	
	}
	
	void startEngine() {
		System.out.println("Engine has started");
		engineOn = true;
		System.out.println(engineOn);
	}
	
}

	class MotorVehicle extends Vehicle {
    int engineSize;
    int horsepower;
    boolean engineOn;
    public MotorVehicle(String Make, String Model, int Doors, int Wheels, int EngineSize, int Horsepower, boolean EngineOn) {
        super(Make, Model, Doors, Wheels);
        engineSize = EngineSize;
        horsepower = Horsepower;
        engineOn = EngineOn;
    }
    void startEngine() {
        engineOn = true;
        System.out.println("Engine is on.");
    }
    void stopEngine() {
        engineOn = false;
        System.out.println("Engine is off.");
    }
}
	
	
	class NonMotorVehicle extends Vehicle {
	    int pedals;
	    int pushPower;
	    public NonMotorVehicle(String Make, String Model, int Doors, int Wheels, int Pedals, int PushPower) {
	        super(Make, Model, Doors, Wheels);
	        pedals = Pedals;
	        pushPower = PushPower;
	    }
	 
	}
//int EngineSize, int HorsePower, boolean EngineOn, int Doors, int Wheels
//engineSize = EngineSize;
//horsePower = HorsePower;
//engineOn = EngineOn;
