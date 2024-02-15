// This program is to find the Greatest Number which is lesser than the given number
//and does not contain given digit!

import java.util.*;
class GreatestNumberLesserThanGiven
{
	public static void main(String args[])
	{
		//First Approach
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number and Digit: ");
		int num = s.nextInt();
		int digit = s.nextInt();

		int value = greatestDigit(num, digit);
		System.out.println("The Greatest Digit will be: "+value);

		//Second Approach
		System.out.println(greaterValue(num, digit));
	}

	//First Approach
	static int greatestDigit(int num, int digit)
	{
		int val = num - 1;
		while(val > 0)
		{
			if(isDigitContain(val, digit))
			{
				return val;
			}
			val--;
		}
		return -1;
	}

	static boolean isDigitContain(int val, int digit)
	{
		int num = val;
		int rem = 0;

		while(num > 0)
		{
			rem = num % 10;
			if(rem == digit)
			{
				return false;
			}
			num /= 10;
		}
		return true;
	}

	//Second Approach
	static int greaterValue(int num, int digit)
	{
		char c = Integer.toString(digit).charAt(0); //Here we are converting our digit into the Character 'c'!
		for(int i=num; i>0; --i)
		{

			//Now we will convert out number to string and check the index of character 'c'
			//if it is '-1' then we can say that the digit is not present in the given number
			//Hence it is our answer.
			if(Integer.toString(i).indexOf(c) == -1)
			{
				return i;
			}
		}
		return -1;
	}
}