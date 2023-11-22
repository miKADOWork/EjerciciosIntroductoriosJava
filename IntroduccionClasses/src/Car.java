
public class Car {
	private int fuel;
	private int maxspeed;
	// constructor
	public Car(int fuel, int maxspeed) {
		this.fuel = fuel;
		this.maxspeed = maxspeed;
	}
	
	// Constructor vacio
	public Car() {
	}
	
	// getters & setters
	public void setFuel(int fuel) {
		this.fuel = fuel;
		System.out.println(this.getFuel());
	}
	
	public void setMaxSpeed(int maxspeed) {
		this.maxspeed = maxspeed;
		System.out.println(this.getMaxSpeed());
	}
	
	// getters & setters
	public int getFuel() {
		return this.fuel;
	}
	
	public int getMaxSpeed() {
		return this.maxspeed;
	}
	
	// Metodos propios 
	public void drive() {
		// es un metodo vacio no se ha especificado
	}
}

// definimos una clase heredada:

