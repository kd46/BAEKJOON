package d201202;

import java.io.*;

public class P10818 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int max = Integer.parseInt(str[0]);
			int min = Integer.parseInt(str[0]);
			
			for(int i = 1; i < n; i++) {
				int temp = Integer.parseInt(str[i]);
				if(temp > max) {
					max = temp;
				}
				if(temp < min) {
					min = temp;
				}			
			}
			bw.write(min + " " + max);
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}		
	}
}
