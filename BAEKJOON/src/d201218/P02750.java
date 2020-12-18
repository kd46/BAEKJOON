package d201218;

import java.io.*;
public class P02750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] numList = new int[n];
		for(int i = 0; i < n; i++) {
			numList[i] = Integer.parseInt(br.readLine());
		}
		
		sort(numList);
		printArr(numList);
		
		br.close();
	}
	
	private static void sort(int[] numList) {
		for(int i = 0; i < numList.length - 1; i++) {
			for(int j = 1; j < numList.length - i; j++) {
				if(numList[j - 1] > numList[j]) {
					int temp = numList[j-1];
					numList[j-1] = numList[j];
					numList[j] = temp;
				}
			}
		}
	}
	
	private static void printArr(int[] numList) {
		for(int i = 0; i < numList.length; i++) {
			System.out.println(numList[i]);
		}
	}
}

