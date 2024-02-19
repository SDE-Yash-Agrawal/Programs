// This program is to check whether the given argument in input is an Integer or not!

class IsUserInputInteger
{
	public static void main(String args[])
	{
		String val = args[0];
		try
		{
			Integer.parseInt(val);
			System.out.print(val + " is a valid Integer!");
		} 
		catch(Exception e)
		{
			System.out.print(val + " is not a valid Integer!");
		}
	}
}