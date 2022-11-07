package sec04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  //Scanner 객체를 생성
		int x = in.nextInt();  //키보드로 입력한 정수 데이터를 변수에 대입
		//int y = in.nextInt();
		String s = in.next();
		//System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
		System.out.print(x + "과  " + s + "를 입력했습니다.");
		in.close();
	}
}