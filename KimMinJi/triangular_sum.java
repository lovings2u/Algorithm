import java.util.Scanner;

public class triangular_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++){
			sum+=i*(((i+2)*(i+1))/2);
		}
		System.out.println(sum);

	}

}
