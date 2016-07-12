import java.util.*;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int n = kbd.nextInt();
		int pi [] = new int[n];
		for(int i=0; i<n; i++)
			pi[i] = kbd.nextInt();
		
		Arrays.sort(pi);
			
		int result [] = new int[pi.length];
		
		for(int i=0; i<pi.length; i++)
			for(int j=0; j<=i; j++)
				result[i] += pi[j];
		
		int total = 0;
		
		for(int i=0; i<result.length; i++)
			total += result[i];
		
		System.out.println(total);
		
		
	}
}
