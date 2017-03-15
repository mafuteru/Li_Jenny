public class GMC extends Car
{
	private double x, y;
	
	public GMC(double xC, double yC)
	{
		x=xC;
		y=yC;
	}
	
	public void move(double xC, double yC)
	{
		x+=xC;
		y+=yC;
	}
	
	public double[] getLoc()
	{
		double[] location= new double[2];
		location[0]=x;
		location[1]=y;

		return location;
	}
}