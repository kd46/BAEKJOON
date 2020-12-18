package d201218;

import java.io.*;
public class P01018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int height = Integer.parseInt(str[0]);
		int width = Integer.parseInt(str[1]);
		
		String[][] map = new String[height][width];
		for(int i = 0; i < height; i++) {
			String[] temp = br.readLine().split("");
			for(int j = 0; j < width; j++) {
				map[i][j] = temp[j];
			}
		}
		
		System.out.println(rePaintCount(map, height, width));
		
		br.close();
	}
	
	private static int rePaintCount(String[][] map, int height, int width) {
		int cnt = 8 * 8;
		
		for(int i = 0; i < height - 8 + 1; i++) {
			for(int j = 0; j < width - 8 + 1; j++) {
				int black = rePaintBlack(map, i, j);
				int white = rePaintWhite(map, i, j);
				if(black < cnt) cnt = black;
				if(white < cnt) cnt = white;
			}
		}
		
		return cnt;
	}
	
	private static int rePaintBlack(String[][] map, int height, int width) {
		int rePaint = 0;
		
		for(int i = height; i < height + 8; i++) {
			for(int j = width; j < width + 8; j++) {
				if(i % 2 == 0) {	//짝수행
					if(j % 2 == 0) {	//짝수열
						if(!map[i][j].equals("B")) rePaint++;
					} else {	//홀수열
						if(!map[i][j].equals("W")) rePaint++;
					}
				} else {	//홀수행
					if(j % 2 == 0) {	//짝수열
						if(!map[i][j].equals("W")) rePaint++;
					} else {	//홀수열
						if(!map[i][j].equals("B")) rePaint++;
					}
				}
			}
		}
		
		return rePaint;
	}
	
	private static int rePaintWhite(String[][] map, int height, int width) {
		int rePaint = 0;
		
		for(int i = height; i < height + 8; i++) {
			for(int j = width; j < width + 8; j++) {
				if(i % 2 == 0) {	//짝수행
					if(j % 2 == 0) {	//짝수열
						if(!map[i][j].equals("W")) rePaint++;
					} else {	//홀수열
						if(!map[i][j].equals("B")) rePaint++;
					}
				} else {	//홀수행
					if(j % 2 == 0) {	//짝수열
						if(!map[i][j].equals("B")) rePaint++;
					} else {	//홀수열
						if(!map[i][j].equals("W")) rePaint++;
					}
				}
			}
		}
		
		return rePaint;
	}
}
