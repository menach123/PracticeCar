package default_;

public class Engine extends CarPart {
	
	public int cylinders = 4;
	
	
	
	
	public Engine() {
		this.condition = 100;
		this.partDescription = "Engine";
	}
	
	public Engine(int numbers, int condition) {
		cylinders = numbers;
		this.condition = condition;
		this.partDescription = "Engine";
	}
	
	
	
	public void numCylinder() {
		System.out.println(cylinders+ "Cylinders" );
	}
	
	public void function() {
		if (condition > 45) {
			System.out.println("Vroom "+ this.partDescription);
		}
		else {
			if (condition> 0) {
				System.out.println("Clog, Clog, Vroom "+ this.partDescription);
			}
			else {
				System.out.println("Clog, Clog, Errrrr "+ this.partDescription);
			}
		}
		
	}
	
}
