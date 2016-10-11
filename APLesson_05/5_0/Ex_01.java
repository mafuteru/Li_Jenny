public class Ex_01
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player=1+(int)(Math.random()*6);
		computer=1+(int)(Math.random()*6);
		
		rollDice();
		
		System.out.println("You rolled a "+player);
		System.out.println("Computer rolled a "+computer);
		System.out.println("The winner is "+winner);
	}
	
	public static void rollDice()
	{
		if(player>computer)
			winner= "Player";
		
		if(player<computer)
			winner= "Computer";
	}
}