package clo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double result = Math.round(((60*t)/11.0)*1000000)/1000000.0;
		String r = "0.000000";
		if(t == 11){
			r = "CAN'T SEE!";
		} else if( t < 11){
			System.out.println(result);
			return;
		}
		System.out.println(r);
	}
}
