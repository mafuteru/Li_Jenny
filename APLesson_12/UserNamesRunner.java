public class UserNamesRunner
{
	public static void main (String[]args)
	{
		UserNames object = new UserNames("profess","Professor","Handsome");
		
		System.out.println("<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>");
		System.out.println("Name: "+object.getFirstName()+" "+object.getLastName());
		System.out.println("User Name: "+object.getUserName());
		
		//empty
		UserNames object1 = new UserNames();
		
		System.out.println("<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>");
		System.out.println("Name: "+object1.getFirstName()+" "+object1.getLastName());
		System.out.println("User Name: "+object1.getUserName());
		
		//Modify existing username
		object.setUserName("pHandsome");
		System.out.println("<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>");
		System.out.println("Name: "+object.getFirstName()+" "+object.getLastName());
		System.out.println("User Name: "+object.getUserName());
	}
}