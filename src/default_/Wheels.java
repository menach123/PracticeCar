package default_;

public class Wheels extends CarPart{
	
	public int sizeInches = 30;
	public boolean inflated = false;
	
	public Wheels() {
		this.condition = 100;
		this.partDescription = "Wheels";
		this.inflating();
	}
	public Wheels(int sizeInches, int condition) {
		this.condition = condition;
		this.partDescription = "Wheels";
		this.inflating();
		this.sizeInches = sizeInches;
	}
	
	public void function() {
		if (this.condition > 10 &&  inflated) {
			
			System.out.println("Squeak "+ this.partDescription);
		}
		else {
//			System.out.println(this.condition);
			if (inflated == true) {
				System.out.println("Pop! "+ this.partDescription);
				inflated = false;
			}
			else {
				System.out.println("Flat! "+ this.partDescription);
			}
			
		}
	}
	
	public void inflating() {
		
		if (this.condition < 10) {
			System.out.println("Can't inflate");
			inflated = false;
		}
		else {
			inflated = true;
		}
		
		
		
	}
	
	
	

}
