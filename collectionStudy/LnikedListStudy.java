package collectionStudy;

import java.util.LinkedList;

public class LnikedListStudy {

	public static void main(String[] args) {
		
		LinkedList<Object>ll= new LinkedList<Object>();
		ll.add("Hello");
		ll.add(null);
		ll.add(null);
		ll.add("Hello");
		ll.add(12);

		ll.add(true);
		ll.add(12.12);
		ll.add('A');
		System.out.println(ll);
		System.out.println(ll.get(5));
		System.out.println(ll.element());
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);

		System.out.println(ll.pop());
		System.out.println(ll);

		ll.push("Velocity");
		System.out.println(ll);

	}

}
