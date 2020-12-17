package d201217;

import java.io.*;

public class P09020 {
	public static void main(String[] args)  throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			int[] GoldbachPartition = getGoldbachPartition(Integer.parseInt(br.readLine()));
			System.out.println(GoldbachPartition[0] + " " + GoldbachPartition[1]);
		}
		
		br.close();
	}
	
	private static int[] getGoldbachPartition(int n)  {
		int[] a = {0, 0};
		
		/* n의 골드바흐 파티션인 두 소수가 있을 때, 
		 * 둘 중 한 수는 반드시 n/2 보다 작거나 같다 
		 * 따라서 n/2부터 시작해 내려가자
		 */

		for(int i = n/2; i > 1; i--) {
			if(isPrime(i) == true && isPrime(n-i) == true) {
				a[0] = i;
				a[1] = n - i;
				return a;
			}
		}
		return a;
	}
	
	private static boolean isPrime(int n)  {
		if(n == 1) return false;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}		
		return true;
	}
}
