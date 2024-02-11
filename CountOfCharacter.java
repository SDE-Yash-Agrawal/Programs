// This program will find the duplicate character and the count of that character!

import java.util.*;
import java.util.HashMap;

class CountOfCharacter
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); //Taking input as a String.

		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); //Creating a HashMap for storing key, value pairs of (Character, Integer).

		char[] arr = str.toCharArray(); //Converting string to array of characters.

		for(int i = 0; i<arr.length; i++)
		{
			if(map.containsKey(arr[i])) // HashMap<object>.containsKey(key) function is used to check whether the key is present in HashMap or not.
			{
				map.put(arr[i], map.get(arr[i])+1); // Object.put(key, value) function is used to insert the key and its value in the map.
			}
			else
			{
				map.put(arr[i], 1);
			}
		}

		Set<Character> set = map.keySet(); // Object.keySet() function is used to make a set of all the keys present in the map.
		
		for(Character c: set)
		{
			if(map.get(c) > 1) // Object.get() function is used to used to get the value of key.
			{
				System.out.print(c + ":" + map.get(c)+ " ");
			}
		}
	}
}