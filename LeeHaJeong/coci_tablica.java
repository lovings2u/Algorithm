import java.util.Scanner;
public class coci_tablica {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int a [] = new int [2];
		int b [] = new int [2];
		
		a[0] = kbd.nextInt();	a[1] = kbd.nextInt();
		b[0] = kbd.nextInt();	b[1] = kbd.nextInt();
		
		double max = 0;
		int max_count = 0;
		int n = 0;
		
		while(n<4){
			double result = (a[0]/(double)b[0]) + (a[1]/(double)b[1]);
			if(result > max){
				max = result;
				max_count = n;
			}
			
			int temp = a[1];
			a[1] = a[0];
			a[0] = b[0];
			b[0] = b[1];
			b[1] = temp;
			
			n++;
		}
		System.out.println(max_count);
	}
}
