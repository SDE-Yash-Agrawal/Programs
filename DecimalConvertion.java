// This function is to convert Decimal Value into other values!
import java.util.*;
class DecimalConvertion
{
	public static void main(String args[])
	{
		decimalToBinary();
		decimalToOctal();
		decimalToHexadecimal();
	}

	//Decimal to Binary!
	static void decimalToBinary()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Decimal value to convert it into Binary: ");
		int value = s.nextInt();
		String binary = "";
		int rem = 0;

		while(value > 0)
		{
			rem = value % 2;
			binary = rem + binary;
			value /= 2;
		}
		System.out.println(binary);
	}

	//Decimal to Octal!
	static void decimalToOctal()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Decimal value to convert it into Octal: ");
		int value = s.nextInt();
		String octal = "";
		int rem = 0;

		while(value > 0)
		{
			rem = value % 8;
			octal = rem + octal;
			value /= 8;
		}
		System.out.println(octal);
	}

	//Decimal to Hexadecimal!
	static void decimalToHexadecimal()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Decimal value to convert it into hexadecimal: ");
		int value = s.nextInt();
		String hexa = "";
		int rem = 0;
		char[] hexadecimal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

		while(value > 0)
		{
			rem = value % 16;
			hexa = hexadecimal[rem] + hexa;
			value /= 16;
		}
		System.out.println(hexa);
	}
}