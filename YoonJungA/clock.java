package p_st3;

import java.util.Scanner;

public class clock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double min = ((double)60/11)*N;
		if(N==12) System.out.println("0.000000");
		else if(min>59.999999) System.out.println("CAN'T SEE!");
		else System.out.printf("%.6f\n",min);
	}
}
