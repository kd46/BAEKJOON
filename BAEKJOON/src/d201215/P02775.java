package d201215;

/*
 * 1 <= k <= 14, 1 <= n <= 14
 * 
 * @ 0층의 i호에는 i명이 산다.
 * @ a층 b호 인원 = (a-1)층의 1~b호까지의 인원의 합
 * 
 * 0층	1	2	3	4	5	... a0n = n
 * 1층	1	3	6	10	15	...	a1n = n(n+1) / 2
 * 2층	1	4	10	20	35	...
 */

import java.io.*;

public class P02775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) {
			int floor = Integer.parseInt(br.readLine());
			int room = Integer.parseInt(br.readLine());
			
			System.out.println(p02775(floor, room));
		}
		br.close();
	}
	
	public static int p02775(int floor, int room) {		
		
		if(floor == 0 || room == 1) {		//1층 또는 1호
			return room;
		} else if(floor == 1) {				//1층
			return (room * (room + 1)) / 2;
		} else if(room == 2) {				//2호
			return floor + room;
		}
		/* 이후로는 2층이상, 2호이상임 */
		
		/* room보다 1개 더 생성해서 index를 알기 쉽게 함 */
		Integer[][] member = new Integer[floor + 1][room + 1];
		
		/* 0층의 i호에는 i 명이 산다 */
		/* 1층의 i호에는 i*(i+1)/2 명이 산다 */
		for(int i = 0; i <= room; i++) {
			member[0][i] = i;
			member[1][i] = (i * (i + 1)) / 2; 
		}
		
		/* 1호에는 1명이 산다 */
		for(int i = 1; i <= floor; i++) {
			member[i][0] = 0;
			member[i][1] = 1;
		}
				
		for(int i = 2; i <= floor; i++) {
			for(int j = 2; j <= room; j++) {
				member[i][j] = member[i-1][j] + member[i][j-1];
			}
		}
		
		
		return member[floor][room];
	}
}
