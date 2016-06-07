package dfreq;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number = sc.nextDouble();
		int index = sc.nextInt();
		
		int count = 0;
		
		for(int i = 1; i < number; i*=10){
			if(number % (i*10) >= index) {
				count += Math.ceil(number/(i*10)) * i;
			} else {
				count += Math.floor(number/(i*10)) * i;
			}
		}
		System.out.println(count);
	}
}
