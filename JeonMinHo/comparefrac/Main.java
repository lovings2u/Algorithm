package comparefrac;

import java.util.Scanner;

public class Main {
	static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	public static void main(String[] args) {
		int a = sc.nextInt();
		double b = sc.nextInt();
		int c = sc.nextInt();
		double d = sc.nextInt();
		
		if(a/b == c/d) 
			System.out.println(0);
		else if(a/b > c/d)
			System.out.println(1);
		else
			System.out.println(-1);
	}

}
