package distributed;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		for(int i = 0; i < count; i++) {
			LinkedHashSet<Integer> num = new LinkedHashSet<>();
			int a = sc.nextInt();
			for(int j = 1; j < 5; j++) {
				num.add((int)Math.pow(a, j)%10);
			}
			
			int b = sc.nextInt();
			
			int index = (b-1) % num.size();
			Object[] numArray = num.toArray();
			if((int)numArray[0] == 0) {
				System.out.println(10);
				return;
			}
			System.out.println(numArray[index]);
		}
	}
}
