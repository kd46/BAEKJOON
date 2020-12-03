package d201203;

import java.io.*;

public class P02577 {
	public static void main(String[] args) {
		final int INPUT_NUM = 3;
		final int INT_NUM = 10;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] inputStr = new String[INPUT_NUM];
			int mult = 1;
			
			//입력받은 숫자를 곱해서 multStr로 반환
			for(int i = 0; i < INPUT_NUM; i++) {
				inputStr[i] = br.readLine();
				mult *= Integer.parseInt(inputStr[i]);				
			}
			
			String multStr = String.valueOf(mult);
			//multStr을 List로 변환
			String[] multStrList = multStr.split("");
			for(int i = 0; i < INT_NUM; i++) {
				int cnt = 0;
				for(int j = 0; j < multStr.length(); j++) {
					if(i == Integer.parseInt(multStrList[j])) {
						cnt++;
					}
				}
				bw.write(cnt + "\n");
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
