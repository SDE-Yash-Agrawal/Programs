// This program is to shift all zeros to the front!

import java.util.*;
class ShiftingZeros
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of String: ");
		int len = s.nextInt();
		System.out.print("Enter "+len+ " value: ");
		int[] arr = new int[len];
		for(int j=0; j<len; j++)
		{
			arr[j] = s.nextInt();
		}

		int ind = 0, shift =0;
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] == 0)
			{
				ind = i;
				while(shift < ind)
				{
					int temp = arr[ind-1];
					arr[ind-1] = arr[ind];
					arr[ind] = temp;
					--ind;
				}
				shift++;
			}
		}

		for(int i: arr)
		{
			System.out.print(i + " ");
		}
	}
}