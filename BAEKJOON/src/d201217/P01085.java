package d201217;

/*			(w,h)
 * 		(x,y)
 * (0,0)
 * 
 * 1 ≤ w, h ≤ 1,000
 * 1 ≤ x ≤ w-1
 * 1 ≤ y ≤ h-1
 * x, y, w, h는 정수
 */

import java.io.*;

public class P01085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int w = Integer.parseInt(str[2]);
		int h = Integer.parseInt(str[3]);
		
		System.out.println(getMinBorderDistance(x, y, w, h));
		
		br.close();
	}
	
	private static int getMinBorderDistance(int x, int y, int w, int h) {
		
		int minDistance = x;
		
		if(y < minDistance) {
			minDistance = y;
		} 
		if (w - x < minDistance) {
			minDistance = w - x;
		} 
		if (h - y < minDistance) {
			minDistance = h - y;
		}		
		
		return minDistance;
	}
}
