package Interface_study;

public class ImpClass implements MyInterface {
	// one class can implement interface  
		public static void main(String[] args) {
			
	System.out.println(a);// calling variable of interface
	ImpClass i= new ImpClass();// creating object of implementation class
	i.m1();
	i.m2();
	i.m3();// own method of implementation class

		}
		
		//a= a+10; this is not allowed as a is final
		public void m1() // providing definition to incomplete methods form interface
		{
			System.out.println("method m1 completed in implementation class");
			
		}

		public void m2() //providing definition to incomplete methods form interface
		{
			System.out.println("method m2 completed in implementation class");
			
		}
		
		public void m3()// own method of ImpClass
		{
			System.out.println("method m3 completed in implementation class");
			
		}
		

		

	}

