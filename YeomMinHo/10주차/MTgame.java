import java.util.Scanner;

public class MTgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b, repeat;
		int[] end_num;
		int[] max_num;
		int test_case;
		String temp;
		
		test_case = sc.nextInt();
		String[] result = new String[test_case];
		
		for (int i=0 ; i<test_case ; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			repeat = sc.nextInt();
			temp = "";
			
			end_num = new int[repeat];
			max_num = new int[repeat];
			
			for (int j=0 ; j<repeat ; j++) {
				end_num[j] = sc.nextInt();
				max_num[j] = sc.nextInt();
				
				while(true) {	
					if (end_num[j] > a && end_num[j] < a * max_num[j] + b) {	// a가 이길 경우
						temp += "a";
						break;
					} else {
						end_num[j] -= a * max_num[j];
					}
					
					if (end_num[j] > b && end_num[j] < b * max_num[j] + a) {	// b가 이길 경우
						temp += "b";
						break;
					} else {
						end_num[j] -= b * max_num[j];
					}
				}
				
			}
			
			result[i] = temp;
		}
		
		for (int i=0 ; i<test_case ; i++) {
			if (result[i] == null) {
				break;
			}
			
			System.out.println("Case #" + (i+1));	
			System.out.println(result[i]);
		}
	}
}