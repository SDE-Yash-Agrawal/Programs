// This program is to remove the duplicate element in ArrayList

import java.util.*;
import java.util.ArrayList;
class RemovalOfElementInArrayList
{
	public static void main(String args[])
	{
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		arrl.add(5);
		arrl.add(7);
		arrl.add(8);
		arrl.add(5);
		arrl.add(9);
		arrl.add(7);
		arrl.add(3);

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(arrl);

		ArrayList<Integer> arr = new ArrayList<Integer>(set);

		System.out.print(arr);


	}
}