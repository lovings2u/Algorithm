import java.util.Scanner;

public class FourNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int A = 0, B = 0, C = 0, D = 0;
		String temp1 = "", temp2 = "";
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		temp1 = Integer.toString(A) + Integer.toString(B);
		temp2 = Integer.toString(C) + Integer.toString(D);
		
		System.out.println(Integer.parseInt(temp1) + Integer.parseInt(temp2));
	}
}

// String -> int 변환  : Integer.parseInt
// int -> String 변환  : Integer.toString
