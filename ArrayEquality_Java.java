// This program will check the equality of two arrays!
import java.util.*;
class ArrayEquality_Java
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of First Array: ");
		int l1 = s.nextInt();
		System.out.println("Enter the First Array values!");
		int[] arr1 = new int[l1];
		for(int i=0; i<l1; i++)
		{
			arr1[i] = s.nextInt();
		}
		System.out.print("Enter the length of Second Array: ");
		int l2 = s.nextInt();
		System.out.println("Enter the Second Array values!");
		int[] arr2 = new int[l2];
		for(int i=0; i<l2; i++)
		{
			arr2[i] = s.nextInt();
		}

		//For One-Dimensional Array!
		boolean result = equalityCheck(arr1, arr2);
		if(result)
		{
			System.out.println("Arrays are equal!");
		}
		else
		{
			System.out.println("Arrays are not equal!");
		}

		//For Multi-Dimensional Array!
		int[][] marr1 = { { 1, 2 } , { 3, 5 } };
		int[][] marr2 = { { 1, 2 } , { 5, 3 } };

		boolean multiresult = multiEquality(marr1, marr2);
		if(multiresult)
		{
			System.out.println("Arrays are equal!");
		}
		else
		{
			System.out.println("Arrays are not equal!");
		}
	}

	// This function is for Checking One Dimensional Array!
	static boolean equalityCheck(int[] arr1, int[] arr2)
	{
		if(arr1.length == arr2.length)
		{
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

	//For Multi-Dimensional Array!
	static boolean multiEquality(int[][] arr1, int[][] arr2)
	{
		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length)
		{
			return Arrays.deepEquals(arr1, arr2); //Here we are using Arrays.deepEquals method for compairing multi-dimensional arrays.
		}
		return false;
	}
}