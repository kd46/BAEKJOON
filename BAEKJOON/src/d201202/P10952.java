package d201202;

import java.io.*;

public class P10952 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			while(true) {
				String[] str = br.readLine().split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				if(a == 0) {
					break;
				}
				bw.write(a + b + "\n");
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