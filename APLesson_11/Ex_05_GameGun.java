import java.util.Scanner;
public class Ex_05_GameGun
{
	static int bulletCount;
	static int clipsize=16;
	static int shotCount;
	static String[] clip;
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		bulletCount=96;
		shotCount=0;
		clip = new String[clipsize];
		
		resetClip();
		
		while(bulletCount>0||shotCount>0)
		{
			System.out.println("Action (R or S):");
			String action = kb.next();
			
			if(action.equals("R"))
				reload();
			
			else if(action.equals("S"))
				System.out.println(shoot());	
			
			printClip();			
		}
		System.out.println("Out of Bullets!!!");
		
		
	}
	
	public static void resetClip()
	{
		for(int i=0; i<clip.length; i++)
			clip[i]="[]";
	}
	
	public static String shoot()
	{
		if(shotCount>0)
		{
			clip[shotCount-1]="[]";
			shotCount--;
			return "Boom!!!";
		}
		else
			return "Reload!!!";
	}
	
	public static void reload()
	{
		if(bulletCount>=clipsize)
		{
			bulletCount-=clipsize;
			shotCount=clipsize;
		}
		else
		{
			shotCount=bulletCount;
			bulletCount=0;
		}
		resetClip();
		for(int i=0; i<shotCount; i++)
		{
			clip[i]=" * ";
		}
	}
	
	public static void printClip()
	{
		String output="";
		System.out.println("Bullet:\t" + bulletCount + "\nClip:\t");
		for(int i=0; i<clipsize; i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}