package collectionStudy;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector<Object> v= new Vector<Object>();

		v.add("Good");
		v.add('A');
		v.add(true);
		v.add(null);
		v.add(null);
		v.add("Good");
		v.add(12);
		v.add(12.12);

		System.out.println(v);
		v.add(1, "Morning");
		System.out.println(v);

		v.addFirst("Pune");
		v.addLast("MH");
		System.out.println(v);

		System.out.println(v.size());

		System.out.println(v.capacity());

		//v.clear();

		Object v1 = v.clone();
		System.out.println(v1);

		System.out.println(v.contains("Pune123"));

		System.out.println(v.elementAt(1));//get()

		v.ensureCapacity(25);
		System.out.println(v.capacity());

		System.out.println(v.equals(v1));

		System.out.println(v.get(0));

		System.out.println(v.indexOf(12));

		v.insertElementAt("Mumbai", 1);

		System.out.println(v);
		// v.clear();
		System.out.println(v.isEmpty());

		System.out.println(v.lastIndexOf("Good"));

		System.out.println(v.remove(0));
		System.out.println(v);
		v.set(0, "INDIA");
		System.out.println(v);

		//for
		//for each
		//iterator
		//list iterator
		//enumeration
		for(Object a:v)
		{

		System.out.println(a);
		}
		System.out.println("=======================================");
		ListIterator<Object> lit = v.listIterator();
		while(lit.hasNext())
		{
		System.out.println(lit.next());
		}

		System.out.println("=================== Reverse ====================");

		while(lit.hasPrevious())
		{
		System.out.println(lit.previous());
		}

		//emumeration
		Enumeration<Object> ele = v.elements();
		while(ele.hasMoreElements())
		{
		System.out.println(ele.nextElement());
		}
		
//		Vector<Object> v= new Vector<Object>();
//		v.add("Good");
//		v.add('A');
//		v.add(true);
//		v.add(null);
//		v.add(null);
//		v.add("Good");
//		v.add(12);
//		v.add(12.12);
//		System.out.println(v);
//		v.add(1, "Morning");
//		System.out.println(v);
//		v.addFirst("Pune");
//		v.addLast("MH");
//		System.out.println(v);
//		System.out.println(v.size());
//		System.out.println(v.capacity());
//		//v.clear();
//		Object v1 = v.clone();
//		System.out.println(v1);
//		System.out.println(v.contains("Pune123"));
//		System.out.println(v.elementAt(1));//get()
//		v.ensureCapacity(25);
//		System.out.println(v.capacity());
//		System.out.println(v.equals(v1));
//		System.out.println(v.get(0));
//		System.out.println(v.indexOf(12));
//
//		v.insertElementAt("Mumbai", 1);
//		System.out.println(v);
//		// v.clear();
//		System.out.println(v.isEmpty());
//		System.out.println(v.lastIndexOf("Good"));
//		System.out.println(v.remove(0));
//		System.out.println(v);
//		v.set(0, "INDIA");
//		System.out.println(v);
//		//for,
//		//for each
//		//iterator
//		//list iterator
//		for(Object a:v)
//		{
//		System.out.println(a);
//		}

	}

}
