package d201218;

/*

M = 100A + 10B + C
N = M + 100A + 10B + C

N은 M의 생성자

생성자 가능성 
4자리수 N-36 ~ N
3자리수 N-27 ~ N
2자리수 N-18 ~ N
1자리수 N-9 ~ N 

*/

import java.io.*;

public class P02231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(constructor(n));
		
		br.close();
	}
	
	private static int constructor(int n) {
		
		for(int i = 0; i < n; i++) {
			String[] str = String.valueOf(i).split("");
			
			int sum = 0;
			
			for(int j = 0; j < str.length; j++) {
				sum += Integer.parseInt(str[j]);
			}
			
			if(i + sum == n) return i; 
		}		
		return 0;
	}
}


