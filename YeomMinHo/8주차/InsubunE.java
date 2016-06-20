import java.util.Scanner;

public class InsubunE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int result=0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		for (int i=1 ; i<=a ; i++) {
			if (i*(a-i) == b) {
				result = i;
				break;
			}	
		}
		
		if(result==0) {
			System.out.println("impossible");
		} else {
			System.out.print("(x-" + result + ")(x-" + (a-result) + ")");	
		}
	}
}
