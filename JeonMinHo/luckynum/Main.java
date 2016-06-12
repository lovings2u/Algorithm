package luckynum;

import java.util.Scanner;

public class Main {
	private static int[] position = {0,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		findWhere(count);
		
		//System.out.println(position[0] + " "  + position[1]);
		String suffix = Integer.toBinaryString(position[1]);
		String prefix = "";
		StringBuffer resultMaker = new StringBuffer();
		for(int i = 0; i < position[0]-suffix.length(); i ++) {
			resultMaker.append("0");
		}
		resultMaker.append(suffix);
		
		char[] result = resultMaker.toString().toCharArray();
		
		for (char c : result) {
			if(c == '0')
				System.out.print(4);
			else
				System.out.print(7);
		}
		
	}
	
	private static void findWhere(int count) {
		//주어진 숫자의 위치 구하는 method
		int sum = 0;
		int detail = 0;
		for(int i = 1; i < 64; i++) {
			sum += Math.pow(2, i);
			detail += Math.pow(2, i-1);
			if(count <= sum){
				position[0] = i;
				position[1] = count - detail;
				break;
			}
			
		}
	}
}
