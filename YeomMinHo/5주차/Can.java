import java.util.Scanner;

public class Can {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int white, black;

		black = sc.nextInt();
		white = sc.nextInt();
		
		if (black % 2 == 1 && white % 2 == 1 || black % 2 == 0 && white % 2 == 1) {
			System.out.println("white");
		} else {
			System.out.println("black");
		}
	}
}
