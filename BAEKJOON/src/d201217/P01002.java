package d201217;

import java.io.*;

public class P01002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" ");
			int[] pos = new int[str.length];
			for(int j = 0; j < str.length; j++) {
				pos[j] = Integer.parseInt(str[j]);
			}
			
			System.out.println(posRyu(pos));
		}
		
		br.close();
	}
	
	private static int posRyu (int[] pos) {
		
		/*  0   1   2   3   4   5   */
		/* (x1, y1, r1, x2, y2, r2) */
		
		double distance = getDistance(pos[0], pos[1], pos[3], pos[4]);
		
		/* 더 작은 반경이 r1 */
		double r1 = pos[2];
		double r2 = pos[5];
		if(r1 > r2) {
			r1 = pos[5];
			r2 = pos[2];
		}		
		
		/* 원의 중심이 같을 경우 */
		if(distance == 0) {
			if(r1 == r2) return -1;
			else return 0;
		}
		
		/* 원의 중심이 다를 경우 */
		if(distance > r1 + r2) {
			/*원이 접하지 않는 경우*/
			return 0;
		} else if(distance == r1 + r2) {
			/*원이 외접하는 경우*/
			return 1;
		} else if(distance + r1 == r2) {
			/*원이 내접하는 경우*/
			return 1;
		} else if(distance + r1 < r2) {
			/*큰 원이 작은 원을 포함하되 접하지 않는 경우*/
			return 0;
		} else {
			return 2;
		}	
	}
	
	private static double getDistance(int x1, int y1, int x2, int y2) {
		double x = Math.abs(x1-x2);
		double y = Math.abs(y1-y2);
		return Math.sqrt(x*x + y*y);
	}
}
