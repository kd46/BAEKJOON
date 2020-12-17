package d201217;

import java.io.*;

public class P10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(factorial(n));
		
		br.close();
	}
	
	private static int factorial(int n) {
		if(n > 1) return n * factorial(n-1);
		else return 1;
	}
}
