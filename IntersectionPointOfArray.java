// This program is to find the Intersection point of Two Arrays!
import java.util.*;
import java.util.HashSet;
class IntersectionPointOfArray
{
	public static void main(String args[])
	{
		String[] str1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE"};
		String[] str2 = {"TWO", "ONE", "FIVE", "THREE", "THREE"};

		HashSet<String> set = new HashSet<String>();

		for(int i=0; i<str1.length; i++)
		{
			for(int j=0; j<str2.length; j++)
			{
				if(str1[i].equals(str2[j]))
				{
					set.add(str1[i]);
				}
			}
		}
		System.out.print(set);
	}
}