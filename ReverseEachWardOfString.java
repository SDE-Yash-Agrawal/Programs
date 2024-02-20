// This program is to reverse each word of a string!

import java.util.*;
class ReverseEachWardOfString
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		String[] arr = str.split(" ");
		String ans = "";

		for(String st: arr)
		{
			String revstr = reverseFunc(st);
			ans += revstr + " ";
		}

		System.out.print(ans);
	}

	static String reverseFunc(String str)
	{
		if((null == str) || (str.length() <= 1))
		{
			return str;
		}
		return reverseFunc(str.substring(1)) + str.charAt(0);
	}
}