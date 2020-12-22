package d201222;

import java.io.*;
public class P14888 {
	public static int opCnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str1 = br.readLine().split(" ");
		String[] str2 = br.readLine().split(" ");
		
		int[] arr = new int[n];
		int[] operator = new int[n - 1];
		
		fillArr(arr, str1, operator, str2);
		
		solve(arr, operator);		
	}
	
	/* 연산자 n -1개  */
	/* n-1개 중 n-1개를 차례대로 뽑는다 */
	/* 뽑힌 연산자로 계산해서 max, min을 정한다 */
	
	private static void solve(int[] arr, int[] operator) {
		int[] ops = new int[factorial(operator.length) * operator.length];
		int[] temp = new int[operator.length];
		boolean[] check = new boolean[operator.length];
		getOperator(ops, temp, operator, check, 0);
		
		int[] mm = getMaxMin(arr, ops);
		System.out.println(mm[0]);
		System.out.println(mm[1]);
	}

	private static int[] getMaxMin(int[] arr, int[] ops) {
		int[] result = new int[factorial(arr.length - 1)];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = getResult(arr, ops, i * (arr.length - 1));
		}
		
		int[] mm = {result[0], result[0]};
		
		for(int i = 1; i < result.length; i++) {
			if(result[i] > mm[0]) mm[0] = result[i];
			if(result[i] < mm[1]) mm[1] = result[i];
		}
		
		return mm;
	}
	
	private static int getResult(int[] arr, int[] ops, int offset) {
		int calc = arr[0];
		
		for(int i = offset; i < offset + arr.length - 1; i++) {
			calc = calcAB(calc, arr[i - offset + 1], ops[i]);
		}
		
		return calc;
	}
	
	private static void getOperator(int[] ops, int[] arr, int[] operator, boolean[] check, int cnt) {
		if(cnt == operator.length) {
			for(int i = 0; i < operator.length; i++) {
				ops[opCnt++] = arr[i];
			}
			return;
		}
		
		for(int i = 0; i < operator.length; i++) {
			if(!check[i]) {
				check[i] = true;
				arr[cnt] = operator[i];
				getOperator(ops, arr, operator, check, cnt + 1);
				check[i] = false;
			}
		}
	}
			
	private static int calcAB(int a, int b, int operator) {
		switch(operator) {
		case 0: 
			return a + b;
		case 1:
			return a - b;
		case 2:
			return a * b;
		case 3:
			return a / b;
		}
		return 0;
	}
	
	private static void fillArr(int[] arr, String[] str1, int[] operator, String[] str2) {
		for(int i = 0; i < str1.length; i++) {
			arr[i] = Integer.parseInt(str1[i]);
		}
		
		int cnt = 0;		
		/* 덧셈 */
		for(int i = 0; i < Integer.parseInt(str2[0]); i++) {
			operator[cnt++] = 0;
		}
		
		/* 뺄셈 */
		for(int i = 0; i < Integer.parseInt(str2[1]); i++) {
			operator[cnt++] = 1;
		}
		
		/* 곱셈 */
		for(int i = 0; i < Integer.parseInt(str2[2]); i++) {
			operator[cnt++] = 2;
		}
		
		/* 나눗셈 */
		for(int i = 0; i < Integer.parseInt(str2[3]); i++) {
			operator[cnt++] = 3;
		}
		
	}
	
	private static int factorial(int n) {
		if(n < 2) return 1;
		else return n * factorial(n - 1);
	}
}
