
public class TopTrumpsChallenge {
		public static void main(String[]args) {
			
			Ferrari myCar1 = new Ferrari("Ferrari", "812", 4, "V12", 812, "3 Seconds", 2, "£300,000", true);
			Ferrari myCar2 = new Ferrari("Ferrari", "488", 4, "V8", 530, "3.5 Seconds", 2, "£250,000", true);
			
			System.out.println(myCar1.make);
			
			myCar1.horsePower(myCar1.horsePower, myCar2.horsePower);
			
			
			

		
	}

}
