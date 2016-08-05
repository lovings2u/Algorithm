package vendingmachine;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coin = {500, 100, 50, 10, 5, 1};
		int w = sc.nextInt();
		int[] count = new int[coin.length];
		int max = 0;
		for(int i = 0; i < count.length; i++) {
			count[i] = sc.nextInt();
			max += count[i] * coin[i];
		}
		int total = max - w;
		int result = 0;
		int[] resultR = new int[coin.length];
		for(int i = 0; i < coin.length; i++) {
			if(total / coin[i] <= count[i]){
				resultR[i] = total / coin[i];
				count[i] -= resultR[i];
				total -= coin[i] * resultR[i];
				result += count[i];
			}
		}
		System.out.println(result);
		for(int r : count ) {
			System.out.print(r + " ");
		}
	}
}
