// This Program is to find sum of all digits of a given number!
import java.util.*;
class SumOfAllDigits
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int val = s.nextInt();
		System.out.println(sumOfDigit(val));
	}

	static int sum = 0;

	// This is Recursive Function!
	static int sumOfDigit(int num)
	{
		if(num == 0)
		{
			return sum;
		}
		else
		{
			sum += num%10;
			num /= 10;
			sumOfDigit(num);
		}
		return sum;
	}
}