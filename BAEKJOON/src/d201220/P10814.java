package d201220;

import java.io.*;
public class P10814 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] age = new int[n][2];	//int[i][0] : age, int[i][1] : index
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			age[i][0] = Integer.parseInt(temp[0]);
			age[i][1] = i;
			str[i] = temp[1];
		}
		
		String[][] prt = sort(age, str);
		
		for(int i = 0; i < n; i++) {
			bw.write(prt[i][0] + " " + prt[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

	private static String[][] sort(int[][] age, String[] str) {
		String[][] result = new String[str.length][2];
		int[][] temp = new int[age.length][2];
		temp = sortInt(age);
		
		for(int i = 0; i < str.length; i++) {
			result[i][0] = Integer.toString(temp[i][0]);
			result[i][1] = str[temp[i][1]];
		}
		
		return result;
	}
	
	private static int[][] sortInt(int[][] age) {
		if(age.length < 2) return age;
		
		int mid = age.length / 2;
		int[][] low = sortInt(copyOfRange(age, 0, mid));
		int[][] high = sortInt(copyOfRange(age, mid, age.length));
		int[][] merged = new int[age.length][2];
		
		int m = 0, l = 0, h = 0;
		
		while(l < low.length && h < high.length) {
			if(low[l][0] < high[h][0]) {
				merged[m][0] = low[l][0];
				merged[m++][1] = low[l++][1];
			} else if(low[l][0] == high[h][0]
					&& low[l][1] < high[h][1]) {
				merged[m][0] = low[l][0];
				merged[m++][1] = low[l++][1];
			} else {
				merged[m][0] = high[h][0];
				merged[m++][1] = high[h++][1];
			}
		}
		while(l < low.length) {
			merged[m][0] = low[l][0];
			merged[m++][1] = low[l++][1];
		}
		while(h < high.length) {
			merged[m][0] = high[h][0];
			merged[m++][1] = high[h++][1];
		} 
		
		return merged;
	}
	
	private static int[][] copyOfRange(int[][] age, int start, int end) {
		int[][] temp = new int[end - start][2];
		for(int i = 0; i < temp.length; i++) {
			temp[i][0] = age[start + i][0];
			temp[i][1] = age[start + i][1];
		}
		return temp;
	}
}
