public class Honda implements Location
{
	private double[] location= new double[2];
	public Honda(double[] loc)
	{
		location=loc;
	}
	
	public int getID()
	{
		return (int)(Math.random()*999999)+100000;
	}
	
	public void move(int xC, int yC)
	{
		location[0]=location[0]+xC;
		location[1]=location[1]+yC;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}