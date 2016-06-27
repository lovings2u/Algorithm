package fibonacci;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> inputList = new LinkedList<Integer>();
		while(true) {
			int number = sc.nextInt();
			if(number < 2)
				break;
			inputList.add(number);
		}
		int index = 1;
		Iterator<Integer> iter = inputList.iterator();
		while(iter.hasNext()) {
			int input = iter.next();
			int[] array = {fibo(input), fibo(input-1)};
			System.out.printf("Case #%d:\n", index);
			if(input%2 == 0) {
				System.out.println((array[0] + array[1]) + ", " + array[0] + "\n");
			} else { 
				System.out.println(array[0] + ", " + (array[0] + array[1]) + "\n");
			}
			index++;
		}

	}

	private static int fibo(int n) {
		if (n <= 1)
			return n;
		else
			return fibo(n - 2) + fibo(n - 1);
	}
}
