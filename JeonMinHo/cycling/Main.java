package cycling;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int[] loadArray = new int[arraySize];
		for(int i = 0; i < arraySize; i++) {
			loadArray[i] = sc.nextInt();
		}
		int startNum = -1, endNum = -1;
		LinkedList<int[]> increaseList = new LinkedList<int[]>();
		for(int i = 0; i < arraySize-1; i++) {
			if(loadArray[i] - loadArray[i+1] < 0) {
				if(startNum == -1) {
					startNum = loadArray[i];
				}
				endNum = loadArray[i+1];
			} else if(loadArray[i] == loadArray[i+1]) {
				startNum = -1;
				endNum = -1;
			}
			if(endNum != -1) {
				int[] numArray = {startNum, endNum};
				increaseList.add(numArray);
				endNum = -1;
			} else {
				startNum = -1;
			}
		}
		if(increaseList.isEmpty()) {
			System.out.println(0);
			return;
		}
		int result = -1;
		Iterator<int[]> iter = increaseList.iterator();
		while(iter.hasNext()) {
			int[] array = iter.next();
			result = Math.max(result, array[1] - array[0]);
		}
		System.out.println(result);
		
	}
}
