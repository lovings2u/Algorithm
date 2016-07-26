package bigbrother;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] r1 = { sc.nextDouble(), sc.nextDouble() };
		double[] r2 = { sc.nextDouble(), sc.nextDouble() };

		double k = sc.nextDouble() / 3.141;

		int except = 0;

		double[][] person = new double[n][2];
		double[] distanceR1 = new double[n];
		double[] distanceR2 = new double[n];
		double maximum = 0;
		boolean aOrb = true; // true = a, false = b
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			// 절대 포함 할 수 없는 점 제외하기
			if (getDistance(x, r1[0], y, r1[1]) >= Math.sqrt(k) && getDistance(x, r2[0], y, r2[1]) >= Math.sqrt(k)) {
				except++;
				continue;
			}
			distanceR1[i] = getDistance(x, r1[0], y, r1[1]);
			distanceR2[i] = getDistance(x, r1[0], y, r1[1]);
		}

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int minimum = 5000;
		for (int i = 0; i < n; i++) {
			double temp = 0;
			temp = Math.sqrt(k - Math.pow(distanceR1[i], 2));
			for (int j = 0; j < n; j++) {
				if (distanceR1[j] > distanceR1[i])
					list1.add(j);
				if (distanceR2[j] > temp)
					list2.add(j);
			}
			minimum = Math.min(list1.size() + list2.size(), minimum);
		}
		System.out.println(minimum + except);

	}

	private static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
	}
}
