package lab12;

public class UsedCar extends Car {

	public static void main(String[] args) {
		
		private double mileage;
		
		
		
	public double getMileage() {
			return mileage;
		}


		public void setMileage(double mileage) {
			this.mileage = mileage;
		}

	

	public UsedCar() {
		super();
			}

	
	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
	}

;
			

	@Override
	public String toString() {
		return "UsedCar [getMake()=" + getMake() + ", getModel()=" + getModel() + ", getYear()=" + getYear()
				+ ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + "]";
	}
	
	

}
