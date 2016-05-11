package vauvau;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ab = a+b;
		int c = sc.nextInt();
		int d = sc.nextInt();
		int cd = c+d;
		int p = sc.nextInt();
		int m = sc.nextInt();
		int g = sc.nextInt();
		
		int p1 = p%ab;
		int p2 = p%cd;
		int m1 = m%ab;
		int m2 = m%cd;
		int g1 = g%ab;
		int g2 = g%cd;
		
		StringBuffer result = new StringBuffer();
		
		if(p1<=a && p2<=c){
			result.append("both\n");
		} else if (p1<=a && p2>c) {
			result.append("one\n");
		} else if (p1 >a && p2<=c) {
			result.append("one\n");
		} else {
			result.append("none\n");
		}
		
		if(m1<=a && m2<=c){
			result.append("both\n");
		} else if (m1<=a && m2>c) {
			result.append("one\n");
		} else if (m1 >a && m2<=c) {
			result.append("one\n");
		} else {
			result.append("none\n");
		}
		
		if(g1<=a && g2<=c){
			result.append("both\n");
		} else if (g1<=a && g2>c) {
			result.append("one\n");
		} else if (g1 >a && g2<=c) {
			result.append("one\n");
		} else {
			result.append("none\n");
		}
		
		System.out.println(result);
	}
}
