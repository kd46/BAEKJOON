package d201217;

import java.io.*;

public class P10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fibonacci(n));
		
		br.close();
	}
	
	private static int fibonacci(int n) {
		if(n < 2 ) return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
