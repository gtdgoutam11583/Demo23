package ArrayListStudy;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList();
		
		array.add(10);
		array.add(15);
		array.add(20);
		array.add(25);
		
		System.out.println(array);
		
		array.add(null);
		array.add(null);
		//array.add("Jitendra");
		
		System.out.println(array);
		
		ArrayList <String> arStr = new ArrayList();
		
		arStr.add("Jitendra");
		arStr.add("Manorama");
		arStr.add("Hunny");
		arStr.add("Goutam");
		arStr.add("Goutam");
		arStr.add("Goutam");
		arStr.add("Swapnali");
		arStr.add("Samadhan");
		
		System.out.println(arStr);
		

	}

}
