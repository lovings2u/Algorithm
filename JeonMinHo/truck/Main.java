package truck;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > 168 && b > 168 && c > 168)
			System.out.println("NO CRASH");
		if(a <= 168)
			System.out.println("CRASH " + a);
		else if(b <= 168)
			System.out.println("CRASH " + b);
		else if(c <= 168)
			System.out.println("CRASH " + c);
	}
}
