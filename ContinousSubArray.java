// This program is to find the continous sub array which sum is equal to given number!

import java.util.*;
class ContinousSubArray
{
	public static void main(String args[])
	{
		// Answer - {9, 31, 5}
		int[] arr = {42, 15, 12, 8, 6, 32};
		int num = 26;

		subArray(arr, num);
		//optimalSolution(arr, num);
	}

	static void subArray(int[] arr, int num)
	{
		int len = arr.length;
		int sum = 0;
		int first = 0;
		int sec = 0;
		for(int i=0; i<len; i++)
		{
			first = i;
			for(int j=i; j<len; j++)
			{
				sum += arr[j];
				if(sum == num)
				{
					sec = j;
					break;
				}
				else if(sum > num)
				{
					sum = 0;
					break;
				}
			}
			if(sum == num)
			{
				break;
			}
		}

		for(int i=first; i<=sec; i++)
		{
			System.out.print(arr[i] + ", ");
		}
	}

	//Optimal Solution:
	static void optimalSolution(int[] arr, int num)
	{
		int sum = arr[0];
		int start = 0;

		for(int i=1; i<arr.length; i++)
		{
			sum += arr[i];

			while(sum > num && start <= i-1)
			{
				sum -= arr[start];
				start++;
			}

			if(sum == num)
			{
				for(int j=start; j<=i; j++)
				{
					System.out.print(arr[j]+ ", ");
				}
			}
		}
	}

}