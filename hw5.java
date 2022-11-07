package hw;

public class hw5 {

	public static void main(String[] args) {
		show(new String("대한민국"));
		show(new StringBuilder("KOREA"));
		show(new StringBuffer("!@#"));
	}
	
	public static void show(Object obj) {
		System.out.println(obj);
	}
}
