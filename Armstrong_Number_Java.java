// This program is to check Armstrong Number!
import java.util.*;
import java.lang.Math;
class Armstrong_Number_Java{

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = s.nextInt();
		int sum = 0, count = 0, rem = 0;
		int val = num;

		while(val != 0)
		{
			val = val/10;
			count++;
		}
		val = num;

		while(val != 0)
		{
			rem = val%10;
			sum += Math.pow(rem, count);
			val = val/10;
		}

		if(sum == num)
		{
			System.out.println("It is an Armstrong Number!");
		}
		else
		{
			System.out.println("It is not an Armstrong Number!");
		}
	}
}