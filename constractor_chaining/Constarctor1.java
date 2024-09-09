package constractor_chaining;

public class Constarctor1 {

	public Constarctor1() {
		this("samadhan");//constructor chaining
		
		//calling another constructor in constructor
		System.out.println("User Defined zero parameter constructor");
		}
	
		public Constarctor1(int a) {
			this("goutam");
		System.out.println("User Defined single parameter constructor");
		System.out.println(a);
		}
		
		public Constarctor1(String name) {
		System.out.println(name);
		}
		
		public static void main(String[] args) {
			
		//Constarctor1 ab = new Constarctor1();
		
		Constarctor1 cd = new Constarctor1(10);
		}
}
