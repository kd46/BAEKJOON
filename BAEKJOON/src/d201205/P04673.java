package d201205;

import java.io.*;
import java.util.ArrayList;

public class P04673 {
	final static int MAX_NUM = 10000;
	public static void main(String[] args) {
		
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			ArrayList<Integer> numList = new ArrayList<Integer>();
			for(int i = 0; i < MAX_NUM + 1; i++) {
				numList.add(i);
			}
			for(int j = 0; j < MAX_NUM + 1; j++) {
				isSelfNumber(numList.get(j), numList);
			}
			for(int k = 0; k < MAX_NUM + 1; k++) {
				//bw.write(numList.get(k) + "\n");
				if(numList.get(k) != 0) {
					bw.write(k + "\n");
				}
			}
			
			bw.flush();
			bw.close();			
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static void isSelfNumber(int n, ArrayList<Integer> numList) {
		if(numList.get(n) != 0) {
			int d = n+
					n % 10 //일의자리
					+ (n / 10) % 10 //십의자리
					+ (n / 100) % 10 //백의자리
					+ (n / 1000) % 10 //천의자리
					+ n / 10000; //만의자리
			if(d < MAX_NUM + 1) {
				isSelfNumber(d, numList);
				numList.set(d,  0);
			}
		}
	}
}
