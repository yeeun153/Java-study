package sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data;
		int sum = 0;

		while ((data = in.nextInt()) >= 0)
			scores.add(data);

//		for (int i = 0; i < scores.size(); i++)
//			sum += scores.get(i);
		
		for (int i : scores)
			sum += i;

		System.out.println("평균 = " + sum / scores.size());
	}
}