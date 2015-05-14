package pp7_7;

public class PP7_7 
{

	public static void main(String[] args) 
	{
		DeckOfCards player = new DeckOfCards();
		int[] deck = new int[51];
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		
		for (int i = 0; i < deck.length; i++) 
		{
		  deck[i] = i;
		}
		
		System.out.println("The deck will randomly print out a card from a full deck each time");
		
		
		

	}
}
