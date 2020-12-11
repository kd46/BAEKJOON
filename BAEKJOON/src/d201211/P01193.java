package d201211;

import java.io.*;

public class P01193 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			int[] layer = {0, 0};
			int numerator = 0; //분자
			int denominator = 0; //분모			
			
			//L.1: 1/1			1개
			//L.2: 2/1 ~ 1/2	2개
			//L.n: n/1 ~ 1/n	n개
			//홀수는 n/1부터, 짝수는 1/n부터
			
			for(int i = 0; i * (i + 1) /2 < n; i++) {
				layer[0] = i + 1;	//L.n
				layer[1] = n - i * (i + 1) /2; //L.n의 몇번째
			}
			
			if(layer[0] % 2 == 0) { //짝수
				numerator = layer[1];
				denominator = layer[0] - layer[1] + 1;				
			} else { //홀수
				numerator = layer[0] - layer[1] + 1;
				denominator = layer[1];
			}
			
			bw.write(numerator + "/" + denominator + "\n");
			
			br.close();
			bw.close();
			bw.flush();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
