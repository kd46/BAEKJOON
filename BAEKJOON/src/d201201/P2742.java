package d201201;

import java.io.*;

public class P2742 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			for(int i = n; i > 0; i--) {
				bw.write(i + "\n");
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
