package midp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int oo = 0;
		int oe = 0;
		int eo = 0;
		int ee = 0;
		for(int i = 0; i < index; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(odd(a) && odd(b)) 
				oo++;
			else if(odd(a) && even(b))
				oe++;
			else if(even(a) && odd(b))
				eo++;
			else
				ee++;
		}
		int result = (oo*(oo-1)) + (oe*(oe-1)) + (eo*(eo-1)) + (ee*(ee-1));
		System.out.println(result/2);
	}
	
	private static boolean odd(int a){
		return a%2 == 1;
	}
	private static boolean even(int a) {
		return a%2 == 0;
	}
}
