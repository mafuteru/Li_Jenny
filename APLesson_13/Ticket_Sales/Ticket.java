public abstract class Ticket
{
	double price;
	
	public Ticket()
	{
	}

	public int getSerialNo()
	{
		return (int)(Math.random()*9999999+1000000);
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "\nSerial #: " + getSerialNo()+"\nPrice: " +getPrice();
	}
	
}