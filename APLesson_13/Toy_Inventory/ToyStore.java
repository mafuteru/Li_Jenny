import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<Toy> toyList; //Public or private?
	//what is the actual output of this entire thing
	//how does it know Hotwheels are Cars
	// public static void main (String[]args)
	// {
		// String ts="Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, "+ 
				// "Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF"; 
	// }
	
	//Constructors- are these right?
	public ToyStore()
	{
		toyList= new ArrayList<Toy>(); //what do I initialize here??
	}
	
	public ToyStore(String ts) 
	{
		loadToys(ts);
	}
	
	
	public static void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i=0; i<toys.size(); i++)
		{
			String name=toys[i];
			String type=toys[i+1];
			
			// Car object = new Car(getThatToy(name));
			// AFigure object2 = new AFigure(getThatToy(name));
			
			for(Toy x:toyList) // non-static variable toyList cannot be referenced from a static context
			{
				if(getThatToy(name)==null)
				{
					if(x.getType().equals("Car")) 
						toyList.add(new Car(name));
					else if(x.getType().equals("AF")) 
						toyList.add(new AFigure(name));
				}
				else
					count++;
					// toys.setCount(toys.getCount()+=1);
			}
			
		}
	}
	
	public static String getThatToy(String nm)
	{
		for(Toy x:toyList)
		{
			if(x.getName().equals(nm))
				return x.getName();
		}
		return null;
	}
	
	public static String getMostFrequentToy()
	{
		String name;
		int max=Integer.MIN_VALUE;
		for(Toy x:toyList)
		{
			if(max<x.getCount())
			{
				max=x.getCount();
				name=x.getName();
			}
			return name;
		}
	}
	
	public static String getMostFrequentType()
	{
		int cars=0;
		int figures=0;
		for(Toy x:toylist)
		{
			if(x.getName().equals("Car"))
				cars+=1;
			else if(x.getName().equals("AF"))
				figures+=1;
		}
		
		if(cars>figures)
			return "Cars";
		else if(cars<figures)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList;
	}
}