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
		System.out.println("The Quest for the Wifi Password");
		System.out.println("\nYou're stranded on a boat in the middle of the ocean and see an island in the distance."
							"\n 1. Row to the island"+
							"\n 2. Stay on the boat");
		int choice1=kb.nextInt();
		if(choice1==1)
		{
			System.out.println("You step foot on the island, instantly searching for any signs of wifi."+ 
					 	"\nHaving not exercised in years, you discover that exploring the mountain gives you inexplicable feelings of pain."+
					 	"\nYou stop to rest after four minutes of walking. Just then, you spot a man in full-body, pink latex suit."+
						"\n 1. Try and be friends"+
						"\n 2. Run away in terror"+
						"\n 3. Cry");
			int choice5=kb.nextInt();
			if(choice5==3)
			{
				System.out.println("You cry profusely. Equally as distressed, the man cries with you. You realize you both have a lot in common."+
						   "\n 1. Offer a snack"+
						   "\n 2. Ask for gardening advice");
				int choice6=kb.nextInt();
				if(choice6==1)
				{
					System.out.println("You give him:"+
							   "\n 1. A single pea"+
							   "\n 2. A bloody houseplant"+
							   "\n 3. A BLT sandwich"+
							   "\n 4. Tea and crumpets"+
							   "\n 5. Strawberry cake");
					int choice7=kb.nextInt();
					if(choice7==4)
					{
						System.out.println("Great choice; it turns out the man is British."+
								   "In fact, he is so excited to receive your gift that he tells you the wifi password!"+
								   "\nThe password is \"crumpet.\" You can finally be at peace.\n\n*********THE END*********");
					}
					if(choice7==5)
						System.out.println("The man is allergic to fruits. How insensitive of you.\nFailing to befriend him, you never receive the wifi password."+
								   "\nYou die from withdrawal.");
					else
						System.out.println("The man is allergic to vegetables. How insensitive of you.\nFailing to befriend him, you never receive the wifi password."+
								   "\nYou die from withdrawal.");
				}
				else
					System.out.println("The man has never eaten vegetables, but seems very enthusiastic about teaching you all about them."+
							   "\nYou carefully listen and learn some very useful and intriguing facts from him."+
							   "\nYour head filled with all the knowledge you have gained, you eagerly hop onto your boat and paddle home."+
							   "\nSoon, you become a world-renowned chef and horticulture specialist, cultivating and cooking vegetables for people all across the world."+
							   "\nWhen you are 80 years old, you go into retirement. Yet, you live your entire life full of constant stress and anxiety."+
							   "\nIt was as if for all of these years, you'd left something unfinished on that island, something fame and riches couldn't replace."+
							   "\nThese questions still unanswered, you suddenly have a heart attack. \nYou die unfilfilled.");
			}
			if(choice5==1)
			{
				System.out.println("You strike up a conversation. The pink man seems very distressed by all this social interaction. He doesn't know how to respond."+	
							"\n 1. Comfort him"+
							"\n 2. Tell a story about a hamster");
				int choice8=kb.nextInt();
				if(choice8==2)
					System.out.println("You try telling a story to lighten the mood, but it's so bad that you start crying."
							  "\nTears streaming down your cheeks, you ask him if the island has wifi. He tells you the password out of pity."+
							  "\nYou can finally be at peace.\n\n*********THE END*********");
				else
					System.out.println("You were too friendly. The man tries to exorcise you, but realizes he doesn't have any salt for the ritual."+
							   "\nInstead, he just stuffs you into a barrel and dumps ocean water into it."+
							   "\nYou sit, slowly drowning, wishing you'd never left the computer and gone outside.\nYou die of saltiness.");
			}
			else
				System.out.println("You run as fast as your spindly legs can carry you back towards your boat, but to no avail."+
						  "\nMistakingly believing that you're a thief, the man chases after you with a large axe. You never make it to the boat."+
						  "\nYou die a harrowing death.");
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
								"\nYou realize that this is because you haven't exercised in six years.\nThe shark approaches."+
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
								"\n 1. ...Oh."+
								"\n 2. Throw a fish at the shark");
				int choice4=kb.nextInt();
				if(choice4==1)
				{
					System.out.println("As the shark begins to devour you, you sit there in silence, pondering the inevitability of death and the absurdity of human existence."+
										"\nYou die an existential death.");
				}
				else
					System.out.println("You bravely hurl the greasy projectile at your opponent. Unfortunately the shark just eats it.\nYou die a confused death.");
			}
		}
		
	}
}
