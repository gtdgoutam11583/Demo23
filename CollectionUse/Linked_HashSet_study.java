package CollectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet_study {

	public static void main(String[] args) {
		
		LinkedHashSet lh= new LinkedHashSet();
		
		lh.add(100);
		lh.add("velocity");
		lh.add('A');
		lh.add(null);
		lh.add(100);
		lh.add(null);
		lh.add('B');
		
		/*2. LinkedHashSet:
	1. Doesn't allow duplicate values
	2. Allow only 1 null value.
	3. order of insertion-maintained
	4. no default capacity
	5. DS: Hybrid (liner+ hashtable)
	6. storage type: hashtable

	best choice: To remove duplicate elements when order of insertion is mandatory
*/
		
		System.out.println(lh);
		System.out.println(lh.isEmpty());
		System.out.println(lh.size());
		System.out.println(lh.contains('B'));
		
		System.out.println(lh);
		
		lh.remove(100);
		System.out.println(lh);
		
		Iterator it= lh.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		for(Object o:lh)
		{
			System.out.println(o);
		}
				
		lh.clear();
		System.out.println(lh);
		System.out.println(lh.size());
		System.out.println(lh.isEmpty());

	}

}
