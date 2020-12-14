package d201214;

/* V미터인 나무를 낮에 A미터 올라가고, 밤에 B미터 내려온다.
 * 1 ≤ B < A ≤ V ≤ 1,000,000,000
 * A, B, V순으로 입력받는다
 * 
 * 하루에 A-B만큼 올라간다
 * 		낮		밤
 * 1일: a		a-b
 * 2일: 2a-b		2a-2b
 * 3일: 3a-2b	3a-3b
 *  :
 * n일: n(a-b)+b	n(a-b)
 * 
 * v <= n(a-b)+b 를 만족하는 n을 구하라
 * n >= (v-b) / (a-b)
 */

import java.io.*;

public class P02869 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int v = Integer.parseInt(str[2]);
		
		int day = (v-b) / (a-b);
		
		if((v-b) % (a-b) != 0) {
			System.out.println(day + 1);
		} else {
			System.out.println(day);
		}
		
		br.close();
	}
}