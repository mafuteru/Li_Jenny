public class Car implements Location
{
	public double[] location;
	public final int ID=(int)(Math.random()*999999)+100000;
	
	public Car()
	{
		location= new double[2];
	}
	
	public void move(double x, double y)
	{
		location[0]+= x;
		location[1]+= y;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}