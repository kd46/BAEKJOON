package d201217;

import java.io.*;

public class P04153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		while(!str[0].equals("0")) {
			if(isRightTriangle(Integer.parseInt(str[0]), 
							Integer.parseInt(str[1]), 
							Integer.parseInt(str[2]))) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
			str = br.readLine().split(" ");
		}
		
		br.close();
	}
	
	private static boolean isRightTriangle(int a, int b, int c) {
		
		/* a, b, c가 각각 빗변일 경우를 모두 고려해야 함 */
		if(a*a == b*b + c*c) return true;
		if(b*b == c*c + a*a) return true;
		if(c*c == a*a + b*b) return true;
		
		return false;
	}
}
