package c0701;

import java.util.Scanner;

public class chemistry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double result [] = new double[1000];
		int count=0;
		double temp=10.0;
		
		while(true){
			temp = sc.nextDouble();
			if(temp==999) break;
			result[count]=temp;				
			count++;
		}
		
		for(int i=0;i<count-1;i++){
			float fff = (float)(result[i+1]-result[i]);
			System.out.printf("%.2f",fff);
			System.out.println();
		}
		System.out.println("End of Output");
	}

}
