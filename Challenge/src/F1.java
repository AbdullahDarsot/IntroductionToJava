
public class F1 {
	private String favouriteTeam = "RedBull";
	private String Track = "Singapore";
	private int numberOfCars = 2;
//	private int pitCrew = 20;
	private int RedBullPoints = 25;
	private int MercedesPoints = 22;
	private int pointsToWin = 25;
//	private int Position;
	
	public void ShowFavouriteTrack() {
		String ShowFavouriteTrack = String.format("The name of my favourite Track is %s and my favourite Team is %s", Track, favouriteTeam);
		System.out.println(ShowFavouriteTrack);
	}
	
	public void increasePoints() {
		pointsToWin +=25;
		System.out.println("Total points after winning " + pointsToWin);
		
		if (RedBullPoints > MercedesPoints) {
			System.out.println("Red Bull are first");
		}else {
			System.out.println("Mercedes are first");
		}
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
