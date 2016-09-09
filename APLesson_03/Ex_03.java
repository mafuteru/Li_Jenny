import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner calc = new Scanner(System.in);
		System.out.println("Hello, sleep-deprived humans of the world. This is the sleep efficiency calculator.");
		System.out.println("What is your total sleep time in hours?");
		double totSleep = calc.nextDouble();
		
		System.out.println("How many minutes did it take you to fall asleep?");
		double fall = calc.nextDouble();
		
		System.out.println("How many minutes were you awake throughout the night?");
		double awake = calc.nextDouble();
		
		double fallHrs = fall/60;
		double awakeHrs = awake/60;
		double totTimeAsleep = totSleep-fallHrs-awakeHrs;
		double effic = totTimeAsleep/totSleep;
		double efficPer = effic*100;
		
		System.out.println("Your sleep efficiency is "+efficPer+"%");
	}
}