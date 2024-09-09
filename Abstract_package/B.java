package Abstract_package;

public class B extends A {

	public void test4() {
	System.out.println("This is test4");	
	}
	
	public void test5() {
		System.out.println("This is test5");
	}
	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("This is abstarct method from class A");
	}
public static void main(String[] args) {
	B b = new B();
	b.test1("test1");
	b.test2("test2");
	b.test3();
	b.test4();
	b.test5();
}
}
