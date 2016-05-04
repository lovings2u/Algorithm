package j510;

import java.util.Scanner;

public class calorie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] burger={461,431,420,0};
		int [] drink={130,160,118,0};
		int [] side={100,57,70,0};
		int [] desert={167,266,75,0};
		int c1,c2,c3,c4,total;
		
		c1=sc.nextInt();
		c2=sc.nextInt();
		c3=sc.nextInt();
		c4=sc.nextInt();
		total=burger[c1-1]+drink[c2-1]+side[c3-1]+desert[c4-1];
		System.out.println("Your total Calorie count is "+total+".");
		

	}

}
