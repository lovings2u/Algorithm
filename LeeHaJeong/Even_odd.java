import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		int n = kbd.nextInt();
		int m = kbd.nextInt();
		
		System.out.print((n%2)==0?"even":"odd");
		System.out.print("+");
		System.out.print((m%2)==0?"even":"odd");
		System.out.print("=");
		System.out.println(((n+m)%2)==0?"even":"odd");
		
		System.out.print((n%2)==0?"even":"odd");
		System.out.print("*");
		System.out.print((m%2)==0?"even":"odd");
		System.out.print("=");
		System.out.println(((n*m)%2)==0?"even":"odd");

	}

}
