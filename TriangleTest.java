package hw;

public class TriangleTest{
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0 , 5.0); 
		System.out.println(t1.findArea());
	}
}

class Triangle{
	private double base;
	private double height;
	
	public Triangle(double base , double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double findArea(){
		return (base * height) / 2;
	}
} 