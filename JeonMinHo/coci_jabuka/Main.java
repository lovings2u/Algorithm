package coci_jabuka;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int tmp1 = input1;
		int tmp2 = input2;
		
		while(tmp1 != 0) {
			if(tmp1 < tmp2) {
				int temp = tmp1;
				tmp1 = tmp2;
				tmp2 = temp;
			}
			tmp1 -= tmp2;
		}
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 1; i <= tmp2; i++) {
			if(tmp2%i == 0) {
				list.add(i);
			}
		}
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			int tmp = iter.next();
			System.out.println(tmp + " " + (input1/tmp) + " " + (input2/tmp));
		}
	}
}
