package d201206;

import java.io.*;

public class P05622 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
			//A to Z
			int[] numOfChar = {2, 2, 2, //ABC 
							   3, 3, 3, //DEF
							   4, 4, 4, //GHI
							   5, 5, 5, //JKL
							   6, 6, 6, //MNO
							   7, 7, 7, 7, //PQRS
							   8, 8, 8, //TUV
							   9, 9, 9, 9}; //WXYZ

			String[] str = br.readLine().split("");
			int time = 0;
			
			for(int i = 0; i < str.length; i++) {
				time += getTime(numOfChar[(int)str[i].charAt(0) - (int)'A']);
			}
			
			bw.write(time + "\n");
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
	private static int getTime(int n) {
		return n+1;
	}
}