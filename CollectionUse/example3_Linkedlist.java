package CollectionUse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class example3_Linkedlist {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
		ll.add("abc");
		ll.add(100);
		ll.add('A');
		ll.add(65.5f);
		ll.add(100);
		ll.add(null);
		ll.add(null);
		
		/*3. LinkedList
	1. duplicate are allowed in LinkeList
	2. allows any no of null values
	3. order of insertion-maintain
	4. storage type: index
 	5. no Default capacity in linkedlist
	6. data structure: linear
	7. best choice: manipulation operation   i.e. insertion in between linkedlist or delete()
	8. worst choice: retrival operation (random access interface is not implemented)
*/
			
		System.out.println(ll);
		System.out.println(ll.size());    //7
		System.out.println(ll.isEmpty());  //false
		System.out.println(ll.contains(100));   //true
		System.out.println(ll.indexOf(100));     //1
		System.out.println(ll.lastIndexOf(100));  //4
		System.out.println(ll.get(2));       //A
		
		System.out.println(ll);
		ll.add(4,200);           //insert info in between linkedlist
		System.out.println(ll);
		ll.remove(4);     //remove info in between linkedlist
		System.out.println(ll);
		
		ll.set(0, "xyz");
		System.out.println(ll);
		
		/*Cursors in Collection
	1. Iterator
	All the collection object  --> Universal curser
	Using Enumeration and iterator we can traverse collection object only in forward direction not a backward --> Single directional cursor
	By using iterator we can perform only read and remove operation we can not perform replace and addition of new object.
	2. list Iterator 
	Only applicable for list interface type implementation classes --> not universal curser
	Using list iterator we can traverse a List in forward direction and backward direction--> bidirectional cursor
	By using list Iterator we can perform read, remove, replace and addition of new object operations.
	3. Enumeration 
	Only applicable for legacy classes and hence it is not a universal cursor.
	Using Enumeration and iterator we can traverse collection object only in forward direction not a backward --> Single directional cursor
	By using enumeration we can get only read access.
*/
		
		
		System.out.println("-----print info in linkdlist using iterator cursor------");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----print info in linkdlist using Listiterator cursor------");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("-----print info in linkdlist using for loop------");	
		for(int i=0; i<=ll.size()-1; i++) {
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("-----print info in linkdlist using foreach loop------");		
		for(Object s1:ll) 
		{
			System.out.println(s1);
		}

	}

}
