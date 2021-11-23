
public class F1 {
//	private String favouriteTeam = "RedBull";
	private String Track = "Singapore";
	private int numberOfCars = 2;
//	private int pitCrew = 20;
	private int pointsToWin = 25;
	
	public void ShowFavouriteTrack() {
		String ShowFavouriteTrack = String.format("The name of my favourite Track is %s", Track);
		System.out.println(ShowFavouriteTrack);
//		System.out.println("The name of the car is " + name);
//		System.out.println("The model of the car is " + model);
	}
	
	public void increasePoints() {
		pointsToWin +=25;
		System.out.println("Total points after winning " + pointsToWin);
	}
	
	public void numberOfcars() {
		
		System.out.println("Total number of Cars one team has is " + numberOfCars);
	}
	
//	public void fansInStadium() {
//		
//		String fansInStadium = String.format("The Total %s capacity is %s ", Stadium, Fans);
//		System.out.println(fansInStadium);
//	}
}
