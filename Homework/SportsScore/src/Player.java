
public class Player {

	int score; 
	
	void play() {
		System.out.println("The Player's name is Sahil...");
	}

	int getScore(int inputscore) {
		
		score = inputscore; 
		System.out.println("He has scored " + score + " points");
		return 100; 

	}

}
