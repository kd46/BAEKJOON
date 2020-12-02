package d201202;

import java.io.*;

public class P1110 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			int temp = (10 * (n%10)) + ((n/10+n%10) % 10);
			int cycle = 1;
			
			while(temp != n) {
				temp = (10 * (temp%10)) + ((temp/10+temp%10) % 10);
				cycle++;
			}			
			
			bw.write(String.valueOf(cycle));
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}		
	}
}

//26 -> 2+6=8 -> 68 -> 6+8=14 -> 84