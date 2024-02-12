// Anagram Program - Two strings in which all the characters are same but the order is different are called in Anagram
import java.util.*;
class Anagram_Java
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String fir = s.nextLine();
		System.out.print("Enter Second String: ");
		String sec = s.nextLine();

		boolean result = isAnagram(fir, sec);
		if(result)
		{
			System.out.println("It is an Anagram!");
		}
		else
		{
			System.out.println("It is not an Anagram!");
		}
	}

	static boolean isAnagram(String fir, String sec)
	{
		String fi = fir.replaceAll("\\s+", "").toLowerCase(); 
		String se = sec.replaceAll("\\s+", "").toLowerCase();

		if(fi.length() == se.length())
		{
			char[] arr1 = fi.toCharArray();
			char[] arr2 = se.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			for(int i=0; i<arr1.length; i++)
			{
				if(arr1[i] != arr2[i])
				{
					return false;
				}
			}
			return true;
		}
		return false;
	}
}