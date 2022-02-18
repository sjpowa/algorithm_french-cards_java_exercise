package exercise20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggregatorClass ac = new AggregatorClass();
		Exercise20 nr1 = new Exercise20();

		System.out.println(ac.legenda());
		System.out.print(ac.menu());

		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		
		while(true) {
			if (answer == 1) {
				nr1.setSeedFirstCard();
				nr1.setValueFirstCard();
				System.out.println(nr1.firstSecondCard());
			} else if (answer == 2) {
				nr1.setSeedSecondCard();
				nr1.setValueSecondCard();
				System.out.println(nr1.firstSecondCard());
			} else if (answer == 3) {
				nr1.setSeedNr1();
				nr1.setSeedNr2();
				nr1.setValueNr1();
				nr1.setValueNr2();
				nr1.checkBestCard();
			} else if (answer == 0) {
				break;
			}
			System.out.print("\n> DIGIT A NUMBER,\nMAKE A CHOICE! ---> ");
			answer = in.nextInt();
		}
		in.close();
		
//		System.out.println(nr1.firstSecondCard());
//		System.out.println(nr1.getSeedFirstCard());
//		System.out.println(nr1.getSeedNr1());
//		System.out.println(nr1.getSeedNr2());
//		System.out.println(nr1.getValueNr1());
//		System.out.println(nr1.getValueNr2());

	}

}
