package CollectionUse;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_Study {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();

		h.add(100);
		h.add("Velocity");
		h.add('A');
		h.add(100);// added duplicate
		h.add(66.7f);
		h.add(null);
		h.add(null);
		
		/*2. Set(I)
	1. doesn't allow duplicate 
	2. allow only 1 null value(except treeset)
	3. order of insertion-random/asscending/maintain insertion
	4. storage type- hashtable

	1. Hashset(IC)
	2. LinkedHashset(IC)
	3. Treeset(IC)

	1.Hashset:
		1. Doesn't allow duplicate values
		2. Allow only 1 null value.
		*3. order of insertion-random insertion
		4. storage type: hashtable
		5. no default capacity
		6. DS: Hashtable	
		best choice: To remove duplicate elements when order of insertion is not mandatory.
*/

		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.contains('A'));
		System.out.println(h.isEmpty());
		System.out.println(h);
		System.out.println(h.remove('A'));
		System.out.println(h);

		Iterator it = h.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (Object o : h) {
			System.out.println(o);
		}

		h.clear();
		System.out.println(h);
		System.out.println(h.isEmpty());

	}

}
