package d201216;

import java.io.*;

public class P01929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i) == true) {
				System.out.println(i);
			}
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
