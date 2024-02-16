// This program is to find all pairs of numbers on which adding them gives the given number.

import java.util.*;
class PairOfNumbers
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of Array: ");
		int len = s.nextInt();
		System.out.print("Enter the Array Elements: ");
		int[] arr = new int[len];
		for(int i=0; i<len; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.print("Enter the Number: ");
		int num = s.nextInt();

		pairsOfArray(arr, num);
	}

	static void pairsOfArray(int[] arr, int num)
	{
		Arrays.sort(arr);
		int i = 0;
		int j = arr.length-1;

		System.out.print("Pairs : ");
		while(i < j)
		{
			if(arr[i]+arr[j] == num)
			{
				System.out.print(arr[i] +" : "+ arr[j]+ ", ");
				i++;
				j--;
			}

			else if(arr[i]+arr[j] < num)
			{
				i++;
			}

			else if(arr[i]+arr[j] > num)
			{
				j--;
			}
		}
	}
}