
public class TopTrumpsChallenge {
		public static void main(String[]args) {
//			Audi Class --------------------------------------------------------------------------------------------------
			
			Audi A3 = new Audi("Audi", "A3", 2f, 130, 140, 6.6f, 24375);
			
			Audi A4 = new Audi("Audi", "A4", 3f, 141, 150, 5.2f, 29505);
			
			System.out.println(A3.make);
			
			A3.horsePowerAudi(A3.horsePower, A4.horsePower);
			
			
//		BMW Class -------------------------------------------------------------------------------------------------------	
			BMW Series7 = new BMW("BMW", "7 Series", 3f, 155, 390, 5.7f, 69510);
			
			BMW Series8 = new BMW("BMW", "8 Series", 4.4f, 155, 400, 3.8f, 69225);
			
			System.out.println(Series7.make);
			
			Series7.horsePowerBMW(Series7.horsePower, Series8.horsePower);
			
			
//		Mercedes Class -------------------------------------------------------------------------------------------------------	

			Mercedes EClass = new Mercedes("Mercedes", "EClass", 2f, 156, 385, 5.6f, 69999);
			
			Mercedes SClass = new Mercedes("Mercedes", "SClass", 3f, 159, 399, 3.9f, 71000);
			
			System.out.println(EClass.make);
			
			EClass.horsePowerMercedes(EClass.horsePower, SClass.horsePower);
			
			EClass.accelarationMercedes(EClass.accelaration, SClass.accelaration);
			
			System.out.println();
			
			
	}

}

