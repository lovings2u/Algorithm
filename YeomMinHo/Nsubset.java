import java.util.Scanner;

public class Nsubset {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n,m;
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		System.out.println((long)Math.pow(m,n));
	}
}
