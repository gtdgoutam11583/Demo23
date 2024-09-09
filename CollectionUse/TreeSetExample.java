package CollectionUse;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet ts= new TreeSet();
		
		ts.add("xyz");
		ts.add("velocity");
		ts.add("abc");
		ts.add("pune");
		ts.add("xyz");
		ts.add("XXX");
		ts.add("aaa");
		ts.add("AAA");
		//ts.add(null);--> will throw nullpointer exception
		
		/*3. TreeSet:
	1. doesn't allow duplicate 
	2. null values: not allowed// NullPointerException
	3. order of insertion- Ascending order.
	4. no default capacity.
	5. DS: Balanced tree
	6. storage type: hashtable
	
	note: we can store only homogeneous data
	ClassCastException
	
	best choice: To remove duplicate elements when order of insertion is Ascending order.
*/
		
		System.out.println(ts);
		System.out.println(ts.isEmpty());
		System.out.println(ts.contains("abc"));
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		
		Iterator it= ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(Object o:ts)
		{
			System.out.println(o);
		}

	}

}
