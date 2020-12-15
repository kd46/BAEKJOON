package d201215;

/* 출발 이동거리는 1
 * 도착 직전 이동거리 1
 * 
 * 전체 이동거리 L를 절반으로 나눠서
 * 1, 2, 3, ~, n, z , n, ~, 3, 2, 1
 *     n(n+1)/2 + z + n(n+1)/2 
 * 
 * n(n+1) <= L < (n+1)(n+2) 일때
 * 
 * 남은 거리 z = L-n(n+1) < 2(n+1)
 * 
 * 단, z가 n+1보다 클때 2회, 작거나 같을 때 이동 1회롤 추가하면 되겠다
 * 
 * 최대 2^31이므로 int 사용 가능
 */

import java.io.*;

public class P01011 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());		
		
		for(int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			System.out.println(minWarp(y-x));
		}
		br.close();
	}
	
	private static int minWarp(int l) {
		
		/* n(n+1) <= L을 만족하는 n */
		/* n <= -0.5 + 루트(l+0.25) */
		int n = (int) Math.floor(-0.5 + Math.sqrt(l+0.25));
		int z = l - n * (n + 1); //남은 거리
		
		if(z == 0) {
			return 2*n;
		} else if(z <= n+1) {
			return 2*n + 1;
		} else {
			return 2*n + 2;
		}		
	}
}
