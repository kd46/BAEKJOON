package d201204;

import java.io.*;
import java.util.ArrayList;

public class P04344 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int c = Integer.parseInt(br.readLine());
			
			
			for(int i = 0; i < c; i++) {
				String[] str = br.readLine().split(" ");
				int n = Integer.parseInt(str[0]);
				int sumOfScore = 0;
				int overAvgNum = 0;
				double overAvgRate = 0.0;
				
				ArrayList<Integer> scoreList = new ArrayList<Integer>();
				for(int j = 1; j < str.length; j++) {
					scoreList.add(Integer.parseInt(str[j]));
					sumOfScore += scoreList.get(j-1);
				}
				
				for(int k = 0; k < scoreList.size(); k++) {
					if(scoreList.get(k) * n > sumOfScore) {
						overAvgNum++;
					}
				}
				overAvgRate = (overAvgNum * 100.0) / (double)n;
				bw.write(String.format("%.3f%%\n", overAvgRate));
				//System.out.println(String.format("%.3f%%", overAvgRate));
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
