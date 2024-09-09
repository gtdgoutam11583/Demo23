package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<String>als= new ArrayList<String>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		al.add(10);
		al.add(10);
		System.out.println(al);
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println(al);
		al.add(50);
		al.add(60);
		System.out.println(al);
		al.add(2, 100);
		System.out.println(al);
		al.addFirst(0);
		System.out.println(al);
		al.addLast(90);
		System.out.println(al);
		//al.clear();
		System.out.println(al);
		Object alnew = al.clone();
		System.out.println(alnew);
		System.out.println(al.contains(20));
		System.out.println(al.get(1));
		System.out.println(al.indexOf(10));
		int myIndex = al.indexOf(100);
		System.out.println(myIndex);

		//al.clear();
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(10));

		System.out.println(al);
		System.out.println(al.remove(3));
		System.out.println(al);
		//al.remove(100);
		System.out.println(al.set(2, 500));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("=============Traversing through List============");

		System.out.println("=========== for loop ===============");

		for(int i=0;i<=al.size()-1;i++)
		{
		System.out.println(al.get(i));//0,1,2,3...12
		}
		System.out.println("=========== for each loop ===============");
		for(Integer a:al)
		{
		System.out.println(a);
		}
		System.out.println("================= Iterator ==============");
		Iterator<Integer> it = al.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("======List-Iterator =============");
		ListIterator<Integer> lit = al.listIterator();
		while(lit.hasNext())
		{
		System.out.println(lit.next());
		}

	}

}
