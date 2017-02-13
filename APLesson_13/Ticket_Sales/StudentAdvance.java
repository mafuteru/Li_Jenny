public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int d)
	{
		super(d);
	}
	
	public double getPrice()
	{
		if(getDL()>=10)
			return 15.00;
		else
			return 20.00;
	}
	
	public String toString()
	{
		return "\nSerial #: " + super.getSerialNo()+"\nPrice: " +this.getPrice()+"\nSTUDENT ID REQUIRED";
	}
}