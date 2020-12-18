package d201218;

/* 하노이의 탑
 * n개의 원반을 모두 옮기는데 걸리는 최소 횟수는 2^n-1
 * 
 * @ n+1번개의 원판을 다른 기둥으로 옮기기
 * 1. n번째까지의 원판을 2번 기둥으로 옮긴다 = A(n)
 * 2. n+1번째 원판을 3번 기둥으로 옮긴다 = A(n)+1
 * 3. 2번 기둥에 있던 n번째까지의 원판들을 n+1번째 원판 위에 올린다 = A(n)+1+A(n)
 * 즉, A(n+1) = 2 * A(n) + 1
 * A(1) = 1, A(n+1) = 2 * A(n) + 1 이므로
 * 일반항 A(n) = 2^n -1
 */

import java.io.*;

public class P11729 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println((int)Math.pow(2, n) - 1);
		hanoi(1, 3, n, bw);
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int hanoi(int from, int to, int n, BufferedWriter bw) throws IOException {
		if(n == 1) {
			bw.write(from + " " + to + "\n");
			//System.out.println(from + " " + to);
			return 0;
		}
		
		hanoi(from, 6 - from - to, n-1, bw);
		bw.write(from + " " + to + "\n");
		//System.out.println(from + " " + to);
		hanoi(6 - from - to, to, n-1, bw);
		return 0;
	}
}
