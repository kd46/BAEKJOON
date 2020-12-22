package d201222;

import java.io.*;
public class P02580 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int[][] sudoku = new int[9][9];
		boolean[][] check = new boolean[9][9];
		
		for(int i = 0; i < 9; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < 9; j++) {
				sudoku[i][j] = Integer.parseInt(str[j]);
				if(sudoku[i][j] != 0) check[i][j] = true;
				else check[i][j] = false;
			}
		}
				
		solve(sudoku, 0, 0, check);
				
		br.close();
	}
	
	private static void solve(int[][] sudoku, int row, int col, boolean[][] check) throws IOException {
		if(row > 8) {
			printSudoku(sudoku);
			System.exit(0);
		}
		
		/* 해당 칸이 비어있는지 확인 */
		if(check[row][col]) {
			if(col == 8) 
				solve(sudoku, row + 1, 0, check);
			else
				solve(sudoku, row, col + 1, check);
		} else {
		
			/* 1~9까지의 숫자를 넣어서 맞는지 검사 */
			/* 맞는다면 다음 숫자칸으로 이동 */
			for(int i = 1; i <= 9; i++) {
				if(isRightNumber(sudoku, row, col, i)) {
					sudoku[row][col] = i;
					check[row][col] = true;
					if(col == 8) {
						solve(sudoku, row + 1, 0, check);
					} else {
						solve(sudoku, row, col + 1, check);
					}
					check[row][col] = false;
					sudoku[row][col] = 0;
				}
			}
		}
	}
	
	private static boolean isRightNumber(int[][] sudoku, int row, int col, int n) {
		//System.out.println("[" + row + "][" + col + "]: " + n);
		for(int i = 0; i < 9; i++) {
			
			/* 가로 체크 */
			if(sudoku[row][i] == n) 
				return false;
			
			/* 세로 체크 */
			if(sudoku[i][col] == n) 
				return false;
		}
		
		/* 소박스 체크 */
		for(int j = (col/3)*3; j < (col/3)*3 + 3; j++) {
			for(int k = (row/3)*3; k < (row/3)*3 + 3; k++) {
				if(sudoku[k][j] == n) 
					return false;
			}
		}
		return true;
	}
	
	private static void printSudoku(int[][] sudoku) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j ++) {
				bw.write(sudoku[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
