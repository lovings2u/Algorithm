package complete;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1; i < number; i++) {
			if(number % i == 0)
				sum += i;
		}
		if(sum == number)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
