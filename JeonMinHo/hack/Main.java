package hack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a + c == b)
			System.out.println("does not matter");
		else if(a + c < b)
			System.out.println("advertise");
		else
			System.out.println("do not advertise");
	}
}
