import java.util.Scanner;
public class Ex_05
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		adv();
	}
	
	public static void adv()
	{
		System.out.println("The search for the wifi password");
		System.out.println("You're stranded on a boat and see an island in the disance."
							"\n 1. Row to the island"+
							"\n 2. Stay on the boat");
		int choice1=kb.nextInt();
		if(choice1==1)
		{
			System.out.println("")
		}
		else(choice1==2) 
		{
			System.out.println("Bad decision. A shark swims dramatically up to your boat."
								"\n 1. Try to paddle away"+
								"\n 2. Throw a lamp at the shark");
			int choice2=kb.nextInt();
			if(choice2==1)
			{
				System.out.println("Sweat pours down your spine as you try to paddle, but you've only moved a foot."
								"\n You realize that this is because you haven't exercised in six years."+
								"\n 1. Scream vigorously"+
								"\n 2. Succumb to fate");
				int choice3=kb.nextInt();
				if(choice3==1)
				{
					System.out.println("As the shark tears your flesh apart, you continue to scream."+
										"\nThe shark is sick of your nonsense and chomps more fervently.\nYou die a gruesome death.");
				}
				else
					System.out.println("The brave decision. Sometimes you just have to know when to quit.\nYou die peacefully.");
			}
			
			else
			{
				System.out.println("You don't have any lamps."
								"\n 1. Oh."+
								"\n 2. Throw a fish at the shark");
				int choice4=kb.nextInt();
				if(choice4==1)
				{
					System.out.println("You sit there in silence, reflecting on the pointless of human existence."+
										"\nYou die an existential death.");
				}
				else
					System.out.println("You bravely hurl the greasy projectile at your opponent. Unfortunately the shark just eats it.\nYou die a confused death.");
			}
		}
		
	}
}