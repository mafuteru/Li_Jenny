public class PCClass extends GameSystem
{	
	public PCClass()
	{
		super();
	}
	
	public PCClass(String p)
	{
		super(p);
	}
	
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: " +super.getPlatform()+"\nSerial #: " + super.getSerial()+"\nSystem Input: "+systemInput();
	}
}