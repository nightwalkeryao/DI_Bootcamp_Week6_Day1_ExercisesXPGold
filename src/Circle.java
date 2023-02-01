
public class Circle {
	private double radius;
	
	public Circle() {
		super();
		this.radius = 1;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2.0);
		Circle c2 = new Circle(12);
		Circle c3 = new Circle(24);
		
		System.out.println("Circle 1 Radius: " + c1.radius + ", Area: " + c1.getArea());
		System.out.println("Circle 2 Radius: " + c2.radius + ", Area: " + c2.getArea());
		System.out.println("Circle 3 Radius: " + c3.radius + ", Area: " + c3.getArea());
	}
}
