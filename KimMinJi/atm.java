import java.util.Arrays;
import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(),sum=0,res=0;
		int []p = new int [n];
		
		for(int i=0;i<n;i++){
			p[i]=sc.nextInt();
		}
		Arrays.sort(p);
		for(int i=0;i<n;i++){
			sum+=p[i];
			res+=sum;
		}
		System.out.println(res);
	}

}
