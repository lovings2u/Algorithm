package c0620;

import java.util.Scanner;

public class beat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int d = sc.nextInt();
		
		double big = (s+d)/2.0;
		double small = (s-d)/2.0;
		
		if(big<0||small<0) //음수 체크
			System.out.println("impossible");
		else if(Math.ceil(big)!=big||Math.ceil(small)!=small) //올렸을때 원래수와 동일한지 체크
			System.out.println("impossible");
		else
			System.out.println((int)big+" "+(int)small);
				
	}

}
