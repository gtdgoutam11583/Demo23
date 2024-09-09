package Interface_study;

public class ProductionTata implements TataLWV {
	// this class implements sub interface TataLW
	// as TATALWV is sub interface, that its own property and properties form TATA
	// productionTATA has to give definition to all incomplete methods
		
		public static void main(String[] args) {
			
	ProductionTata pt= new ProductionTata();
	pt.Bus();
	pt.Truck();
	pt.car();
	pt.minibus();
			
		}

		@Override
		public void Truck() {
			System.out.println("this is super interface Truck");
			
		}

		@Override
		public void Bus() {
			System.out.println("this is super interface Bus");
			
		}

		@Override
		public void car() {
			System.out.println("this is sub interface Car");
			
		}

		@Override
		public void minibus() {
			System.out.println("this is sub interface Minibus");
			
		}

	}
