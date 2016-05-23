package numbers;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int index = 0;
		int result = number;
		while(result != 6174) {
			index++;
			result = makeNum(result);
		}
		System.out.println(index);
		
	}
	static int makeNum(int number) {
		LinkedList<Integer> numList = new LinkedList<Integer>();

		for(int i = 1000; i > 0; i /= 10) {
			numList.add(number/i);
			number -= (number/i)*i;
		}
		Collections.sort(numList);
		int maxNum = 0;
		int minNum = 0;
		int i = 1000;
		Iterator<Integer> ascIter = numList.iterator();
		Iterator<Integer> desIter = numList.descendingIterator();
		while(ascIter.hasNext()) {
			minNum += ascIter.next() * i;
			i /= 10;
		}
		i = 1000;
		while(desIter.hasNext()) {
			maxNum += desIter.next() * i;
			i /= 10;
		}
		return maxNum - minNum;
		
	}
}
