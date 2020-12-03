package d201203;

import java.io.*;

public class P02562 {
	public static void main(String[] args) {
		final int NUM = 9;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int a = Integer.parseInt(br.readLine());
			int z = 1;
			
			for(int i = 1; i < NUM; i++) {
				int b = Integer.parseInt(br.readLine());
				if(a < b) {
					a = b;
					z = i+1;
				}
			}
			bw.write(a+"\n"+z);
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}		
	}
}
