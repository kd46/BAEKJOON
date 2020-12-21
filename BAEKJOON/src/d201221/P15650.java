package d201221;

import java.io.*;
public class P15650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int[] arr = new int[n + 1];
		boolean[] check = new boolean[n +1];
		
		cArr(n, m, arr, check, 0);
		
		br.close();
	}
	
	public static void cArr(int n, int m, int[] arr, boolean[] check, int cnt) {
		if(cnt == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!check[i] && cnt == 0) {
				check[i] = true;
				arr[cnt] = i;
				cArr(n, m, arr, check, cnt + 1);
				check[i] = false;
			} else if(!check[i] && i > arr[cnt - 1]) {
				check[i] = true;
				arr[cnt] = i;
				cArr(n, m, arr, check, cnt + 1);
				check[i] = false;
			}
			
		}
	}
}
