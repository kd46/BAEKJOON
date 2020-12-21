package d201221;

import java.io.*;
public class P15651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int[] arr = new int[n + 1];
		
		cArr(n, m, arr, 0, bw);		
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void cArr(int n, int m, int[] arr, int cnt, BufferedWriter bw) throws IOException {
		if(cnt == m) {
			for(int i = 0; i < m; i++) {
				bw.write(arr[i] + " ");
			}
			bw.write("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			arr[cnt] = i;
			cArr(n, m, arr, cnt + 1, bw);
		}
	}
}
