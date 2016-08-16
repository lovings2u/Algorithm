package sudoku;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static int[][] pan;
	private static boolean hasZero() {
		for(int i = 0; i < pan.length; i++) {
			for(int j = 0; j < pan.length; j++) {
				if(pan[i][j] == 0)
					return false;
			}
		}
		return true;
	}
	private static void checkZeroVer() {
		LinkedList<Integer> list = new LinkedList<>();

		for(int i = 0; i < pan.length; i++) {
			list.clear();
			int zeroIndex = 0;
			for(int k = 1; k <= 9; k++) {
				list.add(k);
			}
			for(int j = 0; j < pan[0].length; j++) {
				int tmp = pan[j][i];
				if(tmp == 0){
					zeroIndex = j;
					continue;
				}
				if(list.contains(tmp)){
					list.remove(list.indexOf(tmp));
				}
			}
			if(list.size() == 1) {
				pan[zeroIndex][i] = list.getLast();
			}
		}
	}
	private static void checkZeroHor() {
		LinkedList<Integer> list = new LinkedList<>();

		for(int i = 0; i < pan.length; i++) {
			list.clear();
			int zeroIndex = 0;
			for(int k = 1; k <= 9; k++) {
				list.add(k);
			}
			for(int j = 0; j < pan[0].length; j++) {
				int tmp = pan[i][j];
				if(tmp == 0){
					zeroIndex = j;
					continue;
				}
				if(list.contains(tmp)){
					list.remove(list.indexOf(tmp));
				}
			}
			if(list.size() == 1) {
				pan[i][zeroIndex] = list.getLast();
			}
		}
	}
	private static void checkEachNine() {
		LinkedList<Integer> list = new LinkedList<>();
		int zeroIndexX = 0;
		int zeroIndexY = 0;
		for(int a = 0; a < pan.length; a += 3) {
			for(int i = 0; i < pan.length; i++) {
				int[][] tmp;
				if(i % 3 == 0) {
					tmp = new int[3][3];
					list.clear();
					for(int k = 1; k <= 9; k++) {
						list.add(k);
					}
				}
				for(int j = 0 + a; j < 3+a; j++) {
					int k = pan[i][j];
					if( k == 0) {
						zeroIndexX = i;
						zeroIndexY = j;
						continue;
					}
					if(list.contains(k))
						list.remove(list.indexOf(k));
				}
				if(list.size() == 1) {
					pan[zeroIndexX][zeroIndexY] = list.getLast();
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pan = new int[9][9];
		LinkedList<Integer> list = new LinkedList<>();
		int count = 0;
		for(int i = 0; i < pan.length; i++) {
			for(int j = 0; j < pan[0].length; j++) {
				int tmp = sc.nextInt();
				pan[i][j] = tmp;
			}
		}
		while(!hasZero() && count <= 3) {
			checkZeroVer();
			checkZeroHor();
			checkEachNine();
			count++;
		}
		for(int i = 0; i < pan.length; i++) {
			for(int j = 0; j < pan[0].length; j++) {
				System.out.print(pan[i][j] + " ");
			}
			System.out.println();
		}
	}
}
