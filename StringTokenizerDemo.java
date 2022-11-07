package hw;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String sentence = new String("you are opening up future doors and possibilities");
		System.out.printf("입력:%s\n", sentence);
		
		StringTokenizer st = new StringTokenizer(sentence, " ");
		int count = st.countTokens();
		String[] strToArray = new String [count];
		for (int i=0; i<count; i++) {
			strToArray[i] = st.nextToken();
		}
		
		System.out.println("단어 개수:" + count);
		
		Arrays.sort(strToArray);
		System.out.print("정렬된 토큰:");
		for (int i=0; i<count-1; i++) {
			System.out.print(strToArray[i] + ", ");
		}
		System.out.print(strToArray[count-1]);
	}
}