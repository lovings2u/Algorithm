import java.util.Scanner;

public class chemistry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble(),b=sc.nextDouble();
		
		while(b!=999){
			System.out.printf("%.2f\n",b-a);
			a=b;
			b=sc.nextDouble();
			
		}
		System.out.println("End of Output");		
	}

}
