import java.util.Scanner;

public class Odd {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		int result=0;
		int min=100;
		
		for (int i=0 ; i<=6 ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0 ; i<=6 ; i++) {
			if (arr[i]%2 == 1) {
				result += arr[i];
				min = Math.min(min, arr[i]);
			}
		}
		
		if(result==0) {
			System.out.println("-1");
		} else {
			System.out.println(result);
			System.out.println(min);
		}
	}
}
