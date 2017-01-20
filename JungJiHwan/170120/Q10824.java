package Backjoon1;

import java.util.Scanner;

public class Q10824 {
	public static void main(String[] args) {
		new Q10824();
	}
	
	public Q10824() {
		Scanner sc = new Scanner(System.in);
		System.out.println(numSummer(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}
	
	public long numSummer(int num1, int num2, int num3, int num4){
		String str1 = String.valueOf(num1);
		String str2 = String.valueOf(num2);
		String str3 = String.valueOf(num3);
		String str4 = String.valueOf(num4);
		return Long.valueOf(str1 + str2) + Long.valueOf(str3 + str4);
	}
}