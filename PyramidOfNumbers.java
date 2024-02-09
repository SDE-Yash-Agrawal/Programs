//Pyramid of Numbers using Java
import java.util.*;
public class PyramidOfNumbers
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Func1(n);
		Func2(n);
	}

	static void Func1(int n)
	{
		for(int i=1; i<=n; i++)
		{
			//For Spaces
			for(int k=n-i+1; k>0; k--)
			{
				System.out.print(" ");
			}

			//For Values
			for(int j=0; j<i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

		/* Input - 9

	       Output -  1
	    		    2 2
	    		   3 3 3
	    		  4 4 4 4
	    		 5 5 5 5 5
	    		6 6 6 6 6 6
	           7 7 7 7 7 7 7
	          8 8 8 8 8 8 8 8
	         9 9 9 9 9 9 9 9 9

    	*/
	}

	static void Func2(int n)
	{
		int col = 1;
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1 ;j--)
			{
				System.out.print(" ");
			}

			for(int k=1; k<col+1; k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
			col++;
		}

		/* Input - 9

	       Output -   1
			         1 2
			        1 2 3
			       1 2 3 4
			      1 2 3 4 5
			     1 2 3 4 5 6
			    1 2 3 4 5 6 7
			   1 2 3 4 5 6 7 8
			  1 2 3 4 5 6 7 8 9

    	*/
	}

}