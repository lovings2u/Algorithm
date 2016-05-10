package level1_2;

import java.util.Scanner;

public class tiles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double row=sc.nextDouble();
		double col=sc.nextDouble();
		
		int all =  (int)Math.ceil(row/8)*(int)Math.ceil(col/8);
		int whole =(int)Math.floor(row/8)*(int)Math.floor(col/8);
		
		System.out.println("The number of whole tiles is "+whole+" part tiles is "+(all-whole));
	}
}
