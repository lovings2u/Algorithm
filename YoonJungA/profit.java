package p_st3;

import java.util.Scanner;

public class profit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int p1 = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		
		double p2 = (p1*(1+(b*0.01)))*(1-(c*0.01));
		double profit = p2-p1;
		
		if(profit<0) System.out.println("loss");
		else System.out.println(Math.round(profit));	
	}
}
