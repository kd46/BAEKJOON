package d201205;

import java.io.*;

public class P02675 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int t = Integer.parseInt(br.readLine());
			for(int i = 0; i < t; i++) {
				String[] str = br.readLine().split(" ");
				int r = Integer.parseInt(str[0]);
				String[] s = str[1].split("");
				
				for(int j = 0; j < s.length; j++) {
					for(int k = 0; k < r; k++) {
						bw.write(s[j]);
					}
				}
				bw.write("\n");
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