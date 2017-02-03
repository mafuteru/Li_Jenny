public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		this.name="";
		this.count=1;
	}
	
	public Toy(String n)
	{
		this.name=n;
		this.count=1;
	}
	
	//Abstract class
	public abstract String getType();
	
	//Modifiers
	public void setName(String n)
	{
		this.name=n;
	}
	
	public void setCount(int c)
	{
		this.count=c;
	}
	
	//Accessors
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return name + ": " + count;
	}
}