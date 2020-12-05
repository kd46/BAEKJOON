package d201205;

import java.io.*;

public class P11720 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split("");
			int sum = 0;
			for(int i = 0; i < n; i++) {
				sum += Integer.parseInt(str[i]);
			}
			
			bw.write(sum + "\n");
						
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
