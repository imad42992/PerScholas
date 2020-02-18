package practice;

public class MethodOverloading {

	public static void main(String[] args) {
		int newScore = calculateScore("Imad", 500);
		System.out.println("New Score is " + newScore);
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points ");
		return score * 1000;
	}

}
