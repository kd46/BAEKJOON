package d201205;

import java.io.*;
import java.util.Arrays;

public class P01157 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int asciiA = (int) 'A';
			int asciiZ = (int) 'Z';
			int[] alphabet = new int[asciiZ - asciiA + 1];
			Arrays.fill(alphabet, 0);
			
			String[] str = br.readLine().split("");
			
			//배열 alphabet을 A부터 Z의 ASCII로 채운다
			for(int i = 0; i < str.length; i++) {
				int tempAscii = (int) str[i].toUpperCase().charAt(0);
				alphabet[tempAscii - asciiA]++;
			}
			
			int maxNum = alphabet[0];
			int maxNumIndex = 0;
			int isSame = 0;
			
			for(int i = 1; i < alphabet.length; i++) {
				if(alphabet[i] > maxNum) {
					//maxNum을 찾고 index를 기록
					maxNum = alphabet[i];
					maxNumIndex = i;
					//새로운 maxNum을 찾을 때마다 isSame을 초기화
					isSame = 0;
				} else if(alphabet[i] == maxNum) {
					//중복된 max가 있다
					isSame = 1;
				}
			}
			
			if(isSame == 1) {
				bw.write("?\n");
			} else {
				bw.write(String.valueOf((char)(maxNumIndex + asciiA)) + "\n");
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