package log;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int bottom = bottom(total);
		int top = top(total, bottom);
		System.out.println(bottom + " " + top);
		
	}
	
	static int bottom(int total) {
		int bottom = 0;
		while(total > 0) {
			total -= bottom;
			bottom ++;
		}
		return bottom-1;
	}
	static int top(int total, int bottom) {
		int top = total;
		for(int i = bottom; i < top; i--) {
			top -= i;
		}
		return top;
	}
}
