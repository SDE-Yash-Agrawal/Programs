// This program is for matrix operations like Addition, Subtraction, Multiplication, Transpose

import java.util.*;
class MatrixOperations
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Row Size: ");
		int row = s.nextInt();
		System.out.print("Enter Column Size: ");
		int col = s.nextInt();

		System.out.println("Enter "+row*col+ " no. of elements for first matrix");
		int[][] arr1 = new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr1[i][j] = s.nextInt();
			}
		}

		System.out.println("Enter "+row*col+ " no. of elements for second matrix");
		int[][] arr2 = new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr2[i][j] = s.nextInt();
			}
		}

		//For Addition of Matrix
		int[][] add = new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				add[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		System.out.println("Addition of Matrix:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(add[i][j]+"  ");
			}
			System.out.println();
		}

		//For Subtraction of matrix
		int[][] sub = new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				sub[i][j] = arr1[i][j] - arr2[i][j];
			}
		}

		System.out.println("Subtraction of Matrix:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(sub[i][j]+"  ");
			}
			System.out.println();
		}

		//For Matrix Multiplication
		//Note - Matrix Multiplication is done if no. of 
		//column of first matrix == no. of rows of second 
		//matrix, so that the new matrix which will be formed
		//is of size of row = rows of first matrix, column = column
		//of second matrix.(Here both matrix have same size)

		int[][] mul = new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				for(int k=0; k<col; k++)
				{
					mul[i][j] += arr1[i][k] * arr2[k][j];
				}
			}

		}

		System.out.println("Multiplication of Matrix:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(mul[i][j]+"  ");
			}
			System.out.println();
		} 

		//Transpose of matrix, here we are doing transpose of multiplication matrix
		System.out.println("Transpose of Matrix:");
		int[][] transpose = new int[row][col];

		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				transpose[i][j] = mul[i][j];
			}
		}

		//Swapping
		for(int i=0; i<row; i++)
		{
			for(int j=i; j<col; j++)
			{
				int temp = transpose[j][i];
				transpose[j][i] = mul[i][j];
				transpose[i][j] = temp;
			}
		}

		//Printing
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(transpose[i][j]+"  ");
			}
			System.out.println();
		} 
	}	
}