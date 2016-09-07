public class lab_02
{
	public static void main(String[]args)
	{
		int times1 = 6;
		int times2 = 7;
		int product = times1 * times2;
		String name = "Jenny Li";
		String address = "12345 Happy Street";
		String city = "San Diego, CA";
		String zip = "92130";
		int l = 6;
		int h = 7;
		int w = 66;
		int surArea = 2*(w*l+h*l+h*w);
		
	System.out.println(times1 +" multiplied by " +times2 +" is " +product +"\n");
	System.out.println(name +"\n" +address +"\n" +city +" " +zip +"\n");
	System.out.println("The surface area of your rectangular cube is "+surArea);
	}
}