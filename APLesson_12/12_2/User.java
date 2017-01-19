public class User
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public User()
	{
		firstName="";
		lastName="";
		avatar="";
		userID=0;
	}
	
	public User(String fN, String lN)
	{
		firstName=fN;
		lastName=lN;
		avatar="Undefined";
		userID=(int)(Math.random()*1000000)+1;
	}
	
	public User(String fN, String lN, String av)
	{
		firstName=fN;
		lastName=lN;
		avatar=av;
		userID=(int)(Math.random()*1000000)+1;
	}
	
	public void setAvatar(String av)
	{
		avatar=av;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
}