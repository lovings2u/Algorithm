package fuse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(getResult(a,b,c) + " amperes");
		
	}
	
	static int getResult(int input1, int input2, int input3) {
		double fuse = ((input1*2.5) + (input2*2.0) + (input3*0.5)) * 2;
		return (int) Math.ceil(fuse/10.0)*10;
	}
}
