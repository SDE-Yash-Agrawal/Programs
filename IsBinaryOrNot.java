// This Program is to find that the given number is binary of not!
import java.util.*;
import java.lang.*;
class IsBinaryOrNot
{
	public static void main(String args[])
	{
		System.out.print("Enter the Number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		boolean result = isBinary(num);
		if(result)
		{
			System.out.println(num + " is a Binary Number!");
		}
		else 
		{
			System.out.println(num + " is not an Binary Number!");
		}
	}

	static boolean isBinary(int num)
	{
		String n = String.valueOf(num);
		char[] arr = n.toCharArray();

		int flag = 1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] != '1' && arr[i] != '0')
			{
				flag = 0;
				break;
			}
		}

		if(flag == 0)
		{
			return false;
		}
		return true;
	}
}