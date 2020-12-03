package d201203;

import java.util.Scanner;
import java.util.ArrayList;

public class P01546 {
	public static void main(String[] args) {
		final int MAX_SCORE = 100;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		double avg = 0.0;
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int score = sc.nextInt();
			avg += score;
			if(max < score) {
				max = score;
			}
		}
		
		System.out.println(((avg / max) * 100) / n);
		
		sc.close();
	}
}
