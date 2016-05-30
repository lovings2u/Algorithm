import java.util.Scanner;

public class Calorie {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		int calorie=0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		switch(a) {
			case 1 : 
				calorie += 461;
				break;
			case 2 :
				calorie += 431;
				break;
			case 3 :
				calorie += 420;
				break;
			case 4 :
				break;
		}
		
		switch(b) {
			case 1 : 
				calorie += 130;
				break;
			case 2 :
				calorie += 160;
				break;
			case 3 :
				calorie += 118;
				break;
			case 4 :
				break;
		}
		
		switch(c) {
			case 1 : 
				calorie += 100;
				break;
			case 2 :
				calorie += 57;
				break;
			case 3 :
				calorie += 70;
				break;
			case 4 :
				break;
		}
		
		switch(d) {
			case 1 : 
				calorie += 167;
				break;
			case 2 :
				calorie += 266;
				break;
			case 3 :
				calorie += 75;
				break;
			case 4 :
				break;
		}
		
		System.out.println("Your total Calorie count is " + calorie + ".");
	}
}
