package toilet.java;

import java.util.Scanner;

public class toilet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = (int)Math.ceil(a/2.0);
		int c = (int)Math.ceil(a/3.0);
		
		System.out.println(b,c);

	}

}
