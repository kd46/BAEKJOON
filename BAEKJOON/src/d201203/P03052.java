package d201203;

import java.io.*;
import java.util.ArrayList;

public class P03052 {
	public static void main(String[] args) {
		final int NUM = 10;
		final int DIVISOR = 42;		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			ArrayList<Integer> remainderList = new ArrayList<Integer>();
			int cnt = 0;
						
			for(int i = 0; i < NUM; i++) {
				int remainder = Integer.parseInt(br.readLine()) % DIVISOR;
				if(!remainderList.contains(remainder)) {
					remainderList.add(remainder);
					cnt++;
				}
			}			
			bw.write(cnt + "\n");
			//System.out.println(cnt);
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
