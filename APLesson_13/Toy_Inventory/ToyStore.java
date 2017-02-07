public class ToyStore
{
	private ArrayList<Toy> toyList= new ArrayList<Toy>(); //Public or private?
	
	
	//what is the actual output of this entire thing
	public static void main (String[]args)
	{
		String ts="Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, "+ 
				"Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
	}
	
	//Constructors- are these right?
	public ToyStore()
	{
		this.toyList="";
	}
	
	public ToyStore(String ts) 
	{
		loadToys(ts);
	}
	
	
	public static void loadToys(String ts)
	{
		String[] toys=ts.split(", ");
		for(int i=0; i<toys.length; i++)
		{
			String name=toys[i];
			String type=toys[i+1];
			Toy object = new Toy(getThatToy(name));
			if(getThatToy(name)==null)
			{
				if((toys.getType()).equals("Car"))) //errors errors everywhere
					toyList.add(new Car(name));
				else if((toys.getType()).equals("AF"))) 
					toyList.add(new AFigure(name));
			}
			else
				toys.setCount(toys.getCount()+=1);
			
			}
			
		}
	}
	
	public static void getThatToy(String nm)
	{
		for(Toy b:toyList)
		{
			if(b.equals(nm)
				return b;
			return null;
		}
	}
	
	public static void getMostFrequentToy()
	{
		String name;
		int max=Integer.MIN_VALUE;
		for(Toy b:toyList)
		{
			if(max<b.getCount())
			{
				max=b.getCount();
				name=b.getName();
			}
			return name;
		}
	}
	
	public static void getMostFrequentType()
	{
		int cars=0;
		int figures=0;
		for(Toy b:toylist)
		{
			if(b.equals("Car"))
				cars+=1;
			else if(b.equals("AF"))
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
