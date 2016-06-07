package ctu_stock;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count = sc.nextLong(), preNum = 40001,
			now = 0, upCount = 0, maxProfit = 0, 
			startPrice = 0, endPrice = 0, buying = 0;
		
		long money = sc.nextLong();
		for(long i = 0; i < count; i++) {
			now = sc.nextLong();
			if(now > preNum) {
				endPrice = now;
			} else {
				startPrice = now;
				endPrice = 0;
			}
			preNum = now;
			buying = money/startPrice;
			upCount = buying * endPrice - buying * startPrice;
			maxProfit = Math.max(upCount, maxProfit);
		}
		System.out.println(maxProfit);
	}
}
