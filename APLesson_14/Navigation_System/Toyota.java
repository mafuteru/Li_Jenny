import java.util.ArrayList;
public class Toyota implements Location
{
	private double[] location=new double[2];
	
	public Toyota(String c)
	{
		double[]location = new double[2];
		String[] cList = c.split(", ");
		location[0]=Double.parseDouble(cList[0]);
		location[1]=Double.parseDouble(cList[1]);
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