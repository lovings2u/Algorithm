package study5;

import java.util.Scanner;

public class can {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int black =sc.nextInt();
		int white =sc.nextInt();
		
		//ÇÏ¾á ÄáÀÌ È¦¼öÀÎ °æ¿ì ÇÏ¾á ÄáÀÌ ³²°í, ÇÏ¾á ÄáÀÌ Â¦¼öÀÎ °æ¿ì °ËÀº ÄáÀÌ ³²´Â´Ù.
		
		if(white%2==0) System.out.println("black");
		else System.out.println("white");
	}
}
