
public class Football {
	private String favoriteTeam = "Liverpool";
	private String Stadium = "Anfield";
	private int Points = 3;
	private int Players = 11;
	private int Fans = 53394;
	
	public void Show() {
		String Show = String.format("The name of %s stadium is %s", favoriteTeam, Stadium);
		System.out.println(Show);
//		System.out.println("The name of the car is " + name);
//		System.out.println("The model of the car is " + model);
	}
	
	public void increasePoints() {
		Points +=3;
		System.out.println("Total points after winning " + Points);
	}
	
	public void numberOfPlayers() {
		
		System.out.println("Total number of players on the team is " + Players);
	}
	
	public void fansInStadium() {
		
		String fansInStadium = String.format("The Total %s capacity is %s ", Stadium, Fans);
		System.out.println(fansInStadium);
	}
}
