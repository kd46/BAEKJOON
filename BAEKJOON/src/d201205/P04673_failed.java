package d201205;

import java.util.ArrayList;
import java.io.*;

public class P04673_failed {
	final static int MAX_NUM = 10000;
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			ArrayList<Integer> selfNumber = new ArrayList<Integer>();
			
			for(int i = 0; i < MAX_NUM + 1; i++) {
				//index i에는 i가 저장되어 있다
				//index 0에는 0이 저장되어 있다
				selfNumber.add(i);
			}
			for(int j = 0; j < MAX_NUM+1; j++) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				getAllD(j, temp);
				selfNumber.removeAll(temp);
				//bw.write(j + "done \n");
			}
			
			selfNumber.forEach(number -> {
				try {
					bw.write(number + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	private static void getAllD(int n, ArrayList<Integer> sequenceOfD) {
		int d = n;
		String[] str = String.valueOf(n).split("");
		
		for(int i = 0; i < str.length; i++) {
			d += Integer.parseInt(str[i]);
		}
		
		if(d <= MAX_NUM && !sequenceOfD.contains(d)) {
			sequenceOfD.add(d);
			getAllD(d, sequenceOfD);
		}
		
	}
}

//33 -> 33+3+3 = 39
//39 -> 39+3+9 = 51