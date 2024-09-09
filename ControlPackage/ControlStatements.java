package ControlPackage;

public class ControlStatements {
	
	static int x = 100;
	static int y = 50;

	public static void main(String[] args) {
		
		ControlStatements p1 = new ControlStatements();
		p1.m1();
		
	}
	
	public void m1() {
		
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x == y);
		System.out.println(x != y);
	}

}
