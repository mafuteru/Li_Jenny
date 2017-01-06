public class UserNames
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public UserNames()
	{
		//sets up deault values for instance var
		userName="";
		firstName="";
		lastName="";
	}
	
	//Constructor with parameters
	public UserNames(String uName, String fName, String lName)
	{
		userName=uName;
		firstName=fName;
		lastName=lName;
		//overloaded constructor
	}
	
	//Modifiers- let user change username, keep first and last name the same
	public void setUserName(String uName)
	{
		userName=uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	
}