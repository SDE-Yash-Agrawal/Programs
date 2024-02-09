//This Program is to remove all whitespaces from the given text in input!

import java.util.*;
class Remove_Whitespace_Java
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();

		String result = text.replaceAll("\\s+", "");
		System.out.println(result);
	}
}