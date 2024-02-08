//Reverse of String using recursive approach

import java.util.*;

class Reverse_String_Java
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int len = str.length();
		String rev_String = Reverse_String(str, len);
		System.out.println(rev_String);
	}

	public static String Reverse_String(String str, int l)
	{
		if (l == 0)
		{
			return "";
		}
		char[] arr = str.toCharArray();
		char ch = arr[l-1];
		return ch + Reverse_String(str.substring(0, l-1), l-1); //If if write str.substring(0, l) then it will give an extra whole string to the recursive function.
	}
}