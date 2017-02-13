import java.util.ArrayList;
public class ToyStoreRunner
{
	public static void main (String[]args)
	{
		String ts="Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, "+ 
			"Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF"; 
		
		ToyStore object= new ToyStore(ts);
		
		System.out.println("List...\n"+ts+"\n"+object.toString());
			
		System.out.println("\nMost Frequent Toy: "+object.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: "+object.getMostFrequentType());
	}
	
}
	