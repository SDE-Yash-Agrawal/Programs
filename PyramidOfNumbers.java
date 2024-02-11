//Pyramid of Numbers using Java
import java.util.*;
public class PyramidOfNumbers
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Func1(n);
		System.out.println();
		Func2(n);
		System.out.println();
		Func3(n);
		System.out.println();
		Func4(n);
		System.out.println();
		Func5(n);
		System.out.println();
		Func6(n);
		System.out.println();
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

	static void Func3(int n)
	{
		int col = 1;
		for(int i=n; i>0; i--)
		{
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}

			for(int k=1; k<col+1; k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			col++;
		}

		/* Input - 9

	       Output -   *
				     * *
				    * * *
				   * * * *
				  * * * * *
				 * * * * * *
				* * * * * * *
			   * * * * * * * *
			  * * * * * * * * *

    	*/
	}

	static void Func4(int n)
	{
		int col = 1;
		for(int i=n; i>0; i--)
		{
			for(int j=i*2; j>1; j--) //Here I have made j = i*2 because of equal space distribution.
			{
				System.out.print(" ");
			}

			for(int k=1; k<=col; k++)
			{
				System.out.print(k + " ");
			}

			for(int l=col-1; l>=1; l--)
			{
				System.out.print(l + " ");
			}

			System.out.println();
			col++;
		}

		/* Input - 9

	       Output -                    1
						             1 2 1
						           1 2 3 2 1
						         1 2 3 4 3 2 1
						       1 2 3 4 5 4 3 2 1
						     1 2 3 4 5 6 5 4 3 2 1
						   1 2 3 4 5 6 7 6 5 4 3 2 1
						 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
					   1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

    	*/
	}

	static void Func5(int n)
	{
		int row = n;
		for(int i=0 ; i<n; i++)
		{
			for(int j=0; j<i*2; j++)
			{
				System.out.print(" ");
			}

			for(int k=1; k<=row; k++)
			{
				System.out.print(k + " ");
			}

			for(int l= row-1; l>0; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
			row--;
		}

		/* Input - 9

	       Output -  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
				       1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
				         1 2 3 4 5 6 7 6 5 4 3 2 1
				           1 2 3 4 5 6 5 4 3 2 1
				             1 2 3 4 5 4 3 2 1
				           	   1 2 3 4 3 2 1
				                 1 2 3 2 1
				              	   1 2 1
				                     1

    	*/
	}

	static void Func6(int n)
	{
		int row = n;
		for(int i=n; i>0; i--)
		{
			for(int j=i*2; j>1; j--)
			{
				System.out.print(" ");
			}

			for(int k=row; k<n+1; k++)
			{
				System.out.print(k + " ");
			}

			for(int l=n-1; l>=row; l--)
			{
				System.out.print(l + " ");
			}
			System.out.println();
			row--;
		}

		/* Input - 9

	       Output -                  9
					               8 9 8
					             7 8 9 8 7
					           6 7 8 9 8 7 6
					         5 6 7 8 9 8 7 6 5
					       4 5 6 7 8 9 8 7 6 5 4
					     3 4 5 6 7 8 9 8 7 6 5 4 3
					   2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
					 1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

    	*/
	}

}