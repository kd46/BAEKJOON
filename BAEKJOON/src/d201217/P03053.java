package d201217;

import java.io.*;

public class P03053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int r = Integer.parseInt(br.readLine());
		double euclid = Math.PI * r * r;
		
		System.out.printf("%.6f\n", euclid);
		System.out.printf("%.6f\n", getTaxi(r));
		
		br.close();
	}
	
	public static double getTaxi(int r) {
		
		/* |x1-x2| + |y1-y2|
		 * (x1, y1) = (0, 0) 이라 할 때
		 * x2, -x2, y2, -y2를 꼭지점으로 하는 마름모의 넓이
		 * 즉 4*x2*y2
		 * x2 = y2 = r이므로
		 * S = 2*r*r
		 */
		
		return 2.0*r*r;
	}
}
