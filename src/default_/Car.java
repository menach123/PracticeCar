package default_;

import java.util.ArrayList;

public class Car {
	
	ArrayList<CarPart> partsList = new ArrayList<>(); 
	
	
	
	public Car() {
		partsList.add(new Engine());
		partsList.add(new Wheels());
		partsList.add(new FuelTank());
		
	}
	
	public Car(Engine e, Wheels w, FuelTank ft) {

		partsList.add(e);
		partsList.add(w);
		partsList.add(ft);
	}
	
	public void run() {
		for (int i = 0; i < partsList.size(); i++) {
			partsList.get(i).function();
		}
		
	}

}
