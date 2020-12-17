package d201217;

import java.io.*;

public class P02447 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		char[][] star = new char[n][n];
		
		/* 배열 초기화 */
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				star[i][j] = 32;
			}
		}
		
		buildStar(star, 0, 0, n);
		
		/* 배열 출력 */
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				bw.write(star[i][j]);
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();		
		br.close();
	}
	
	private static void buildStar(char[][] star, int x, int y, int n) {
		
		if(n == 1) {
			star[x][y] = '*';
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) {
					star[i][j] = 32;
				} else {
					buildStar(star, x + (i* (n/3)), y + (j*(n/3)), n/3);
				}
			}
		}
	}	
}
