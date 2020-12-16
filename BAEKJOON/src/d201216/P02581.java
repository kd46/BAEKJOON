package d201216;

import java.io.*;

public class P02581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i) == true) {
				if(min == 0) {
					min = i;
				}
				sum += i;
			}
		}
		
		if(sum == 0)  {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		
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
