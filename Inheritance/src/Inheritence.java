
public class Inheritence {
	public static void main(String[]args) {
//		Animal lion = new Animal("Joe", 4, 100, 70, 100, 50);
//		System.out.println(lion.Name);
//		Lion lion = newLion("Lenny", 5, 100, 100, 100, 100);
//	
		
		Vehicle myVehicle = new Vehicle("Mercedes", "C63", 4, 4);
		System.out.println(myVehicle.make);
		
		MotorVehicle newMotorVehicle = new MotorVehicle("Mercedes", "C63", 4, 4, 2, 500, true);
		System.out.println(newMotorVehicle.horsepower);
		newMotorVehicle.startEngine();
		newMotorVehicle.stopEngine();
		
		MotorVehicle newMotorBike = new MotorVehicle("Kawasaki", "Z650RS", 0, 2, 2, 400, true);
		System.out.println(newMotorBike.model);
		System.out.println(newMotorBike.make);
		
		NonMotorVehicle newNonMotorVehicle = new NonMotorVehicle("Carrera", "Hybrid", 0, 2, 2, 100);
		System.out.println(newNonMotorVehicle.make);
		
	}
}
