package coci_sok;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] juice = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
		double[] rate = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
		double[] left = new double[3];
		for(int i = 0; i<rate.length; i++) {
			left[0] = juice[0] - (rate[0]*(juice[i]/rate[i]));
			left[1] = juice[1] - (rate[1]*(juice[i]/rate[i]));
			left[2] = juice[2] - (rate[2]*(juice[i]/rate[i]));
			
			if(!(left[0] < 0 || left[1] < 0 || left[2] < 0))
				break;
		}
		for(int i = 0; i < left.length; i++){
			System.out.print(left[i]%1 == 0? (int)left[i]:makeDouble(left[i]));
			System.out.print(" ");
		}
	}
	private static double makeDouble(double a) {
		
		return Math.round(a*1000000)/1000000.0;
	}

}
