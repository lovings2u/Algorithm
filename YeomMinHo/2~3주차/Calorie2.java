import java.util.Scanner;

public class Calorie2 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int bugger[] = {461,431,420,0};
		int drink[] = {130,160,118,0};
		int side[] = {100,57,70,0};
		int dessert[] = {167,266,75,0};
		int a,b,c,d;
		int calorie=0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		calorie = bugger[a+1] + drink[b+1] + side[c+1] + dessert[d+1];
		System.out.println("Your total Calorie count is " + calorie + ".");
	}
}
