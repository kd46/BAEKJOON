package d201206;

import java.io.*;

public class P01316 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			int numberOfGroupWord = 0;
			
			for(int i = 0; i < n; i++) {
				if(isGroupWord(br.readLine()) == true) {
					numberOfGroupWord++;
				}
			}
			
			bw.write(numberOfGroupWord + "\n");
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	private static boolean isGroupWord(String str) {
		String[] temp = str.split("");
		
		for(int i = 0; i < str.length(); i++) {
			int first = str.indexOf(temp[i]);
			int last = str.lastIndexOf(temp[i]);
						
			String s = str.substring(first, last+1);
			//System.out.println("isGroupWord: " + s);
			if(seriesLength(s) != (last - first + 1)) {
				return false;
			}			
		}		
		return true;
	}
	
	private static int seriesLength(String series)  {
		String[] str = series.split("");
		int n = 1;
		
		for(int i = 0; i < series.length() - 1; i++) {
			if(str[i].equals(str[i+1])) {
				//System.out.println("compare: " + str[i] + "+" + str[i+1]);
				n++;
			}
		}		
		return n;
	}
}
