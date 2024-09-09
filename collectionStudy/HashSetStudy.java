package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		
		
		HashSet<Object> hs= new HashSet<Object>();
		hs.add("Pune");
		hs.add(12);
		hs.add(12.11);
		hs.add("Pune");
		hs.add(null);
		hs.add('A');
		hs.add(null);
		hs.add(true);
		System.out.println(hs);
		System.out.println(hs);
		System.out.println(hs);
		System.out.println(hs.add("Pune"));
		System.out.println(hs.add("Pune1"));

		//treversing through set
		//doesnot support--> for loop, list Iterator, enumerator
		//supports only--> for each, iterator
		System.out.println("==============for each===============");
		for(Object h:hs)
		{
		System.out.println(h);
		}
		System.out.println("============== iterator ===============");
		Iterator<Object> it = hs.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}

	}

}
