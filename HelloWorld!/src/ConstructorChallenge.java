
public class ConstructorChallenge {
		
	String Name;
	String Color;
	int Age;
	Boolean Eyes;
	
	
	public ConstructorChallenge(String horseName, String HorseColor, int HorseAge, boolean HorseEyes) {
		Name = horseName;
		Color = HorseColor;
		Age = HorseAge;
		Eyes = HorseEyes;
	}
	

	
	public static void main (String[] args) {
		
		ConstructorChallenge horseOne = new ConstructorChallenge("Jim", "Blue", 11, false );
		System.out.println(horseOne.Name);
		System.out.println("The colour of Horse One is " + horseOne.Color);
		System.out.println(horseOne.Age);
		System.out.println(horseOne.Eyes);
		}
	
}
