package lining;

import java.util.Scanner;

public class Main {
	private static int[] kids; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		kids = new int[sc.nextInt()+1];
		for(int i = 0; i < kids.length; i++) {
			if(i == 0) {
				kids[i] = 0;
				continue;
			}
			kids[i] = sc.nextInt();
		}
		int count = 0;
		while(checkNum() != 0) {
			int startIndex = checkNum();
			int endIndex = findNum(startIndex);
			//System.out.println(startIndex + " " + endIndex);
			int temp = kids[endIndex];
			switchPosition(startIndex, endIndex);
			kids[startIndex] = temp;
			count ++;
			//printKids();
		}
		System.out.println(count);
	}
	
	private static int checkNum() {
		for(int i = 0; i < kids.length; i++) {
			if(kids[i] != i)
				return i;
		}
		return 0;
	}
	private static int findNum(int num) {
		for(int i = 0; i < kids.length; i++) {
			if(kids[i] == num)
				return i;
		}
		return 0;
	}
	private static void switchPosition(int startPos, int endPos) {
		for(int i = endPos; i > startPos; i--)
			kids[i] = kids[i-1];
	}
	private static void printKids() {
		for (int i : kids) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
