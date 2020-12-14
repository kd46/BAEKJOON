package d201214;

/*
 * 1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W
 * 
 * 호실: 몇바퀴째 손님인가
 * 층수: 해당 바퀴 몇번째 손님인가
 */

import java.io.*;

public class P10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String[] str = br.readLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int n = Integer.parseInt(str[2]);
			
			int floor = n % h;
			int room = n / h + 1;
			
			/* 맨 윗층 예외 처리 */
			if(floor == 0) {
				floor = h;
				room--;
			}
			
			System.out.print(floor);
			System.out.printf("%02d\n", room);
		}
		br.close();
	}
}
