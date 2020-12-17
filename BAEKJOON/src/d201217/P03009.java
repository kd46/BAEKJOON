package d201217;

import java.io.*;

public class P03009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] pos = new int[4][2];
		
		for(int i = 0; i < 3; i++) {
			String[] str = br.readLine().split(" ");
			pos[i][0] = Integer.parseInt(str[0]);
			pos[i][1] = Integer.parseInt(str[1]);
		}
		
		getFourthPos(pos);
		
		System.out.println(pos[3][0] + " " + pos[3][1]);
		
		br.close();
	}
	
	private static void getFourthPos(int[][] pos) {
		
		/* x */
		if(pos[0][0] == pos[1][0]) {
			pos[3][0] = pos[2][0];
		} else if(pos[1][0] == pos[2][0]) {
			pos[3][0] = pos[0][0];
		} else {
			pos[3][0] = pos[1][0];
		}
		
		/* y */
		if(pos[0][1] == pos[1][1]) {
			pos[3][1] = pos[2][1];
		} else if(pos[1][1] == pos[2][1]) {
			pos[3][1] = pos[0][1];
		} else {
			pos[3][1] = pos[1][1];
		}
	}
}
