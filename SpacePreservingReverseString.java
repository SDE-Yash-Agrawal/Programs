// This program is for space preserving reverse string!

import java.util.*;
class SpacePreservingReverseString
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = s.nextLine();
		String revStr = reverseString(str).replaceAll(" ", "");

		char[] chararr = str.toCharArray();
		char[] revarr = revStr.toCharArray();

		String ans = "";
		int count = 0;
		for(int i=0; i<chararr.length; i++)
		{
			if(chararr[i] == ' ')
			{
				ans += " ";
				continue;
			}
			ans += revarr[count];
			count++;
		}

		System.out.print(ans);
		
	}

	static String reverseString(String str)
	{
		if(null == str || str.length() == 1)
		{
			return str;
		}

		return reverseString(str.substring(1)) + str.charAt(0);
	}
}