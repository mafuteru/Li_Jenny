import java.util.Arrays;
import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<Toy> toyList; 
	
	public ToyStore()
	{
		toyList= new ArrayList<Toy>();
	}
	
	public ToyStore(String ts) 
	{
		loadToys(ts);
	}
	
	
	public void loadToys(String ts)
	{
		toyList= new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i=0; i<toys.size(); i+=2)
		{
			String name=toys.get(i);
			String type=toys.get(i+1);
			Toy t = getThatToy(name);
			
			if(t == null)
			{
				if(type.equals("Car")) 
					toyList.add(new Car(name));
				if(type.equals("AF")) 
					toyList.add(new AFigure(name));
			}
			else
				t.setCount(t.getCount()+1);			
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
				return x;
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name="";
		int max=Integer.MIN_VALUE;
		for(Toy x:toyList)
		{
			if(max<x.getCount())
			{
				max=x.getCount();
				name=x.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars=0;
		int figures=0;
		for(Toy x : toyList)
		{
			if(x.getType().equals("Car"))
				cars+=1;
			else if(x.getType().equals("Action Figure"))
				figures+=1;
		}
		
		if(cars > figures)
			return "Cars";
		if(cars < figures)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return ""+toyList;
	}
}