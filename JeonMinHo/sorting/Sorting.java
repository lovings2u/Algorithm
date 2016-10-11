package sorting;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] targetArray = new int[count];
		for(int i = 0; i < count; i++) {
			targetArray[i] = sc.nextInt();
		}
		Sorting sort = new Sorting();
		
		int[] bubble = sort.bubbleSort(targetArray);
		for (int i : bubble) {
			System.out.print(i + " ");
		}
		System.out.println();
		int[] select = sort.selectionSort(targetArray);
		for (int i : select) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public int[] bubbleSort(int[] bubbleSort) {
		for(int i = 0; i < bubbleSort.length; i++) {
			for(int j = 1; j < bubbleSort.length-i; j++) {
				if(bubbleSort[j-1] > bubbleSort[j]) {
					int temp = bubbleSort[j-1];
					bubbleSort[j-1] = bubbleSort[j];
					bubbleSort[j] = temp;
				}
			}
		}
		return bubbleSort;
	}
	
	public int[] selectionSort(int[] selectionSort) {
		for(int i = 0; i < selectionSort.length-1; i++) {
			int min = i;
			for(int j = i; j < selectionSort.length; j++) {
				if(selectionSort[j] < selectionSort[min])
					min = j;
			}
			int temp = selectionSort[min];
			selectionSort[min] = selectionSort[i];
			selectionSort[i] = temp;
		}
		return selectionSort;
	}
	
}
