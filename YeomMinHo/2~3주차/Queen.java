import java.util.Scanner;

public class Queen {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long N,M;
		
		N = sc.nextLong();
		M = sc.nextLong();
		
		System.out.println(Math.min(N,M));
	}
}