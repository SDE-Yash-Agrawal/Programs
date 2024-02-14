// This program is to find the Second Largest Element in an Array!
import java.util.*;
class SecondLargestElementArray
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Length of Array: ");
		int len = s.nextInt();
		System.out.print("Enter Elements: ");
		int[] arr = new int[len];
		for(int i=0; i<len; i++)
		{
			arr[i] = s.nextInt();
		}

		secondLargest(arr);
		System.out.println("The Second Largest Element: "+withoutSorting(arr));
	}

	// With Sorting
	static void secondLargest(int[] arr)
	{
		Arrays.sort(arr);
		System.out.println("Second Largest Element is: "+arr[arr.length-2]);
	}

	// Without Sorting
	static int withoutSorting(int[] arr)
	{
		int firstLargest = arr[0];
		int secondElement = arr[1];

		if(firstLargest < secondElement)
		{
			firstLargest = arr[1];
			secondElement = arr[0];
		}

		for(int i=2; i<arr.length; i++)
		{
			if(arr[i] > firstLargest)
			{
				secondElement = firstLargest;
				firstLargest = arr[i];
			}
			else if(arr[i] < firstLargest && arr[i] > secondElement)
			{
				secondElement = arr[i];
			}
		}

		return secondElement;
	}
}