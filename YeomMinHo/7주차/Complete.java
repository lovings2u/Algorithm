import java.util.Scanner;

public class Complete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		
		num = sc.nextInt();
		
		for(int i=1 ; i<num ; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		
		if(sum==num) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}

}
