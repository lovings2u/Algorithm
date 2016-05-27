import java.util.Scanner;

public class EvenOdd {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(distinguish(a) + "+" + distinguish(b) + "=" + distinguish(a+b));
		System.out.println(distinguish(a) + "*" + distinguish(b) + "=" + distinguish(a*b));			 
	}	
	
	public static String distinguish(int x) {
		if (x % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	} 
}
