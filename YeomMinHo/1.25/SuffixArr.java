import java.util.Scanner;
import java.util.Arrays;

public class SuffixArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		input = sc.nextLine();
		String[] arr = new String[input.length()];
		
		for (int i=0 ; i<arr.length ; i++) {
			arr[i] = input.substring(i, arr.length);
		}
		
		Arrays.sort(arr);
		for (int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

}
