package constractor_chaining;

public class Constractor2 extends Constarctor1 {
	
	public Constractor2()
	{
	super(33); //calling super class constructor in sub class constructor
	System.out.println("Class B constructor");

	}
	public Constractor2(int b)
	{
	System.out.println("Class B constructor"+b);
	}
	
	public static void main(String[] args) {
	Constractor2 b= new Constractor2();
	}

}
