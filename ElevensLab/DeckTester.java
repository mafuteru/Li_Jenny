/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank1 = {"A", "B", "C"};
		String[] suit1 = {"Giraffes", "Lions"};
		int[] value1 = {2,1,6};
		Deck deck1 = new Deck(rank1,suit1,value1);
		System.out.println("Is deck empty: "+deck1.isEmpty());
		Deck deck2 = new Deck(rank1,suit1,value1);
		System.out.println("Deck size: "+deck1.size());
		Deck deck3 = new Deck(rank1,suit1,value1);	
		System.out.println("Deal: "+deck1.deal());
	}
}
