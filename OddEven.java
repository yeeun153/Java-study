package hw;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = in.nextInt();

		System.out.println((n % 2 == 0 ? "짝수" : "홀수"));

	}

}
