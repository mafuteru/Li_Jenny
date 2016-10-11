public class DiceRoll
{

	public static void main(String[]args)
	{
		int player=1+(int)(Math.random()*6);
		int computer=1+(int)(Math.random()*6);
		
		String winner = rollDice(player,computer);
		
		System.out.println("You rolled a "+player);
		System.out.println("Computer rolled a "+computer);
		System.out.println("The winner is "+winner);
	}
	
	public static String rollDice(int player, int computer)
	{
		
		if(player>computer)
			return "Player";
		
		if(player<computer)
			return "Computer";
		
		else
			return "It's a tie!";
		
	}
}