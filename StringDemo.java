package hw;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		String url;
		String s1 = "bye";
		String s2 = "com";
		String s3 = "java";
		
		do {
			System.out.print("URL을 입력하세요 : ");
			Scanner in = new Scanner(System.in);
			url = in.next();
			
			if(url.endsWith(s1))
				System.out.println("프로그램을 종료합니다.");
			else {
				if (url.endsWith(s2)) 
					System.out.println(url + "은 '" + s2 + "'으로 끝납니다.");
					else 
						System.out.println(url + "은 '" + s2 + "'으로 끝나지 않습니다.");

				if(url.contains(s3)) 
					System.out.println(url + "은 '" + s3 + "'를 포함합니다.");
					else 
						System.out.println(url + "은 '" + s3 + "'를 포함하지 않습니다.");}
		}while(!url.equals(s1));

	}

}
