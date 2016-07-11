package ATM_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] people = new int[size];
		
		for(int i = 0; i < size; i++) {
			people[i] = sc.nextInt();
		}
		
		Arrays.sort(people);
		
		int time = 0, prev = 0;
		for (int i : people) {
			time += prev + i;
			prev += i;
		}
		
		System.out.println(time);
		
		
	}
}
