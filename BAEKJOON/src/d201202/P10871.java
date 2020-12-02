package d201202;

import java.io.*;

public class P10871 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] nx = br.readLine().split(" ");
			int n = Integer.parseInt(nx[0]);
			int x = Integer.parseInt(nx[1]);
			
			String[] a = br.readLine().split(" ");
			for(int i = 0; i < n; i++) {
				int temp = Integer.parseInt(a[i]);
				if(temp < x) {
					bw.write(temp + " ");
				}
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
/*
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
10 5
1 10 4 9 2 3 8 5 7 6
*/