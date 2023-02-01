
public class Car {
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;

	public Car() {
		super();
		this.make = "";
		this.model = "";
		this.year = 0;
		this.color = "";
		this.price = 0;

	}

	public Car(String make, String model, int year) {
		this();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Car(String make, String model, int year, String color, double price) {
		this(make, model, year);
		this.color = color;
		this.price = price;
	}
	
	public void displayCarInfo() {
		System.out.println("Make: " + make + ", Model: "+ model + ", Year: " + year + ", Color: " + color + ", Price: " + price);
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Audi", "A9", 2021);
		Car car3 = new Car("BMW", "i3", 2022, "Black", 300000);
		
		car1.displayCarInfo();
		car2.displayCarInfo();
		car3.displayCarInfo();
	}
}
