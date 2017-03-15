import java.util.ArrayList;
public class Toyota extends Car
{
	public Toyota(String c)
	{
		location = new double[2];
		String[] cList = c.split(", ");
		location[0]=Double.parseDouble(cList[0]);
		location[1]=Double.parseDouble(cList[1]);
	}

}