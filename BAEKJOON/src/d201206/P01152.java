package d201206;

import java.io.*;

public class P01152 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] str = br.readLine().trim().split(" ");
			
			if(str[0].equals("")) {
				bw.write(0 + "\n");
			} else {
				bw.write(str.length + "\n");
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
