package d201219;

import java.io.*;
public class P10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		arr = sortArr(arr);
		
		for(int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int[] sortArr(int[] arr) {
		
		int[] newArr = new int[arr.length];
		int[] cnt = new int[10001];
		
		/* 배열 카운팅 */
		for(int i = 0; i < arr.length; i++) {
			cnt[arr[i]]++;
		}
		
		/* 누적 인덱싱 */
		for(int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i-1];
		}
		
		for(int i = 0; i < arr.length; i++) {
			newArr[cnt[arr[i]] -1 ] = arr[i];
			cnt[arr[i]]--;
		}
		
		return newArr;
	}
}
