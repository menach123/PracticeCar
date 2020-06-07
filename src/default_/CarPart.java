package default_;

public class CarPart implements Functional{
	
	public int condition;
	public String partDescription; 
	
	public void status() {
		System.out.println(this.condition);
	}
	
	public void function(){
		System.out.println("Car part");
	}

}
