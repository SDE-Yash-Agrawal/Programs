// Program to find Duplicate Element in Array!

import java.util.*;
import java.util.HashSet;
public class DuplicateInArray{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of Array: ");
		int len = s.nextInt();
		int[] arr = new int[len];
		System.out.print("Enter " +len+" values of Array: ");
		for(int i=0; i<len; i++)
		{
			arr[i] = s.nextInt();
		}
		
		findDupilcate(arr);
		findingDuplicate(arr);
	}

	//This function finds the duplicate using sorting.
	static void findDupilcate(int[] arr)
	{
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i] == arr[i+1])
			{
				System.out.println("Dubplicate Element in Array: "+arr[i]);
			}
		}
	}

	//This function finds duplicate using HashSet;
	static void findingDuplicate(int[] arr)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			if(!set.add(arr[i]))
			{
				System.out.println("Duplicate Element in Array: "+arr[i]);
			}
		}
	}
}