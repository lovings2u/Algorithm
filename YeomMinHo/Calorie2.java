import java.util.Scanner;

public class Calorie2 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int bugger[] = {0,461,431,420,0};
		int drink[] = {0,130,160,118,0};
		int side[] = {0,100,57,70,0};
		int dessert[] = {0,167,266,75,0};
		int a,b,c,d;
		int calorie=0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		calorie = bugger[a] + drink[b] + side[c] + dessert[d];
		System.out.println("Your total Calorie count is " + calorie + ".");
	}
}
