package d201219;

import java.io.*;
import java.util.Arrays;
public class P02108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		System.out.println(mean(arr));
		System.out.println(median(arr));
		System.out.println(mode(arr));
		System.out.println(range(arr));
		
		br.close();
	}
	
	/* 산술평균 */
	public static int mean(int[] arr) {
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		return (int) Math.round(avg / (double) arr.length);
	}
	
	/* 중앙값 */
	public static int median(int[] arr) {
		/* arr.length는 홀수 */
		return arr[arr.length / 2];
	}	
	
	/* 최빈값 */
	/* 여러개라면 최빈값 중 두 번째로 작은 값 */
	public static int mode(int[] arr) {
		/* 카운팅 배열 초기화 */
		int[] count = new int[8001];
		
		/* 카운트 */
		for(int i = 0; i < arr.length; i++) {
			count[arr[i] + 4000]++;
		}
		
		/* 최빈도 maxCount */
		/* 최빈값 maxValue */
		int maxCount = 0;
		int maxValue = 0;
		int secondMaxValue = 0;
		boolean hasSecondMaxValue = false;
		
		for(int i = 0; i < count.length; i++) {
			
			/* 새로운 최빈도 갱신 */
			if(count[i] > maxCount) {
				maxCount = count[i];
				maxValue = i - 4000;
				hasSecondMaxValue = false;
				
			/* 두번째로 작은 최빈값 확인 */
			} else if (!hasSecondMaxValue && count[i] == maxCount) {
				hasSecondMaxValue = true;
				secondMaxValue = i - 4000;
			}
		}
		
		return hasSecondMaxValue ? secondMaxValue : maxValue;
	}
	
	/* 범위 */
	public static int range(int[] arr) {
		
		return arr[arr.length - 1] - arr[0]; 
	}
}
