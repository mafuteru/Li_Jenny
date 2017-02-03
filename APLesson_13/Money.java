public abstract class Money //superclass
{
	//what's the same in Bill and Coin
	private String name;
	private double value;
	private int count;
	
	public Money()
	{
		this.name="";
		this.value=0;
		this.count=0;
	}
	
	public Money(String n, double v)
	{
		this.name=n;
		this.value=v;
		this.count=0;
	}
	
	//Abstract class; needs to be overrriden in Coin and Bill
	public abstract String scan();
	
	
	//Modifier
	public void setCount(int c)
	{
		this.count=c;
	}
	
	//Accessors
	public String getName()
	{
		return name;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String toString()
	{
		return "Your " + name + " is worth $" + value +".\n";
	}
}