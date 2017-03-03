public class GMC implements Location
{
	private int x, y;
	public GMC(int xC, int yC)
	{
		x=xC;
		y=yC;
	}
	
	public int getID()
	{
		return (int)(Math.random()*999999)+100000;
	}
	
	public void move(int xC, int yC)
	{
		x=x+xC;
		y=y+yC;
	}
	
	public double[] getLoc()
	{
		double[] location= new double[2];
		
		for(int i=0; i<location.length; i++)
		{
			location[0]=x;
			location[1]=y;
		}
		return location;
	}
}