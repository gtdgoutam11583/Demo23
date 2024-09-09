package ArrayListStudy;

public class Array {

	public static void main(String[] args) {
		/*
		 * data_type array_name [] = new data_type[length/size]; int arr[] = new int
		 * [n];
		 * 
		 * 1 2 3 4 5 ctrl + shift + f
		 */
		int arr[] = new int[5];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		for (int i = 0; i <= 4; i++) {// 1,2,3,4,
			System.out.print(arr[i] + " "); // 2 3 4 5
		}
	}

}
