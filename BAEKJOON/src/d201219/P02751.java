package d201219;

/* 병합정렬 
 * 
 * 
 * 
 * 
 */

import java.io.*;
import java.util.Arrays;
public class P02751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] numList = new int[n];
		for(int i = 0; i < n; i++) {
			numList[i] = Integer.parseInt(br.readLine());
		}
		
		numList = sort(numList);
		printArr(numList, bw);
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int[] sort(int[] numList) {
		
		/* 원소 개수가 1 이하가 될 때까지 분해한다 */
		if(numList.length < 2) return numList;
		
		int mid = numList.length / 2;
		
		/* 0 ~ mid-1 */
		int[] numList_low = sort(Arrays.copyOfRange(numList, 0, mid));
		
		/* mid ~ end */
		int[] numList_high = sort(Arrays.copyOfRange(numList, mid, numList.length));
		
		int[] numList_merged = new int[numList.length];
		
		/* low와 high 배열 각각의 가장 작은 수끼리 비교한다 */
		int current_index = 0, low_index = 0, high_index = 0;
		while(low_index < numList_low.length && high_index < numList_high.length) {
			if(numList_low[low_index] < numList_high[high_index]) {
				numList_merged[current_index++] = numList_low[low_index++];
			} else {
				numList_merged[current_index++] = numList_high[high_index++];
			}
		} 
		
		/* 한쪽 배열이 모두 소진됐으면 반대쪽 전체를 차례대로 병합시킨다 */
		while(low_index < numList_low.length) {
			numList_merged[current_index++] = numList_low[low_index++];
		}
		while(high_index < numList_high.length) {
			numList_merged[current_index++] = numList_high[high_index++];
		} 
		
		return numList_merged;
	}
	
	private static void printArr(int[] numList, BufferedWriter bw) throws IOException {
		for(int i = 0; i < numList.length; i++) {
			bw.write(numList[i] + "\n");
		}
	}
}