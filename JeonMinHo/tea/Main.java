package tea;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		
		if(people%2 == 0) {
			int table = people/2;
			System.out.println(table*(table-1));
		} else {
			int table = (people+1)/2;
			System.out.println((table-1)*(table-1));
		}
	}
}
