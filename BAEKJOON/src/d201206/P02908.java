package d201206;

import java.io.*;
public class P02908 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] str = br.readLine().split(" ");
			int a = swapOrder(Integer.parseInt(str[0]));
			int b = swapOrder(Integer.parseInt(str[1]));
			
			if(a > b) {
				bw.write(a + "\n");
			} else {
				bw.write(b + "\n");
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
	private static int swapOrder(int n) {
		int swapN = (n%10) * 100	//일의자리->백의자리
					+ (n/10%10) * 10 //십의자리->십의자리
					+ n/100;	//백의자리->일의자리
		
		return swapN;
	}
}
