package sdoku;

import java.util.Arrays;
import java.util.Scanner;

public class Sdoku {

	static int[][] input;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		input = new int[9][9];
		int[][] tempInput = new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				input[j][i] = sc.nextInt();
			}
		}

		Sdoku s = new Sdoku();

		while (true) {
			tempInput = s.arrayClone(tempInput);

			s.rowCheck();
			s.columnCheck();
			s.squareCheck();

			if (s.arrayCompare(tempInput) == true) {
				break;
			}
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(input[j][i] + " ");
			}
			System.out.println("");
		}
	}

	public void rowCheck() {
		String type = "row";
		int count;
		for (int i = 0; i < 9; i++) {
			count = 0;
			for (int j = 0; j < 9; j++) {
				if (input[j][i] == 0) {
					count++;
				}
			}
			if (count == 1) {
				change(type, i, 0, 0);
			}
		}
	}

	public void columnCheck() {
		String type = "column";
		int count;
		for (int i = 0; i < 9; i++) {
			count = 0;
			for (int j = 0; j < 9; j++) {
				if (input[i][j] == 0) {
					count++;
				}
			}
			if (count == 1) {
				change(type, i, 0, 0);
			}
		}
	}

	public void squareCheck() {
		String type = "square";
		int count;

		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				count = 0;

				for (int i = row * 3; i < row * 3 + 3; i++) {
					for (int j = column * 3; j < column * 3 + 3; j++) {
						if (input[i][j] == 0) {
							count++;
						}
					}
				}

				if (count == 1) {
					change(type, 0, row, column);
				}
			}
		}

	}

	public void change(String type, int i, int rowM, int columnM) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		switch (type) {
		case "row":
			for (int j = 0; j < 9; j++) {
				for (int x = 0; x < arr.length; x++) {
					if (input[j][i] == arr[x]) {
						arr[x] = 0;
					}
				}
			}

			for (int j = 0; j < 9; j++) {
				if (input[j][i] == 0) {
					for (int x = 0; x < arr.length; x++) {
						if (arr[x] != 0) {
							input[j][i] = arr[x];
						}
					}
				}
			}

		case "column":
			for (int j = 0; j < 9; j++) {
				for (int x = 0; x < arr.length; x++) {
					if (input[i][j] == arr[x]) {
						arr[x] = 0;
					}
				}
			}

			for (int j = 0; j < 9; j++) {
				if (input[i][j] == 0) {
					for (int x = 0; x < arr.length; x++) {
						if (arr[x] != 0) {
							input[i][j] = arr[x];
						}
					}
				}
			}

		case "square":
			for (int n = rowM * 3; n < rowM * 3 + 3; n++) {
				for (int m = columnM * 3; m < columnM * 3 + 3; m++) {
					for (int x = 0; x < arr.length; x++) {
						if (input[n][m] == arr[x]) {
							arr[x] = 0;
						}
					}
				}
			}

			for (int n = rowM * 3; n < rowM * 3 + 3; n++) {
				for (int m = columnM * 3; m < columnM * 3 + 3; m++) {
					if (input[n][m] == 0) {
						for (int x = 0; x < arr.length; x++) {
							if (arr[x] != 0) {
								input[n][m] = arr[x];
							}
						}
					}
				}
			}

		default:
			break;

		}
	}
	
	public int[][] arrayClone (int[][] tempInput) {
		for (int i=0 ; i<9 ; i++) {
			for (int j=0 ; j<9 ; j++) {
				tempInput[j][i] = input[j][i];
			}
		}
		return tempInput;
	}
	
	public boolean arrayCompare (int[][] tempInput) {
		for (int i=0 ; i<9 ; i++) {
			for (int j=0 ; j<9 ; j++) {
				if(tempInput[j][i] != input[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
}
