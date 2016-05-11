package odd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		int count = 0;
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			int n = sc.nextInt();
			if(odd(n)){
				a[i] = n;
				count++;
				sum += n;
			}
		}
		if(count == 0) {
			System.out.println(-1);
			return;
		}
		
		for(int i = a.length-1; i > 1; i--) {
			for(int j = 0; j<i; j++) {
				if(a[j] > a[j+1]){
					int c = a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				}
			}
		}
		System.out.println(sum);
		System.out.println(a[a.length-count]);
	}
	static boolean odd(int a){
		return a%2==1;
	}
}
