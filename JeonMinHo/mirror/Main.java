package mirror;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		TC = sc.nextInt();
		for (test_case = 1; test_case <= TC; test_case++) {
			int size = sc.nextInt();
			int[][] room = new int[size][size];
			sc.skip("\\r\\n");
			for (int i = 0; i < size; i++) {
				String line = sc.nextLine();
				String[] input = line.split("");
				for (int j = 0; j < size; j++) {
					room[i][j] = Integer.parseInt(input[j]);
				}
			}
			
			int hor = 0, ver = 0, direction = 0;
			HashSet<Integer> count = new HashSet<>();
			while ((hor >= 0 && ver >= 0) && (hor < size && ver < size)) {
				switch (room[ver][hor]) {
				case 0:
					if (direction == 0) {
						hor++;
					} else if (direction == 1) {
						ver++;
					} else if (direction == 2) {
						hor--;
					} else if (direction == 3) {
						ver--;
					}
					break;
				case 1:
					count.add(ver * size + hor);
					if (direction == 0) {
						ver--;
						direction = 3;
					} else if (direction == 1) {
						hor--;
						direction = 2;
					} else if (direction == 2) {
						ver++;
						direction = 1;
					} else if (direction == 3) {
						hor++;
						direction = 0;
					}
					break;
				case 2:
					count.add(ver * size + hor);
					if (direction == 0) {
						ver++;
						direction = 1;
					} else if (direction == 1) {
						hor++;
						direction = 0;
					} else if (direction == 2) {
						ver--;
						direction = 3;
					} else if (direction == 3) {
						hor--;
						direction = 2;
					}
					break;
				}
			}
			System.out.println("Case #" + test_case);
			System.out.println(count.size());
		}
	}

}
