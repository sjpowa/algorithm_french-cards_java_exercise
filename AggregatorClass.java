package exercise20;

public class AggregatorClass extends Exercise20 {

	// instance initializer
	{
		System.out.println("==============================\n"
				+ "\n> WELCOME :)"
				+ "\n> IN THIS PROGRAM U HAVE TO CHOOSE"
				+ "\n> THE SEED AND VALUE OF TWO CARDS"
				+ "\n> THE PROGRAM WILL TELL U"
				+ "\n> WHICH ONE IS THE BEST CARD!");
	}
	
	public String legenda() {
		return "\n==============================\n"
				+ ">>> LEGEND <<<\n"
				+ "\nSEEDS:"
				+ "\n > HEART"
				+ "\n > DIAMOND"
				+ "\n > CLUB"
				+ "\n > SPADES"
				+ "\n==============================\n\n"
				+ "\nVALUES => "
				+ "| ACE | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | J | Q | K |"
				+ "\n\n==============================";
	}
	
	public String menu() {
		return
				"\n> DIGIT [1] TO ENTER THE FIRST CARD SEED & VALUES"
				+ "\n> DIGIT [2] TO ENTER THE SECOND CARD SEED & VALUES"
				+ "\n> DIGIT [3] TO CHECK WHICH CARD IS THE BEST!"
				+ "\n> DIGIT [0] TO EXIT"
				+ "\n>>> ENTER HERE ---> ";
	}
	
	
	
}
