package d201216;

/* 소수 판별법
 * 1. 해당 숫자의 1/2까지 확인
 * 2. 해당 숫자가 홀수일 경우, 루트까지 확인
 * 		예를 들어 24의 공약수는
 * 		1, 2, 3, 4, 6, 8, 12, 24
 * 		이때 루트24 = 4.9 즉 공약수의 중심을 찾을 수 있다
 * 		공약수의 중심까지 확인하면 그 이후는 확인할 필요가 없음
 */

import java.io.*;

public class P01978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int cnt = 0;
		
		for(int i = 0; i < t; i++) {
			if(isPrime(Integer.parseInt(str[i])) == true) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
	
	private static boolean isPrime(int n) {
		if(n == 1) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
