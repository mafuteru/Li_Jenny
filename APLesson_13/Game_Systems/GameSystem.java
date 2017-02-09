public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform="";
		this.serialNo=0;
	}
	
	public GameSystem(String p)
	{
		this.platform=p;
		this.serialNo=(int)(Math.random()*9999999+1000000);
	}

	//Accessors
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerial()
	{
		return serialNo;
	}
	
}