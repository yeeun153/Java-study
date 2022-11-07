package hw;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		double x = in.nextDouble();
		
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		double y = in.nextDouble();
		
		System.out.printf("직사각형의 넓이는 %5.1f입니다.\n", x * y);
		
	}

}
