package d201206;

import java.io.*;

public class P02941 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String[] str = br.readLine().split("");
			int num = str.length;
			
			//목록 내에 있는 크로아티아 알파벳을 몇개 포함하는지
			for(int i = 1; i < str.length; i++) {
				if(str[i].equals("=")) { //c=, s=, z=, dz=
					if(str[i-1].equals("z")) {
												
						
						if(i > 1 && str[i-2].equals("d")) { //dz=
							num -= 2;
						} else { //z=
							num--;
						}
						
						
					} else if(str[i-1].equals("c") || str[i-1].equals("s")) { //c=, s=
						num--;
					} 
				} else if(str[i].equals("-")) { //c-, d-
					if(str[i-1].equals("c") || str[i-1].equals("d")) {
						num--;
					}
				} else if(str[i].equals("j")) { //lj, nj
					if(str[i-1].equals("l") || str[i-1].equals("n")) {
						num--;
					}					
				}
			}
			
			bw.write(num + "\n");
						
			br.close();
			bw.flush();
			bw.close();
		} catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
