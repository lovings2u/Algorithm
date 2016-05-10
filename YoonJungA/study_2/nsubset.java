package level1_2;

import java.util.Scanner;

public class nsubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.println((long)Math.pow(m, n));
		
	}

}
