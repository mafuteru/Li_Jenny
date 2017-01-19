public class Inventory
{
	private String manufacturer,name,category;
	private int upc,price;
	
	public Inventory()
	{
		manufacturer="";
		name="";
		category="";
		upc=0;
		price=0;
	}
	
	public Inventory(String m, String n)
	{
		manufacturer=m;
		name=n;
		category="Undefined";
		upc=(int)(Math.random()*(999999999)+1000000000);
		price=0;
	}
	
	public Inventory(String m, String n, String c, int p)
	{
		manufacturer=m;
		name=n;
		category=c;
		upc=(int)(Math.random()*(999999999)+1000000000);
		price=p;
	}
	
	public void setCat(String c)
	{
		category=c;
	}
	
	public void setPrice(int p)
	{
		price=p;
	}
	
	public String toString()
	{
		return "Item Info...\nManufacturer: " + manufacturer +
								"\nName: " + name +
								"\nCategory: " + category +
								"\nUPC: " + upc+
								"\nPrice: " + price;
	}
}