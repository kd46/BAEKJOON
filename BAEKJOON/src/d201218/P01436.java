package d201218;

import java.io.*;
public class P01436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Solve solve = new Solve();
		
		System.out.println(solve.nth666(n));
		
		br.close();
	}	
}

class Solve {
	int nth666(int n) {
		int cnt = 0;
		int num = 666;
		
		while(cnt < n) {
			if(has666(num++)) cnt++;
		}
		
		return num - 1;
	}
	
	private boolean has666(int n) {
		int temp = n;
		while(temp >= 666) {
			if(temp % 1000 == 666) {
				return true;
			}
			temp /= 10;
		} 
		return false;
	}
}
