import java.util.Scanner;

public class Dprocessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case;
		int a, b;
		
		test_case = sc.nextInt();
		int[] result = new int[test_case];
		
		for (int i=0 ; i<test_case ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();

			result[i] = 1;
			for (int j=0 ; j<b ; j++) {
				result[i] *= a;
				result[i] = result[i]%10;
			}
			
			if (result[i] == 0) {
				result[i] = 10;
			}
		}
		
		for (int i=0 ; i<test_case ; i++) {
			System.out.println(result[i]);
		}
	}
}
