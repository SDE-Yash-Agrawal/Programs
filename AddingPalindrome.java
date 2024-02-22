// This program is to find the palindrome number by adding the reverse of number itself!

import java.util.*;
class AddingPalindrome
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int value = num;
		int reverse = reverseNumber(value);

		while(true)
		{
			if(isPlaindrome(value+reverse))
			{
				System.out.print("Value of Palindrome is: "+ (value+reverse));
				break;
			}
			else
			{
				value += reverse;
				reverse = reverseNumber(value);
			}
		}
	}

	static int reverseNumber(int value)
	{
		int ans = 0;
		int rem = 0;
		while(value > 0)
		{
			rem = value % 10;
			ans = ans * 10 + rem;
			value /= 10;
		}
		return ans;
	}

	static boolean isPlaindrome(int value)
	{
		int num = value;
		int ans = 0;
		int rem = 0;
		while(num > 0)
		{
			rem = num % 10;
			ans = ans * 10 + rem;
			num /= 10;
		}
		if(ans == value)
		{
			return true;
		}
		return false;
	}
}