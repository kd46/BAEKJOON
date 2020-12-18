package d201218;

import java.io.*;
public class P07568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] member = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			String[] str = br.readLine().split(" ");
			member[i][0] = Integer.parseInt(str[0]);
			member[i][1] = Integer.parseInt(str[1]);
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(getRank(member, i) + " ");
		}		
		
		br.close();
	}
	
	private static int getRank(int[][] member, int x) {
		int rank = 1;
		for(int i = 0; i < member.length; i++) {
			if(member[i][0] > member[x][0]
				&& member[i][1] > member[x][1]) {
				rank++;
			}
		}		
		return rank;
	}
}
