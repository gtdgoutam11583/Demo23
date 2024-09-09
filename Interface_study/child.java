package Interface_study;

public class child implements father, mother   {

	// child class implements two interfaces father and mother
	// two parents one child--> Multiple inheritance concept achieved 
	
	
	
	//@Override
	public void receipe() {// mothers property
		//a=10+a;
		System.out.println("receipe method completed child");
		
		
	}

	//@Override
	public void look() {// mothers property
		System.out.println("look method completed by child");
		
	}

	//@Override
	public void money() {// fathers property
		System.out.println("money method completed by child");
		
	}

	//@Override
	public void property() {// fathers property
		System.out.println("property completed by child");
		
	}

}

