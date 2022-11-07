package sec05;

public class CompLogicDemo {
	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));
		                   // true,  수행하지 않으므로 y값은 변화가 없다.
		
		System.out.println("x = " + x + ", y = " + y);

		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- < 1));
        				   // true,  수행하여 y값은 1 감소한다.		
		System.out.println("x = " + x + ", y = " + y);
	}
}