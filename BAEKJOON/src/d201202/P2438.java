package d201202;


import java.io.*;

public class P2438 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			for(int i = 1; i <= n; i++) {
				for(int j = 0; j < i; j++) {
					bw.write("*");
				}
				bw.write("\n");
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