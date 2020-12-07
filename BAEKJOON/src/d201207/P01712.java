package d201207;

/*
 * A, B, C 는 2,100,000,000 이하의 자연수이다
 * INTEGER_MAX = 2,147,483,647
 * A는 고정비용
 * B는 가변비용
 * C가 책정가격
 * 
 * n개 판매시 비용 = A + nB
 * n개 판매시 수익 = nC
 * nC가 더 커지는 첫 n이 손익분기점이다	
 * B가 C보다 크거나 같을 경우 손익분기점은 발생하지 않는다 -1
 */

import java.io.*;

public class P01712 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			int c = Integer.parseInt(str[2]);
			
			if(a != 0 && b >= c) {
				bw.write(-1 + "\n");
			} else {
				int n = a / (c - b) + 1;
				bw.write(n + "\n");
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
