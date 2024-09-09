package ArrayListStudy;

import java.util.ArrayList;

public class ListStudy2 {

	public static void main(String[] args) {

		ArrayList<Object> al= new ArrayList<Object>();
		al.add(true);
		al.add(12);
		al.add(12.22);
		al.add("Velocity");
		al.add('B');
		al.add(null);
		al.add("Velocity");
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		String s = "Samadhan";
		System.out.println(s.lastIndexOf("a"));
		String str = "Java Classes";
		System.out.println(str);
		System.out.println(str.replace("Java", "Mannual"));
		
		String test="Samadhan,Gautam,Manorama,Swapnali";
		System.out.println(test);
		
		String[] test1 = test.split(",");
		
		System.out.println(test1[2]);

	}

}
