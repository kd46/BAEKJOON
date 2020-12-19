package d201219;

import java.io.*;
public class P01427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		int[] arr = new int[str.length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		sortReverse(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		br.close();
	}
	
	private static void sortReverse(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j-1] < arr[j]) swap(arr, j-1, j);
			}
		}
	}
	
	private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}


