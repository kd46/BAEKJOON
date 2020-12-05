package d201205;

import java.io.*;

/*
 * 단어 S가 주어진다
 * S는 100자를 넘지 않으며 모두 소문자이다
 */

public class P10809 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int a = (int)'a';
			int z = (int)'z';
			
			//Array contains a to z
			int[] arr = new int[z - a + 1];
			
			String str = br.readLine();
			
			for(int i = a; i <= z; i++) {
				for(int j = 0; j < str.length(); j++) {
					if(i == (int) str.charAt(j)) {
						arr[i-a] = j;
						break;
					}
					else {
						arr[i-a] = -1;
					}
				}
			}
			
			for(int j = 0; j < arr.length; j++) {
				bw.write(arr[j] + " ");
			}
			bw.write("\n");
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
