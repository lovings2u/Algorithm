package ft;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0; 
		long mul = 1;
		ArrayList<Integer> b = new ArrayList<>();
		
		for(int i = 1; i <= a; i++) {
			if(a%i == 0){
				b.add(i);
			}
		}
		for (Integer i : b) {
			sum += i;
		}
		for (Integer i : b) {
			mul *= i;
			mul = mul%10;
		}
		for (Integer i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(b.size());
		System.out.println(sum);
		System.out.println(mul);
	}
}
