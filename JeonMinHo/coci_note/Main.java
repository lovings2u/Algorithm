package coci_note;

import java.util.Scanner;

public class Main {
	static String a = "1 2 3 4 5 6 7 8";
	static String d = "8 7 6 5 4 3 2 1";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		
		if(i.equals(a))
			System.out.println("ascending");
		else if(i.equals(d))
			System.out.println("descending");
		else
			System.out.println("mixed");
	}
}
