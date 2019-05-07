package lab12;

public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
	
	//constructor
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//no args constructor
	public Car() {
		super();
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//to straaang
	@Override
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: $ %-10s \n", make, model, year, price);
	}

}

