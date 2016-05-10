package level1_2;

import java.util.Scanner;

public class calorie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int burger[] = {461,431,420,0};
		int drink[] = {130,160,118,0};
		int side[] = {100,57,70,0};
		int dessert[] = {167,266,75,0};
		
		int cal=0;
		cal += burger[(sc.nextInt()-1)];
		cal += drink[(sc.nextInt()-1)];
		cal += side[(sc.nextInt()-1)];
		cal += dessert[(sc.nextInt()-1)];
		
		System.out.println("Your total Calorie count is "+cal+".");
	}
}
