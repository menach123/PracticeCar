package default_;

public class Simulator {
	
	public static void main(String[] args) {
		Car c = new Car();
		c.run();
		
		c = new Car(new Engine(6, 40), new Wheels(28, 9), new FuelTank(25) );
		c.run();
	}

}
