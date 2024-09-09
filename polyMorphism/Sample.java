package polyMorphism;

public class Sample {

	public static void main(String[] args) {
		Sample demo = new Sample();
		
		demo.sum();
		demo.sum(25,36);

	}
public void sum() {
	int a = 10;
	int b = 20;
	int sum = a + b;
	System.out.println("Sum is "+sum);
}
public void sum(int a,int b) {
	int sum = a + b;
	System.out.println("Sum is "+sum);
}
}
