package d201209;

/*
1		6 * 0 + 1
2~7		6 * 1 + 1
8~19	6 * 3 + 1
20~37	6 * 6 + 1
38~61	6 * 10 + 1
62~91	6 * 15 + 1
92~127	6 * 21 + 1
A0 = 0
An = An-1 + n
B0 = 1
Bn = 6*An + 1
*/

import java.io.*;

public class P02292 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			
			//수열 A, B
			int a = 0;
			int b = 1;
			//육각범위는 B(i)+1 ~ B(i+1)  
			//주어진 숫자가 속하는 육각범위 i + 1 이 답
			for(int i = 0; ; i++) {
				a += i; // A(n) = A(n-1) + n;
				b = 6*a + 1; //B(n) = 6* A(n) + 1
				if(n <= b)  {
					bw.write(i + 1 + "\n");
					break;
				}
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

