import java.util.Scanner;
public class triangular_sum {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		int result = 0;
		for(int i=1; i<=n; i++){
			int tk = (i+1)*(i+2)/2;
			result += i*tk;
		}
		System.out.println(result);
	}
}
