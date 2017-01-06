import static java.lang.Math.*;
public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	
	public Distance()
	{
		xOne=0;
		yOne=0;
		xTwo=0;
		yTwo=0;
		distance=0;
	}
	
	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
		distance=0;
	}
	
	//Modifiers
	public void setValues(int x1,int y1,int x2,int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}
	
	
	public double getDistance()
	{
		distance=Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}