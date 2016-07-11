package dart_game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] scores = { 20, 1, 18, 4, 13, 6, 10, 15, 2, 17, 3, 19, 7, 16, 8, 11, 14, 9, 12, 5 };

		int TC;
		int test_case;

		TC = sc.nextInt();
		for (test_case = 1; test_case <= TC; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();

			int count = sc.nextInt();
			int score = 0;
			for (int i = 0; i < count; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();

				double r = Math.sqrt(x * x + y * y);
				if (r < a) {
					score += 50;
					continue;
				}
				if (r > e)
					continue;

				int dt = 1;
				if (r > b && r < c)
					dt = 3;
				if (r > d && r < e)
					dt = 2;
				double deg = Math.atan2(x, y) * 180 / Math.PI - 90;
				if (deg < 0)
					deg += 360;
				int n = (int) ((deg - 9) / 18);
				score += dt * scores[n];

			}
			System.out.println("Case #" + test_case);
			System.out.println(score);
		}
	}
}
