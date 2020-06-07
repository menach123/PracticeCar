package default_;

public class FuelTank extends CarPart {
	
	public int tank; 
	
	
	
	public FuelTank() {
		this.condition = 100;
		this.partDescription = "Fuel Tank";
		fillTank();
	}
	
	public FuelTank(int condition) {
		this.condition = condition;
		this.partDescription = "Fuel Tank";
		fillTank();
	}
	
	
	public void fillTank() {
		tank = 100;
	}
	
	public void fillTank(int level) {
		if  (level >100) {
			level = 100;
		}
		
		if (level < 0) {
			level = 0;
		}
		
		tank = level;
	}
	
	public void function() {
		if (tank > 15) {
			System.out.println("Glug "+ this.partDescription);
		}
		else {
			if (tank > 0) {
				System.out.println("Low "+ this.partDescription);
			}
			else {
				System.out.println("Empty "+ this.partDescription);
			}
		}
		
		
	}

}
