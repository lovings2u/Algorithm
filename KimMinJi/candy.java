package candy;

import java.util.Scanner;


public class candy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int candy = sc.nextInt();
		int money = sc.nextInt();
		int money1,a,b;
		
		money1=(int)Math.pow(10,money);
		a=(int)money1/2;
		b=(int)(candy%(money1));
		
		if(a>b)
		    System.out.println(candy-b);
		else
		    System.out.println(candy+a-((candy+a)%money1));
		
		
	}

}
