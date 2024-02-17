// This Program is to find whether the First string is the rotation of another.

import java.util.*;
class StringRotationOfAnother
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First String: ");
		String first = s.nextLine();
		System.out.print("Enter the Second String: ");
		String second = s.nextLine();

		boolean result = isStringRotation(first, second);
		if(result)
		{
			System.out.println(second + " is Rotation of " + first);
		}
		else 
		{
			System.out.println(second + " is not a Rotation of " + first);
		}	

		//Optimal Solution
		// optimalSolution(first, second);
	}

	static boolean isStringRotation(String first, String second)
	{
		if(first.length() != second.length())
		{
			return false;
		}

		char[] arr1 = first.toCharArray();
		char[] arr2 = second.toCharArray();
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

	// static void optimalSolution(String first, String second)
	// {
	// 	String s = first + first;
	// 	if(s.contains(second))
	// 	{
	// 		System.out.println("It is Rotation");
	// 	}
	// 	else
	// 	{
	// 		System.out.println("It is not a Rotation");
	// 	}
	// }
}