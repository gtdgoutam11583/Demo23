package Abstract_study;

public class Abstract_test {

	public static void main(String[] args) {
		
		// as we cant create object of abstract class
		// creating object of concrete class
		Concrete_use c= new Concrete_use();//object creation
		
		c.test1();//method completed in Abstract class
		c.test2();//method completed in Abstract class
		c.test3();//method completed in Abstract class--> has empty body
		c.test4();//method completed in concrete class
		c.test5();//method completed in concrete class--> own method
		
	}

}

