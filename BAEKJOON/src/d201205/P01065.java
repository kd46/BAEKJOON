package d201205;

/*
 * 1 <= n <= 1000
 * 각 자리가 등차수열인 수를 한수라고 한다
 * 1자리 자연수와 2자리 자연수는 모두 한수이다
 */

import java.io.*;

public class P01065 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			for(int i = 1; i <= n; i++) {
				if(i < 100) { //1자리 자연수와 2자리 자연수는 모두 한수이다
					cnt++;
				} else {
					if(i/100 - (i/10)%10 == (i/10)%10 - i%10) {
						cnt++;
					}					
				}				
			}
			
			bw.write(cnt + "\n");
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}		
	}
}
