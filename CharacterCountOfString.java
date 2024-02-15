//To calculate the count of each character in a String!
import java.util.*;
class CharacterCountOfString
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = s.nextLine();

		CharacterCountOfString obj = new CharacterCountOfString();
		obj.countFunc(str);

	}

	void countFunc(String str)
	{
		char[] arr = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: arr)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}

		System.out.println(str + " : "+map);
	}
}