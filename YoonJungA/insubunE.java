package c0620;

import java.util.Scanner;

public class insubunE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		
		//근의공식
		double result1 = (a+Math.sqrt(a*a-4*b))/2.0;
		double result2 = (a-Math.sqrt(a*a-4*b))/2.0;
		
		if(Math.ceil(result1)!=result1||Math.ceil(result2)!=result2)
			System.out.println("impossible");
		else
			System.out.println("(x-"+(int)Math.min(result1, result2)+")(x-"+(int)Math.max(result1, result2)+")");

	}

}
