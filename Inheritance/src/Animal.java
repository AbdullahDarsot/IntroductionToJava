
public class Animal {
	String Name;
	int age;
	int hungerLevel;
	int speed;
	int strength;
	int tiredness;
	
	public Animal(String animalName, int animalAge, int animalHungerLevel, int animalSpeed, int animalStrength, int animalTiredness) {
		Name = animalName;
		age = animalAge;
		hungerLevel = animalHungerLevel;
		speed = animalSpeed;
		strength = animalStrength;
		tiredness = animalTiredness;
		
		
	}
	

	public void eat() {
		System.out.println("Im Eating");
	}
	
}

class Lion extends Animal {
	
	public Lion(String Name, int Age, int HungerLevel, int Speed, int Strength, int Tiredness) {
		super(Name, Age, HungerLevel, Speed, Strength, Tiredness);
		
		
	}
	public void eat() {
		super.eat();
	}
}
