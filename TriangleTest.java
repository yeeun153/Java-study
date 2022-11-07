package test;

class Triangle{
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle() {
		this.base = 1.0;
		this.height = 1.0;
	}
	
	public Triangle(double b) {
		base = b;
		height = b;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double findArea() {
		return (base*height)/2;
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0 , 5.0);
		Triangle t2 = new Triangle(); //밑변 1.0 , 높이 1.0
		Triangle t3 = new Triangle(3.0); //밑변=높이=3.0
		System.out.println(t1.findArea());
		System.out.println("t2=>" + t2.findArea());
		System.out.println("t3=>" + t3.findArea());
	}
}
