package d201220;

import java.io.*;
import java.util.Scanner;
public class P15649 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n + 1];
		boolean[] check = new boolean[n + 1];
		
		cArr(n, m, arr, check, 0);
		
		sc.close();
	}
	
	private static void cArr(int n, int m, int[] arr, boolean[] check, int cnt) {
		if(cnt == m)  {
			for(int i = 0; i < m; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n");
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				check[i] = true;
				arr[cnt] = i;
				cArr(n, m, arr, check, cnt + 1);
				check[i] = false;
			} 
		}
	}
}
