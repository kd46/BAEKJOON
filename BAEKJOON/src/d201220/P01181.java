package d201220;

import java.io.*;
import java.util.Arrays;
public class P01181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = br.readLine();
		}
		
		str = sort(str);
		
		bw.write(str[0] + "\n");;
		for(int i = 1; i < n; i++) {
			if(!str[i].equals(str[i-1])) {
				bw.write(str[i] + "\n");;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static String[] sort(String[] str) {
		
		if(str.length < 2) return str;
		
		int mid = str.length / 2;
		
		String[] low = sort(Arrays.copyOfRange(str, 0, mid));
		String[] high = sort(Arrays.copyOfRange(str, mid, str.length));
		String[] merged = new String[str.length];
		
		int m = 0, l = 0, h = 0;
		
		while(l < low.length && h < high.length) {
			if(low[l].length() < high[h].length()) {
				merged[m++] = low[l++];
			} else if((low[l].length() == high[h].length()) 
					&& compareABC(low[l], high[h])) {
				merged[m++] = low[l++];
			} else {
				merged[m++] = high[h++];
			}
		} 
		
		while(l < low.length) {
			merged[m++] = low[l++];
		} 
		while(h < high.length) {
			merged[m++] = high[h++];
		}
		
		return merged;
	}
	
	/* a가 작으면 true */
	private static boolean compareABC(String a, String b) {
				
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) < b.charAt(i)) {
				return true;
			} else if(a.charAt(i) > b.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
