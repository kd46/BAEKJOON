package d201216;

import java.io.*;

public class P04948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		
		while((n = Integer.parseInt(br.readLine())) != 0) {
			System.out.println(getPrimeCount(n));
		}
		
		br.close();
	}
	
	private static int getPrimeCount(int n) {
		int cnt = 0;
		
		for(int i = n; i < 2*n; i++) {
			if(isPrime(i+1) == true) {
				cnt++;	
			}
		}		
		return cnt;
	}
	
	private static boolean isPrime(int n) {
		if(n == 1) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}		
		return true;
	}
}
