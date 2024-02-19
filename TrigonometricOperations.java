// This program is to find all trigonometric operations!
import java.util.*;
import java.lang.Math;

class TrigonometricOperations
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		double val = s.nextDouble();

		double intToRadian = Math.toRadians(val);
		double sin = Math.sin(intToRadian);
		double cos = Math.toRadians(intToRadian);
		double tan = Math.toRadians(intToRadian);
		double sec = Math.toRadians(1/cos);
		double cosec = Math.toRadians(1/sin);
		double cot = Math.toRadians(1/tan);

		System.out.println("Sin of "+ val + " = "+ sin);
		System.out.println("Cos of "+ val + " = "+ cos);
		System.out.println("Tan of "+ val + " = "+ tan);
		System.out.println("Cot of "+ val + " = "+ cot);
		System.out.println("Sec of "+ val + " = "+ sec);
		System.out.println("Cosec of "+ val + " = "+ cosec);
	}
}