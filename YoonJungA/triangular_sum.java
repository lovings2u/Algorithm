package c0620;

import java.util.Scanner;

public class triangular_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		int temp = 1; //t(1)=1;
		
		for(int i=1;i<=n;i++){
			temp+=i+1; //t´©Àû 
			result += (i*temp); 
		}
		
		System.out.println(result);
	}

}
