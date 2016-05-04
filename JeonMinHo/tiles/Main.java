package tiles;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (int)Math.ceil(a/8.0);
		int d = (int)Math.ceil(b/8.0);
		int e = (int)a/8;
		int f = (int)b/8;
		System.out.println(c + " " + d + " " + e + " " + f);
		System.out.printf("The number of whole tiles is %d part tiles is %d", e*f, (c*d)-(e*f));
	}
}
