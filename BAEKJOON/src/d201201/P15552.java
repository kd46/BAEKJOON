package d201201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P15552 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < t; i++) {
				String[] arr = br.readLine().split(" ");
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[1]);
				bw.write(a + b + "\n");
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}