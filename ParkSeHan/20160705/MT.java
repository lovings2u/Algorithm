package com.hybrid.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class mtgame2 {
	static int a, b, c;
	static int N, K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> list = new ArrayList<Character>();
		int T;
		int test_case;

		T = sc.nextInt();        
		for(test_case = 1; test_case <= T; test_case++) {
			a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
			for (int i = 0; i < c; i++) {
				N = sc.nextInt(); K = sc.nextInt();
				boolean ret = false;
				for (int j = 1; j <= b; j++)
					for (int k = a + b*K ; k <= a*K + b; k++) { // a가 운용 가능한 범위 : a+b*K ~ a*K+b
						int tmp = (N - j) % k;
						if (a <= tmp && tmp <= a*K) {ret = true; break;}
					}
				char ans = ret ? 'a' : 'b';
				list.add(ans);
			}
			System.out.println("Case #" + (test_case));
			list.forEach(System.out :: print);
		}
	}
}
