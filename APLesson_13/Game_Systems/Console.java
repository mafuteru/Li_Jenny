public abstract class Console extends GameSystem
{
	public abstract String getController()
	
	public String toString()
	{
		return "Platform: " +super.platform+"\nSerial: " + super.serialNo+"\nController: "+getController();
	}
}