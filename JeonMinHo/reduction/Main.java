package reduction;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int change = 0;
		int[] a = {sc.nextInt(), sc.nextInt()};
		if(a[1] > a[0]) {
			change = a[0];
			a[0] = a[1];
			a[1] = change;
		}
		int[] b = {sc.nextInt(), sc.nextInt()};
		if(b[1] > b[0]) {
			change = b[0];
			b[0] = b[1];
			b[1] = change;
		}
		int resultMax, resultMin = 0;
		
		resultMax = (int)((b[0]/(double)a[0])*100);
		resultMin = (int)((b[1]/(double)a[1])*100);
        
		int result = Math.min(resultMax, resultMin);
		if (result >= 100) {
			result = 100;
		}
		System.out.printf("%d%%", result);
		
	}
}
