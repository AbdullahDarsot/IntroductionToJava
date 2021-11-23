
public class MyFirstConstructor {

	String firstName;
	String lastName;
	int humanAge;
	int heightCM;
	
	public MyFirstConstructor(String FirstName, String LastName, int age, int height) {
		firstName = FirstName;
		lastName = LastName;
		humanAge = age;
		heightCM = height;
	}
	
	
	
	public static void main (String[] args) {
			
		MyFirstConstructor humanOne = new MyFirstConstructor("Jim", "Bob", 22, 84 );
		MyFirstConstructor humanTwo = new MyFirstConstructor("Fred", "Bye", 21, 195 );
		System.out.println(humanOne.firstName);
		System.out.println(humanTwo.heightCM +"cm");
		}
}
