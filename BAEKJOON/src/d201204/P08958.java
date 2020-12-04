package d201204;

import java.io.*;

public class P08958 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				String[] quizResult = br.readLine().split("");
				int sum = 0;
				int score = 0;
				for(int j = 0; j < quizResult.length; j++) {
					if(quizResult[j].equals("O")) {
						sum += ++score;
					}
					else {
						score = 0;
					}
				}
				bw.write(sum + "\n");
			}
						
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
