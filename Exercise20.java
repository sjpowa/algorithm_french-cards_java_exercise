package exercise20;

import java.util.Scanner;

public class Exercise20 {

//	ESERCIZIO 20
//	Memorizzare il seme e il punteggio di due carte da poker. Dire quale delle carte vale di più.  
//	Il valore di una carta da poker è dato in primo luogo dal punteggio e in caso di parità di punteggio dal seme.
//	I punteggi in ordine decrescente sono {k,q,j,10,9,8,7,6,5,4,3,2,1}, i semi in ordine decrescente sono  
//	{cuori, quadri, fiori, picche} per i semi memorizzare solo la lettera iniziale del seme.
//	PS: l’ordine dei semi può essere ricordato grazie alla frase “come quando fuori piove” in cui le parole ricordano i nomi dei semi.

	private String[] seeds = new String[] { "HEART", "DIAMOND", "CLUB", "SPADES" };
	private String[] value = new String[] { "ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	private Scanner sc = new Scanner(System.in);
	private String seed1, seed2;
	private String value1, value2;
	private int seedNr1, seedNr2;
	private int valueNr1, valueNr2;

	// ========================================================
	
	// PICK SEED FIRST CARD
	public void setSeedFirstCard() {
		System.out.print("\nENTER THE SEED OF THE FIRST CARD: ");
		while(true) {
			String seed1 = sc.next();
			boolean x = false;
			for (int i = 0; i < seeds.length; i++) {
				if (seed1.toUpperCase().equals(seeds[i])) {
					x = true;
					break;
				}
			}
			
			if (x == true) {
				this.seed1 = seed1;
				break;
			} else {
				System.out.print("\nWRONG SEED SELECTION\nDIGIT AGAIN -> ");
			}
		}
	}
	
	// GET SEED FIRST CARD
	public String getSeedFirstCard() {
		return seed1;
	}
	
	// ==============================================
	
	// PICK VALUE FIRST CARD
		public void setValueFirstCard() {
			System.out.print("ENTER THE VALUE OF THE FIRST CARD: ");
			while(true) {
				String value1 = sc.next();
				boolean x = false;
				for (int i = 0; i < value.length; i++) {
					if (value1.toUpperCase().equals(value[i])) {
						x = true;
						break;
					}
				}
				
				if (x == true) {
					this.value1 = value1;
					break;
				} else {
					System.out.print("\nWRONG VALUE SELECTION\nDIGIT AGAIN -> ");
				}
			}
		}
		
		// GET value FIRST CARD
		public String getValueFirstCard() {
			return value1;
		}
	
	// ==============================================
	
	// PICK SEED SECOND CARD
	public void setSeedSecondCard() {
		System.out.print("\nENTER THE SEED OF THE SECOND CARD: ");
		while(true) {
			String seed2 = sc.next();
			boolean x = false;
			for (int i = 0; i < seeds.length; i++) {
				if (seed2.toUpperCase().equals(seeds[i])) {
					x = true;
					break;
				}
			}
			
			if (x == true) {
				this.seed2 = seed2;
				break;
			} else {
				System.out.print("\nWRONG SEED SELECTION\nDIGIT AGAIN -> ");
			}
		}
	}
	
	// GET SEED SECOND CARD
	public String getSeedSecondCard() {
		return seed2;
	}

	// ==============================================

	// PICK VALUE SECOND CARD
	public void setValueSecondCard() {
		System.out.print("ENTER THE VALUE OF THE SECOND CARD: ");
		while(true) {
			String value2 = sc.next();
			boolean x = false;
			for (int i = 0; i < value.length; i++) {
				if (value2.toUpperCase().equals(value[i])) {
					x = true;
					break;
				}
			}
			
			if (x == true) {
				this.value2 = value2;
				break;
			} else {
				System.out.print("\nWRONG VALUE SELECTION\nDIGIT AGAIN -> ");
			}
		}
	}
	
	// GET value FIRST CARD
	public String getValueSecondCard() {
		return value2;
	}
	
	// ==============================================
	
	private String getFirstCard() {
		return "\nTHE FIRST CARD IS ---> | " + seed1 + " | " + value1 + " |";
	}

	private String getSecondCard() {
		return "\nTHE SECOND CARD IS ---> | " + seed2 + " | " + value2 + " |";
	}

	public String firstSecondCard() {
		return getFirstCard() + "\n" + getSecondCard();
	}

	// ==============================================
	
	// CONVER SEED FIRST CARD TO NUMBER
	public void setSeedNr1() {
		int seedNr1 = 0;
		switch(getSeedFirstCard().toUpperCase()) {
		case "HEART":
			seedNr1 = 4;
			break;
		case "DIAMOND":
			seedNr1 = 3;
			break;
		case "CLUB":
			seedNr1 = 2;
			break;
		case "SPADES":
			seedNr1 = 1;
			break;
		}
		this.seedNr1 = seedNr1;
	}
	
	// GET NUMBER SEED FIRST CARD CONVERTED
	public int getSeedNr1() {
		return seedNr1;
	}
	
	// CONVERT SEED SECOND CARD TO NUMBER
	public void setSeedNr2() {
		int seedNr2 = 0;
		switch(getSeedSecondCard().toUpperCase()) {
		case "HEART":
			seedNr2 = 4;
			break;
		case "DIAMOND":
			seedNr2 = 3;
			break;
		case "CLUB":
			seedNr2 = 2;
			break;
		case "SPADES":
			seedNr2 = 1;
			break;
		}
		this.seedNr2 = seedNr2;
	}
	
	// GET NUMBER SEED SECOND CARD CONVERTED
	public int getSeedNr2() {
		return seedNr2;
	}
	
	// ======================================================
	
	// CONVERT VALUE FIRST CARD TO AN INT NUMBER
	public void setValueNr1() {
		int valueNr1 = 0;
		switch(getValueFirstCard().toUpperCase()) {
		case "ACE":
			valueNr1 = 1;
			break;
		case "2":
			valueNr1 = 2;
			break;
		case "3":
			valueNr1 = 3;
			break;
		case "4":
			valueNr1 = 4;
			break;
		case "5":
			valueNr1 = 5;
			break;
		case "6":
			valueNr1 = 6;
			break;
		case "7":
			valueNr1 = 7;
			break;
		case "8":
			valueNr1 = 8;
			break;
		case "9":
			valueNr1 = 9;
			break;
		case "10":
			valueNr1 = 10;
			break;
		case "J":
			valueNr1 = 11;
			break;
		case "Q":
			valueNr1 = 12;
			break;
		case "K":
			valueNr1 = 13;
			break;
		}
		this.valueNr1 = valueNr1;
	}
	
	// GET THE INT NUMBER OF THE VALUE OF THE FIRST CARD
	public int getValueNr1() {
		return valueNr1;
	}
	
	// CONVERT VALUE FIRST CARD TO AN INT NUMBER
	public void setValueNr2() {
		int valueNr2 = 0;
		switch(getValueSecondCard().toUpperCase()) {
		case "ACE":
			valueNr2 = 1;
			break;
		case "2":
			valueNr2 = 2;
			break;
		case "3":
			valueNr2 = 3;
			break;
		case "4":
			valueNr2 = 4;
			break;
		case "5":
			valueNr2 = 5;
			break;
		case "6":
			valueNr2 = 6;
			break;
		case "7":
			valueNr2 = 7;
			break;
		case "8":
			valueNr2 = 8;
			break;
		case "9":
			valueNr2 = 9;
			break;
		case "10":
			valueNr2 = 10;
			break;
		case "J":
			valueNr2 = 11;
			break;
		case "Q":
			valueNr2 = 12;
			break;
		case "K":
			valueNr2 = 13;
			break;
		}
		this.valueNr2 = valueNr2;
	}
	
	// GET THE INT NUMBER OF THE VALUE OF THE FIRST CARD
	public int getValueNr2() {
		return valueNr2;
	}
	
	// ===========================================================
	
	public void checkBestCard() {
		if ( (getSeedNr1() > getSeedNr2()) )
			System.out.println("\nTHE FIRST CARD IS THE BEST!" + getFirstCard());
		else if ((getSeedNr1() == getSeedNr2()) && (getValueNr1() > getValueNr2()) )
			System.out.println("\nTHE FIRST CARD IS THE BEST!" + getFirstCard());
		else if ((getSeedNr1() == getSeedNr2()) && (getValueNr1() == getValueNr2()) )
			System.out.println("\nTHE CARDS HAVE THE SAME VALUES!" + getFirstCard() + "\n" + getSecondCard());
		else
			System.out.println("\nTHE SECOND CARD IS THE BEST!" + getSecondCard());
		
	}
	
}
