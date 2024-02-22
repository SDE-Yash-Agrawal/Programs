// This Program is to find all Leaders of an array!
import java.util.*;
class FindingLeaders
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Length of Array: ");
		int len = s.nextInt();
		System.out.print("Enter "+len+" values of Array: ");
		int[] arr = new int[len];
		for(int k=0; k<len; k++)
		{
			arr[k] = s.nextInt();
		}

		//Calling Function
		findingLeaders(arr);
		optimalSolution(arr);
	}

	static void findingLeaders(int[] arr)
	{
		System.out.print("Leaders : ");
		for(int i=0; i<arr.length; i++)
		{
			int flag = 0;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					continue;
				}
				else if(arr[i] < arr[j])
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.print(arr[i] + ", ");
			}
		}
	}

	static void optimalSolution(int[] arr)
	{
		int len = arr.length;
		int max = arr[len-1];
		System.out.print("Leaders in "+ Arrays.toString(arr) + " : ");
		System.out.print(max + " ");

		for(int i=len-2; i>=0; i--)
		{
			if(arr[i] > max)
			{
				System.out.print(arr[i] + " ");
				max = arr[i];
			}
		}
	}
}