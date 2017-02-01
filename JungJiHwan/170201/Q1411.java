package JungOl;

import java.util.Scanner;

public class Q1411 {
	public static void main(String[] args) {new Q1411();}
	public Q1411() {
		int num = new Scanner(System.in).nextInt();
		int arr[] = new int[num + 1];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2; i<=num; i++){
			arr[i] = arr[i-1] + 2*arr[i-2];
			arr[i] %= 20100529;
		}
		
		System.out.println(arr[num]);
	}
}