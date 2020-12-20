package d201220;

import java.io.*;
public class P11651 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		arr = sort(arr);
		
		for(int i = 0; i < n; i++) {
			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int[][] sort(int[][] arr) {
		if(arr.length < 2) return arr;
		
		int mid = arr.length / 2;
		
		/* 0 ~ mid-1 */
		int[][] low = sort(copyOfRange(arr, 0, mid));
		
		/* mid ~ end */
		int[][] high = sort(copyOfRange(arr, mid, arr.length));
		
		int[][] merged = new int[arr.length][2];
		
		/* low와 high 배열 각각의 가장 작은 수끼리 비교한다 */
		int m = 0, l = 0, h = 0;
		while(l < low.length && h < high.length) {
			
			/* y끼리 비교해서 low가 작을 경우 */
			if(low[l][1] < high[h][1]) {
				merged[m][0] = low[l][0];
				merged[m++][1] = low[l++][1];
			
			/* y가 같을 때 x끼리 비교해서 low가 작을 경우 */
			} else if(low[l][1] == high[h][1] 
					&& low[l][0] < high[h][0]) {
				merged[m][0] = low[l][0];
				merged[m++][1] = low[l++][1];
				
			/* y는 같지만 x는 high가 클경우, 둘다 high가 클경우 */
			} else {
				merged[m][0] = high[h][0];
				merged[m++][1] = high[h++][1];
			}
		} 
		
		/* 한쪽 배열이 모두 소진됐으면 반대쪽 전체를 차례대로 병합시킨다 */
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
	
	private static int[][] copyOfRange(int[][] arr, int start, int end) {
		int[][] temp = new int[end-start][2];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i][0] = arr[start + i][0];
			temp[i][1] = arr[start + i][1];
		}
		
		return temp;
	}
}

