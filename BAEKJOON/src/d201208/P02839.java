package d201208;

/*
 * N킬로그램을 정확히 배달할 것
 * 3킬로그램 봉지와 5킬로그램 봉지가 있다
 * 배달하는 봉지 개수 출력
 * 정확히 떨어지지 않을 경우 -1 출력
 * 3 <= n <= 5000
 */

import java.io.*;

public class P02839 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
						
			int sugarSack = -1;
			int n = Integer.parseInt(br.readLine());
			
			//더 적은 봉지를 배달
			//= 최대한 많은 5킬로그램 봉지를 배달
			//= 최대한 적은 3킬로그램 봉지를 배달
			for(int i = 0; i <= n/3; i++) {
				int k3 = i * 3; //3킬로그램 포대의 킬로그램
				int k5 = n - k3; //5킬로그램 포대의 킬로그램
				if(k5 != 0 && k5 % 5 == 0) {
					sugarSack = k3 / 3 + k5 / 5;
					break;
				} else if(k3 == n) {
					sugarSack = k3 / 3;
				}
			}
			
			bw.write(sugarSack + "\n");
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
