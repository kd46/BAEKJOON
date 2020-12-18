package d201218;

import java.io.*;

public class P02798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str1 = br.readLine().split(" ");
		int n = Integer.parseInt(str1[0]);
		int m = Integer.parseInt(str1[1]);
		
		String[] str2 = br.readLine().split(" ");
		int[] card = new int[n];
		
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(str2[i]);
		}
		
		System.out.println(blackjack(n, m, card));
		
		br.close();
	}
	
	private static int blackjack(int n, int m, int[] card) {
		if(n == 3) return card[0] + card[1] + card[2];
		
		int comb = getCombinationNumber(n, 3);
		int[] combSet = {0, 1, 2};
		int answer = card[combSet[0]] + card[combSet[1]] + card[combSet[2]];
		if(answer > m) answer = 0;
		
		/* nC3개의 경우의 수 모두 비교 */
		for(int i = 0; i < comb - 1; i++) {
			
			combSet = nextCombinationNumber(n, combSet);
			
			int sum = card[combSet[0]] + card[combSet[1]] + card[combSet[2]];
			
			if(sum <= m && sum > answer) {
				answer = sum;
			}			
		}
		
		return answer;
	}
		
	/* nCr */
	private static int getCombinationNumber(int n, int r) {
		
		/* nCr = n-1Cr-1 + n-1Cr */
		 
		if(n == r || r == 0) return 1;
		else {
			return getCombinationNumber(n-1, r-1) + getCombinationNumber(n-1, r);
		}
	}
	
	/* nC3에서 입력받은 넘버셋 다음 넘버셋 배열 반환 */
	private static int[] nextCombinationNumber(int n, int[] combSet) {
		
		/* 0 ~ n 까지의 정수 세트 중 3개를 고를 때, combSet의 다음 Set을 반환 */		 
		int[] k = combSet;
		
		if(combSet[1] == n - 2) {
			k[0] = k[0] + 1;
			k[1] = k[0] + 1;
			k[2] = k[1] + 1;
		} else if(combSet[2] == n - 1) {
			k[1] = k[1] + 1;
			k[2] = k[1] + 1;
		} else {
			k[2] = k[2] + 1;
		}
		
		return k;
	}
}
