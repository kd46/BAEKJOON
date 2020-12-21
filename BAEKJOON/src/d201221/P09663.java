package d201221;

import java.util.Scanner;

public class P09663 {
	public static int cnt = 0;
	public static int n = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			int[] row = new int[n];
			row[0] = i;	//0행 i열에 퀸을 놓는다
			queen(row, 0);
		}
		
		System.out.println(cnt);
		sc.close();
	}
	
	private static void queen(int[] row, int col) {
		if(col == n - 1) {
			cnt++;
			return;
		} 
		
		/* n개의 col에 하나씩 놓아보면서 검사 */
		for(int i = 0; i < n; i++) {
			row[col + 1] = i;
			if(isQueen(row, col + 1)) {
				queen(row, col + 1);
			}
		}
	}
	
	private static boolean isQueen(int[] row, int col) {
		
		for(int i = 0; i < col; i++) {
			//기존 Q: i, r[i]
			//현재 Q: col, r[col]
			
			/* 직선 조건 */
			if(row[i] == row[col]) 
				return false;
			
			/* 대각선 조건 */
			if(Math.abs(i - col) == Math.abs(row[i] - row[col]))
				return false;
		}
		return true;
	}
}


