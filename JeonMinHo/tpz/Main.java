package tpz;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int t = sc.nextInt();
		int p = sc.nextInt();
		int z = sc.nextInt();
		
		int max = Math.min(t, Math.min(p, z));
		int min = total - ((total-t) + (total-p) + (total-z));
		if(min < 0)
			min = 0;
		System.out.println(max + " " + min);
	}
}
