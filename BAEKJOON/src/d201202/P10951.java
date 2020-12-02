package d201202;

import java.io.*;

public class P10951 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String str = "";
			while((str = br.readLine()) != null) {
				String[] temp = str.split(" ");
				int a = Integer.parseInt(temp[0]);
				int b = Integer.parseInt(temp[1]);
				bw.write((a + b) + "\n");
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
