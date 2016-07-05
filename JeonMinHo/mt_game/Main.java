package mt_game;
import java.util.Scanner;


public class Main {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T;
		int test_case;

		T = sc.nextInt();        
		for(test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			StringBuffer result = new StringBuffer();
			for(int i = 0; i < c; i++) {
				int n = sc.nextInt();
				int k = sc.nextInt();
				int r = (n-1)%(1+k);
				if(a == 1 && b == 1) {
					if(r != 0) {
						result.append("a");
					} else {
						result.append("b");
					}
				} else {
					int count = n/(1+k);
					
					int index = (count+1) % (a+b);
					if(index <= a)
						result.append("a");
					else
						result.append("b");
				}
								
			}
			System.out.println("Case #" + test_case);
			System.out.println(result.toString());
		}
	}
}